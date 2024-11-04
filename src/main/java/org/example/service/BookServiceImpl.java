package org.example.service;

import lombok.RequiredArgsConstructor;
import org.example.dto.Book;
import org.example.entity.BookEntity;
import org.example.repository.BookRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService{

    private final ModelMapper mapper;
    private final BookRepository repository;

    @Override
    public List<Book> getall() {
        return null;
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
