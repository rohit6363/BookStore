package com.store.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.store.dao.CustomerDao;
import com.store.model.Customer;


@WebServlet("/CustomerRegister")
public class CustomerRegister extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		int phone=Integer.parseInt(request.getParameter("phone"));
		String password=request.getParameter("password");
		String city=request.getParameter("city");
		int pincode=Integer.parseInt(request.getParameter("pincode"));
		
		Customer c = new Customer();
		c.setName(name);
		c.setAddress(city);
		c.setEmail(email);
		c.setPhone(phone);
		c.setPassword(password);
		
		
		CustomerDao dao = new CustomerDao();
		dao.register(c);
		
		response.sendRedirect("Userlogin.jsp");
	
	}

}
