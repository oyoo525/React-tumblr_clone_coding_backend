package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.entity.Member;
import com.example.demo.mapper.MemberMapper;
import com.example.demo.service.MemberService;

import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class MemberController {
	
	@Autowired
	private MemberService memberService;
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/member")
	public ResponseEntity<List<Member>> getMemberList() {
		List<Member> mList = memberService.getMemberList();		
		return ResponseEntity
				.ok()
				.body(mList);
	}
	

}
