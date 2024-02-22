package com.example.demo.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties
public class Member {
	
	@JsonProperty
	private String id;
	@JsonProperty
	private String name;
	@JsonProperty
	private String pass;
	@JsonProperty
	private String age;
	@JsonProperty
	private String email;
	@JsonProperty
	private Date regDate;

}
