package com.kh.member.model.service;

import static com.kh.common.JDBCTemplate.*;

import java.sql.Connection;

import com.kh.member.model.dao.MemberDao;
import com.kh.member.model.vo.Member;

public class MemberService {

	// 로그인 요청 서비스
	public Member loginMember(Member m) {
		
		Connection conn = getConnection();
		
		Member loginUser = new MemberDao().loginMember(conn, m);
		
		close(conn);
		
		return loginUser;		
	}
	
	// 회원가입 서비스
	public int insertMember(Member m) {
		
		Connection conn = getConnection();
		
		int result = new MemberDao().insertMember(conn, m);
		
		close(conn);
		
		return result;
	}
	
	// 아이디 중복 확인
	public int idCheck(String checkId) {
		
		Connection conn = getConnection();
		
		int count = new MemberDao().idCheck(conn, checkId);
		
		close(conn);
		
		return count;		
	}
	
	// 닉네임 중복 확인
	public int nicknameCheck(String checkNickname) {

		Connection conn = getConnection();
		
		int count = new MemberDao().nicknameCheck(conn, checkNickname);
		
		close(conn);
		
		return count;
	}
	
	
}
