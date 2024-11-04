package org.example.service;

import org.example.dto.Book;

import java.util.List;

public interface BookService {
    List<Book>getall();
    void addBook(Book book);
    Book searchBookById(Integer id);
    void deleteBookById(Integer id);
    void updateBookById(Book book);
}
