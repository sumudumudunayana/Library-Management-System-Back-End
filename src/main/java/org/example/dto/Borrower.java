package org.example.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Borrower {
    private Integer borrowerId;
    private Integer membersId;
    private Integer booksId;
    private Integer duration;
    private String borrowerName;
    private Integer borrowerContact;
}
