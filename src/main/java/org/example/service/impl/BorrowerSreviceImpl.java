package org.example.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.dto.Book;
import org.example.dto.Borrower;
import org.example.dto.Member;
import org.example.entity.BookEntity;
import org.example.entity.BorrowerEntity;
import org.example.entity.MemberEntity;
import org.example.repository.BorrowerRepository;
import org.example.service.BorrowerService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BorrowerSreviceImpl implements BorrowerService {

    private final ModelMapper mapper;
    private final BorrowerRepository repository;

    @Override
    public List<Borrower> getall() {
        List<Borrower> boeeowerArrayList = new ArrayList<>();
        repository.findAll().forEach(entity ->{
            boeeowerArrayList.add(mapper.map(entity, Borrower.class));
        });
        return boeeowerArrayList;
    }

    @Override
    public void addBorrower(Borrower borrower) {
        repository.save(mapper.map(borrower, BorrowerEntity.class));
    }

    @Override
    public Borrower searchBorrowerById(Integer id) {
        return mapper.map(repository.findById(id), Borrower.class);
    }

    @Override
    public void deleteBorrowerById(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public void updateBorrowerById(Borrower borrower) {
        repository.save(mapper.map(borrower, BorrowerEntity.class));

    }
}
