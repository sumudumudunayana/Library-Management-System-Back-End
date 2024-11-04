package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.dto.Book;
import org.example.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("book")
@RequiredArgsConstructor
public class BookController {
    @Autowired
    final BookService service;

    @GetMapping("/get-book")
    public Book getBook(){
        return new Book(1,"kitten","novel","david",2000,10);
    }

    @PostMapping("/add-book")
    public void addBook(@RequestBody Book book){
        service.addBook(book);
    }

    @GetMapping("/search-by-id/{id}")
    public Book getBookById(@PathVariable Integer id){
        return service.searchBookById(id);
    }

    @DeleteMapping("/delete-by-id/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void deleteBookById(@PathVariable Integer id){
        service.deleteBookById(id);
    }

    @PutMapping("/update-book")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void updateBook(@RequestBody Book book){
        service.updateBookById(book);
    }
}