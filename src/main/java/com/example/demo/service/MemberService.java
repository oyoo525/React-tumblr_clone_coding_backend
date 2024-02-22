package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Member;
import com.example.demo.mapper.MemberMapper;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class MemberService {
	
	@Autowired
	private MemberMapper memberMapper;
	
	
	public List<Member> getMemberList() {
		List<Member> mList = memberMapper.getMemberList();
		return mList;
	}

}
