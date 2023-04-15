package com.kh.post.controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;

import com.kh.common.MyFileRenamePolicy;
import com.kh.common.model.vo.Attachment;
import com.kh.post.model.service.PostService;
import com.kh.post.model.vo.Post;
import com.oreilly.servlet.MultipartRequest;

/**
 * Servlet implementation class ReviewPostUpdateController
 */
@WebServlet("/rupdate.po")
public class ReviewPostUpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReviewPostUpdateController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		if(ServletFileUpload.isMultipartContent(request)) {
			int maxSize = 10 * 1024 * 1024;
			String savePath = request.getSession().getServletContext().getRealPath("/resources/post_upfiles/");		
			MultipartRequest multiRequest = new MultipartRequest(request, savePath, maxSize, "UTF-8", new MyFileRenamePolicy());
			
			int PostNo = Integer.parseInt(multiRequest.getParameter("pno"));
			String title = multiRequest.getParameter("title");
			String content = multiRequest.getParameter("content");
			
			Post p = new Post();
			p.setPostNo(PostNo);
			p.setPostTitle(title);
			p.setPostContent(content);
			
			Attachment at = null;
			
			if(multiRequest.getOriginalFileName("reUpfile") != null) {
				at = new Attachment();
				
				at.setOriginName(multiRequest.getOriginalFileName("reUpfile"));
				at.setChangeName(multiRequest.getFilesystemName("reUpfile"));
				at.setFilePath("resources/post_upfiles/");
				
				if(multiRequest.getParameter("originFileNo") != null) {
					
					at.setFileNo(Integer.parseInt(multiRequest.getParameter("originFileNo")));

					new File(savePath + multiRequest.getParameter("originFileName")).delete();
					
				}else {
					
					at.setPostNo(PostNo);
					
				}
				
			}
			int result = new PostService().updatePost(p, at);
			
			if(result > 0) {
				request.getSession().setAttribute("alertMsg", "게시글 수정 성공");
				response.sendRedirect(request.getContextPath() + "/rdetail.bo?pno=" + PostNo); 
			} else {
				request.setAttribute("errorMsg", "게시글 수정 실패");
				request.getRequestDispatcher("views/common/errorPage.jsp").forward(request, response);
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
