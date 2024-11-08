package org.example.service;

import lombok.RequiredArgsConstructor;
import org.example.dto.Member;
import org.example.entity.MemberEntity;
import org.example.repository.MemberRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {

    private final MemberRepository repository;
    private final ModelMapper mapper;

    @Override
    public List<Member> getall() {
        List<Member> memberArrayList = new ArrayList<>();
        repository.findAll().forEach(entity ->{
            memberArrayList.add(mapper.map(entity, Member.class));
        });
        return memberArrayList;
    }

    @Override
    public void addMember(Member member) {
        repository.save(mapper.map(member, MemberEntity.class));
    }

    @Override
    public Member searchMemberById(Integer id) {
        return mapper.map(repository.findById(id), Member.class);
    }

    @Override
    public void deleteMemberById(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public void updateMemberById(Member member) {
        repository.save(mapper.map(member, MemberEntity.class));
    }
}
