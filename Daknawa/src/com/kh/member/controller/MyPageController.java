package com.kh.member.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.kh.member.model.vo.Member;

/**
 * Servlet implementation class MyPageController
 */
@WebServlet("/myPage.me")
public class MyPageController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyPageController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession session = request.getSession();
		
		
		
		if(session.getAttribute("loginUser") == null) { // 로그인 하기 전 마이페이지 클릭
			
			session.setAttribute("alertMsg", "로그인 후 이용 가능한 서비스입니다.");
			
			response.sendRedirect(request.getContextPath() + "/enrollForm.me");
		} else { // 로그인 후 마이페이지 클릭
			
			Member m = (Member)session.getAttribute("loginUser");
			
			if(m.getUserId().equals("admin")) {
				
				request.getRequestDispatcher("views/member/adminPage.jsp").forward(request, response);
			} else {
				
				request.getRequestDispatcher("views/member/memberMyPage.jsp").forward(request, response);
			}
			
		}
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
