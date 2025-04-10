package com.pp.controller;

import java.util.ArrayList;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
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
@CrossOrigin(origins = "http://localhost:3000")
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
	
	
	@PostMapping("/join") // 내가 수행하고자 하는 요청
	public String join(Model model, MemberDTO dto) {
		
		// 회원가입을 위한 정보를 DB로 넘겨주는 기능 호출
		mapper.join(dto);
		
		// 회원가입에 대한 정보(email)를 가지고 JoinSuccess.jsp 이동!
		// Model 객체를 사용하여 해당 정보 전달!
		model.addAttribute("email", dto.getEmail());
		
		return "JoinSuccess"; // 수행사항이 끝나면 보여질 web화면
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
	
	@GetMapping("/showMember")
	public String showMember(Model model) {
		
		// DB에 저장된 모든 회원의 정보를 가지고 ShowMember 페이지로 이동!
		ArrayList<MemberDTO> list =mapper.showMember();
		
		// 페이지 이동시 model에 전체회원 정보를 담아서 넘겨주기!
		model.addAttribute("list", list);
		
		return "ShowMember";
	}
	

}
