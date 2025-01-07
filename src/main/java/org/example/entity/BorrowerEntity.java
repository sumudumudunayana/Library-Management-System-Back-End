package org.example.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "borrower")
public class BorrowerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer borrowerId;

    @NotNull(message = "Member ID is required")
    @Min(value = 1, message = "Member ID must be greater than 0")
    @Max(value = 99999, message = "Member ID must be 5 digits or less")
    private Integer membersId;

    @NotNull(message = "Book ID is required")
    @Min(value = 1, message = "Book ID must be greater than 0")
    @Max(value = 99999, message = "Book ID must be 5 digits or less")
    private Integer booksId;

    @NotNull(message = "Duration is required")
    @Min(value = 1, message = "Duration must be at least 1 day")
    @Max(value = 99, message = "Duration must be 2 digits or less")
    private Integer duration;

    @Size(min = 2, message = "Borrower name must be at least 2 characters long")
    private String borrowerName;

    @NotNull(message = "Phone number is required")
    private String borrowerContact;
}
