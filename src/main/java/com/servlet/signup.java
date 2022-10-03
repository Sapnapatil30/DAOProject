package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Registration;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.beans.registration;
import com.dao.registerDAO;

/**
 * Servlet implementation class signup
 */
@WebServlet("/signup")
public class signup extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
//		PrintWriter out=response.getWriter();
//		response.setContentType("text/html");
		String user=request.getParameter("uname");
		String pass=request.getParameter("pass");
		String cpass=request.getParameter("cpass");
		String email=request.getParameter("email");
		HttpSession ses=request.getSession();
		ses.setAttribute("username", user);
		
		registration r=new registration();
		r.setUname(user);
		r.setPass(pass);
		r.setCpass(cpass);
		r.setEmail(email);
		registerDAO u=new registerDAO();
		boolean b=u.insertdata(r);
		PrintWriter out=response.getWriter();
		
		if(b)
		{
			out.println(ses.getAttribute("username")+" user added in database");
		}
		
	}

}
