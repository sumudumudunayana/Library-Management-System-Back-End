package org.example.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.example.dto.Book;
import org.example.dto.Member;
import org.example.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequiredArgsConstructor
@RequestMapping("member")
public class MemberController {
    @Autowired
    final MemberService service;

    @GetMapping("/get-allMembers")
    public List<Member> getMember(){
        return service.getall();
    }

    @PostMapping("/add-member")
    public void addMember(@Valid @RequestBody Member member){
        service.addMember(member);
    }

    @GetMapping("/searchMember-by-id/{id}")
    public Member getMemberById(@PathVariable Integer id){
        return service.searchMemberById(id);
    }

    @DeleteMapping("/deleteMember-by-id/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void deleteMemberById(@PathVariable Integer id){
        service.deleteMemberById(id);
    }

    @PutMapping("/update-member")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void updateMember(@RequestBody Member member){
        service.updateMemberById(member);
    }
}
