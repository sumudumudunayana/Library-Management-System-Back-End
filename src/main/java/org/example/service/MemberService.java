package org.example.service;

import org.example.dto.Book;
import org.example.dto.Member;

import java.util.List;

public interface MemberService {
    List<Member> getall();
    void addMember(Member member);
    Member searchMemberById(Integer id);
    void deleteMemberById(Integer id);
    void updateMemberById(Member member);
}
