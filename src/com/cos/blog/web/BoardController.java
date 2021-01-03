package com.cos.blog.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// http://localhost:8080/blog/board
@WebServlet("/board")
public class BoardController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public BoardController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}
<<<<<<< HEAD
	
=======

>>>>>>> f146f610a4f1842e2cbf61401f4fec0fda12f498
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

<<<<<<< HEAD
}
=======
}
>>>>>>> f146f610a4f1842e2cbf61401f4fec0fda12f498
