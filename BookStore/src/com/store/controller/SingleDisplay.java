package com.store.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.store.dao.BookDao;
import com.store.model.Book;


@WebServlet("/SingleDisplay")
public class SingleDisplay extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id =Integer.parseInt(request.getParameter("id"));
		BookDao b = new BookDao();
		Book book =b.getSingle(id);
		HttpSession session = request.getSession();
		session.setAttribute("singlebook", book);
		response.sendRedirect("SingleSelect.jsp");
	}

}
