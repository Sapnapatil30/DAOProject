package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

import com.beans.registration;
import com.dao.registerDAO;

/**
 * Servlet implementation class allusers
 */
@WebServlet("/allusers")
public class allusers extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
registerDAO d1=new registerDAO();
        
//        registration r=d.getUser(user); 
		PrintWriter p=response.getWriter();
		List<registration> users=new ArrayList<>();
//	        p.println(d1.getUser());
		users.addAll(d1.getUser());
		p.println("<table callspacing='0' width='35px' border='1px'>");
		p.println("<tr>");
		p.println("<th>username</th>");
		p.println("<th>Password</th>");
		p.println("<th>Confirm password</th>");
		p.println("<th>Email</th>");
		p.println("<th>Action</th>");
		p.println("</tr>");
		
		for(registration u:users)
		{
			p.println("<tr>");
			p.println("<td>"+u.getUname()+"</td>");
			p.println("<td>"+u.getPass()+"</td>");
			p.println("<td>"+u.getCpass()+"</td>");
			p.println("<td>"+u.getEmail()+"</td>");
			p.println("<td>"+"<a href='Delete?username="+u.getUname()+"'>Delete</a></td>");
			p.println("<td>"+"<a href=''>Update</a></td>");
			p.println("</tr>");
		}
		p.println("</table>");
		
	}

}
