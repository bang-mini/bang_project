package com.pp.controller;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.pp.db.MemberMapper;
import com.pp.model.MemberDTO;
import com.pp.model.MyUser;


@MapperScan("com.pp.db")
@RequestMapping
@RestController
@CrossOrigin
public class MemberRestController {

	@Autowired
	MemberMapper mapper;

	// React Spring 연결 mapping----------------------------------------------


	@GetMapping("/login")
	public int login(@RequestParam("id") String id, @RequestParam("pw") String pw) {
		System.out.println("로그인 요청됨: " + id + ", " + pw);

		int result = 0;
//  if(로그인성공조건){
//		result=1;
//	}
		return result;
	}

//	@PostMapping("/login")
//	public int login(@RequestBody MyUser user) {
//		System.out.println(user);
//		return 0;
//	}

	// React Spring 연결 mapping-----------------------------------------------

//		// 비동기 통신을 위한 요청값 받기!
//		// controller/checkEmail?checkEmail=?
//		@GetMapping("/checkEmail")
//		@ResponseBody
//		public int checkEmail(@RequestParam("checkEmail") String email) {
//
//			MemberDTO dto = mapper.checkEmail(email);
//
//			if (dto == null) {
//				// 보내준 email이 사용 가능할때! (DB에 저장된 email 없는 경우)
//				return 0;
//			} else {
//				// 보내준 email이 사용 불가능할때 (DB에 저장된 email이 있는 경우)
//				return 1;
//			}
//		}

}
