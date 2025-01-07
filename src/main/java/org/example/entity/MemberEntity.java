package org.example.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "member")
public class MemberEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer memberId;

    @NotBlank(message="name is required")
    @Size(min = 2,max = 30,message = "name must be between 2 and 30 characters")
    private String memberName;

    @NotBlank(message = "email is required")
    @Email(message = "invalid email format")
    private String memberEmail;

    @NotNull(message = "phone number is required")
    @Digits(integer = 10,fraction = 0,message = "phone number must be 10 digits")
    private Integer memberPhone;

    @NotBlank(message = "address is required")
    @Size(min = 2,max = 100,message = "address must be between 2 and 100 characters")
    private String memberAddress;
}
