package org.example.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.dto.Book;
import org.example.entity.BookEntity;
import org.example.repository.BookRepository;
import org.example.service.BookService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {

    private final ModelMapper mapper;
    private final BookRepository repository;

    @Override
    public List<Book> getall() {
        List<Book> bookArrayList = new ArrayList<>();
        repository.findAll().forEach(entity ->{
            bookArrayList.add(mapper.map(entity, Book.class));
        });
        return bookArrayList;
    }

    @Override
    public void addBook(Book book) {
        repository.save(mapper.map(book,BookEntity.class));
    }

    @Override
    public Book searchBookById(Integer id) {
        return mapper.map(repository.findById(id), Book.class);

    }

    @Override
    public void deleteBookById(Integer id) {
        repository.deleteById(id);

    }

    @Override
    public void updateBookById(Book book) {
        repository.save(mapper.map(book, BookEntity.class));
    }
}
