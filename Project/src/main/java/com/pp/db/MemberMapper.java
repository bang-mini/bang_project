package com.pp.db;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

import com.pp.model.MemberDTO;

@Mapper
public interface MemberMapper {

	// 실제로 데이터베이스와 연결되어 실행할 sql을 전달해 주는 클래스!

	public int join(MemberDTO dto);
	// ====> join과 연결된 sql 구문 실행 파일인 xml 실행!

	// 로그인이 가능한 sql문장을 연결할 수 있는 추상 메소드 연결!
	public MemberDTO login(MemberDTO dto);

	public void updateMember(MemberDTO dto);

	public ArrayList<MemberDTO> showMember();

	public void delete(String email);

	public MemberDTO checkEmail(String email);

}
