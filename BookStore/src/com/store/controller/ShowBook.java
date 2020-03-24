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
import com.store.model.Book;


@WebServlet("/ShowBook")
public class ShowBook extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		BookDao b = new BookDao();
		
		List<Book> book = b.display();
		
		HttpSession session = request.getSession();
		session.setAttribute("booklist", book);
		response.sendRedirect("ShowBook.jsp");
		
		
	}

}
