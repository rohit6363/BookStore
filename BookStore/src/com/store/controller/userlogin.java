package com.store.controller;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Statement;
import com.store.dao.CustomerDao;

@WebServlet("/userlogin")
public class userlogin extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		
		CustomerDao c = new CustomerDao();
		boolean valid = c.check(email,password);
		if(valid==true)
		{
			response.sendRedirect("ShowBook");
		}
		else
		{
			response.sendRedirect("Userlogin.jsp");
		}
	}

}
