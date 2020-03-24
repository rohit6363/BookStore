package com.store.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/adminlogin")
public class adminlogin extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		
		if(email.equals("admin@book.com")&&password.equals("admin123"))
		{
			response.sendRedirect("AdminHome.jsp");
		}
	
		else
		{
			response.sendRedirect("adminlogin.jsp");
		}
	}

}
