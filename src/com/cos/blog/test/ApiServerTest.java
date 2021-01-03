package com.cos.blog.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// localhost:8080/blog/test (GET, POST)
@WebServlet("/test")
public class ApiServerTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
<<<<<<< HEAD
       
=======

>>>>>>> f146f610a4f1842e2cbf61401f4fec0fda12f498
    public ApiServerTest() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
<<<<<<< HEAD
		
=======

>>>>>>> f146f610a4f1842e2cbf61401f4fec0fda12f498
//		String mime = request.getContentType();
//		System.out.println(mime);
//		request.setCharacterEncoding("UTF-8");
//		if(mime.equals("application/json")) {
//			
//			BufferedReader br = request.getReader();
//			String input;
//			StringBuffer buffer = new StringBuffer();
//			while((input = br.readLine()) != null) {
//				buffer.append(input);
//			}
//			System.out.println(buffer.toString());
//		}else {
//			String food = request.getParameter("food");
//			String method = request.getParameter("method");
//			System.out.println(food);
//			System.out.println(method);
//		}
<<<<<<< HEAD
		
	
=======


>>>>>>> f146f610a4f1842e2cbf61401f4fec0fda12f498
		// DB에 insert 하고 끝
		response.setContentType("text/html; charset=utf-8"); 
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>안녕</h1>");
		out.println("</body>");
		out.println("<html>");
		out.flush();
	}

<<<<<<< HEAD
}
=======
}
>>>>>>> f146f610a4f1842e2cbf61401f4fec0fda12f498
