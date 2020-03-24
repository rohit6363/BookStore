package com.store.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.store.dao.BookDao;
import com.store.model.Order;


@WebServlet("/ShowOrders")
public class ShowOrders extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		BookDao b = new BookDao();
		List<Order> order =  b.showOrders();
		HttpSession session = request.getSession();
		session.setAttribute("orders", order);
		response.sendRedirect("AdminOrderDetails.jsp");
		
	}

}
