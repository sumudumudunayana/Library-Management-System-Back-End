package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.dto.Book;
import org.example.dto.Borrower;
import org.example.service.BorrowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("borrower")
@RequiredArgsConstructor
public class BorrowerController {

    @Autowired
    final BorrowerService service;

    @GetMapping("/get-all")
    public List<Borrower> getBook(){
        return service.getall();
    }

    @PostMapping("/add-borrower")
    public void addBorrower(@RequestBody Borrower borrower){
        service.addBorrower(borrower);
    }

    @GetMapping("/search-by-id/{id}")
    public Borrower getBorrowerById(@PathVariable Integer id){
        return service.searchBorrowerById(id);
    }

    @DeleteMapping("/delete-by-id/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void deleteBookById(@PathVariable Integer id){
        service.deleteBorrowerById(id);
    }

    @PutMapping("/update-borrower")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void updateBook(@RequestBody Borrower borrower){
        service.updateBorrowerById(borrower);
    }
}
