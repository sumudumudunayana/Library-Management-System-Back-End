package org.example.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "book")
public class BookEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer bookId;

    @NotNull(message = "Book name is required")
    private String bookName;

    @NotNull(message = "Book category is required")
    @Size(min = 4, message = "Book category must be above 4 characters")
    private String bookCategory;

    @NotNull(message = "Author is required")
    @Size(min = 2, message = "Author name must be above 2 characters")
    private String bookAuthor;

    @NotNull(message = "Price is required")
    @Min(value = 100, message = "Price must be at least 100")
    private Integer bookPrice;

    @NotNull(message = "Qty is required")
    @Min(value = 1, message = "Qty must be at least 1")
    private Integer bookQty;
}
