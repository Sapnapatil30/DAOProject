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
 * Servlet implementation class delete
 */
@WebServlet("/delete")
public class delete extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String user=request.getParameter("uname");
		
		HttpSession ses=request.getSession();
		ses.setAttribute("username", user);
		
		
		registration r=new registration();
		r.setUname(user);
		registerDAO u=new registerDAO();
		boolean b=u.deletedata(r);
		PrintWriter out=response.getWriter();
		
		if(b)
		{
			out.println(ses.getAttribute("username")+" user deleted");
		}
	}

}
