package org.example.entity;

import jakarta.persistence.*;
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
    private String memberName;
    private String memberEmail;
    private Integer memberPhone;
    private String memberAddress;
}
