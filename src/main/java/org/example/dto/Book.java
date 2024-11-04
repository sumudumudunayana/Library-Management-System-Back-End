package org.example.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Book {
    private Integer bookId;
    private String bookName;
    private String bookCategory;
    private String bookAuthor;
    private Integer bookPrice;
    private Integer bookQty;

}
