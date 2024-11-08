package org.example.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Member {
    private Integer memberId;
    private String memberName;
    private String memberEmail;
    private Integer memberPhone;
    private String memberAddress;
}
