package org.example.service;

import org.example.dto.Book;
import org.example.dto.Borrower;

import java.util.List;

public interface BorrowerService {
    List<Borrower> getall();
    void addBorrower(Borrower borrower);
    Borrower searchBorrowerById(Integer id);
    void deleteBorrowerById(Integer id);
    void updateBorrowerById(Borrower borrower);
}
