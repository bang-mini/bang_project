package com.pp.model;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MemberDTO {
	
	private String id;
	private String pw;
	private String name;
	private String nikname;
	private String email;
	private Date birthday;

}
