package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.beans.registration;
import com.dao.registerDAO;

/**
 * Servlet implementation class update
 */
@WebServlet("/update")
public class update extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String user1=request.getParameter("uname");
		String pass1=request.getParameter("pass");
		String cpass1=request.getParameter("cpass");
		String email1=request.getParameter("email");
		HttpSession ses=request.getSession();
		ses.setAttribute("username", user1);
		
		registration r=new registration();
		r.setUname(user1);
		r.setPass(pass1);
		r.setCpass(cpass1);
		r.setEmail(email1);
		registerDAO u=new registerDAO();
		boolean b=u.updaterecord(user1,pass1,cpass1,email1);
		PrintWriter out=response.getWriter();
		
		if(b)
		{
			out.println(ses.getAttribute("username")+" user updated in database");
		}
		
	}

}
