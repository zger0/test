package com.kh.member.model.dao;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import com.kh.member.model.vo.Member;
import static com.kh.common.JDBCTemplate.*;

public class MemberDao {
	
	private Properties prop = new Properties();
	
	public MemberDao() {
		
		String fileName = MemberDao.class.getResource("/sql/member/member-mapper.xml").getPath();
		
		try {
			prop.loadFromXML(new FileInputStream(fileName));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// 로그인 서비스
	public Member loginMember(Connection conn, Member m) {
		
		Member loginUser = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String sql = prop.getProperty("loginMember");
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, m.getUserId());
			pstmt.setString(2, m.getUserPwd());
			
			rset = pstmt.executeQuery();
			
			if(rset.next()) {
				
				loginUser = new Member(rset.getInt("MEMBER_NO")
									 , rset.getString("MEMBER_ID")
									 , rset.getString("MEMBER_PWD")
									 , rset.getString("MEMBER_NICKNAME")
									 , rset.getString("MEMBER_NAME")
									 , rset.getString("EMAIL")
									 , rset.getInt("PHONE")
									 , rset.getString("BIRTH")
									 , rset.getString("GENDER")
									 , rset.getString("ADDRESS")
									 , rset.getString("BLACKLIST")
									 , rset.getInt("MEMBER_POINT")
									 , rset.getString("STATUS"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			
			close(rset);
			close(pstmt);
		}
		
		return loginUser;
	}
	
	// 회원가입 서비스
	public int insertMember(Connection conn, Member m) {
		
		int result = 0;
		PreparedStatement pstmt = null;
		
		String sql = prop.getProperty("insertMember");
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, m.getUserId());
			pstmt.setString(2, m.getUserPwd());
			pstmt.setString(3, m.getUserNickName());
			pstmt.setString(4, m.getUserName());
			pstmt.setString(5, m.getEmail());
			pstmt.setInt(6, m.getPhone());
			pstmt.setString(7, m.getBirth());
			pstmt.setString(8, m.getGender());
			pstmt.setString(9, m.getAddress());
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			
			close(pstmt);
		}
		
		return result;
	}
	
	// 아이디 중복 확인
	
	public int idCheck(Connection conn, String checkId) {
		
		int count = 0;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String sql = prop.getProperty("idCheck");
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, checkId);
			
			rset = pstmt.executeQuery();
			
			if(rset.next()) {
				count = rset.getInt("COUNT(*)");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			
			close(rset);
			close(pstmt);
		}
		
		return count;
	}
	
	// 닉네임 중복 확인
	
	public int nicknameCheck(Connection conn, String checkNickname) {
		
		int count = 0;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String sql = prop.getProperty("nicknameCheck");
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, checkNickname);
			
			rset = pstmt.executeQuery();
			
			if(rset.next()) {
				count = rset.getInt("COUNT(*)");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			
			close(rset);
			close(pstmt);
		}
		
		return count;
	}
	
}
