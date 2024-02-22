package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.demo.entity.Member;

@Mapper
public interface MemberMapper {
	
	@Select("Select * from Member")
	List<Member> getMemberList();
	
	List<Member> findAll();
	
	
}
