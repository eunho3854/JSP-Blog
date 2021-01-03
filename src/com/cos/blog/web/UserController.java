package com.cos.blog.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// http://localhost:8080/blog/user
@WebServlet("/user")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public UserController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}
<<<<<<< HEAD
	
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cmd = request.getParameter("cmd");
		
=======

	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cmd = request.getParameter("cmd");

>>>>>>> f146f610a4f1842e2cbf61401f4fec0fda12f498
		// http://localhost:8080/blog/user?cmd=loginForm
		if(cmd.equals("loginForm")) {
			// 서비스 호출
		}else if(cmd.equals("login")) {
			// 서비스 호출
		}
	}

<<<<<<< HEAD
}
=======
}
>>>>>>> f146f610a4f1842e2cbf61401f4fec0fda12f498
