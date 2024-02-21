package com.example.demo.entity;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Feed {
	
	private int no;
	private String title;
	private String writer;
	private String content;
	private Date regDate;

}
