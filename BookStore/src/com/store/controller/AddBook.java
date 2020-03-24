package com.store.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.store.dao.BookDao;
import com.store.model.Book;


@WebServlet("/AddBook")
public class AddBook extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("book_name");
		String author = request.getParameter("author");
		double price = Double.parseDouble(request.getParameter("price"));
		
		Book book = new Book();
		book.setBook_name(name);
		book.setAuthor(author);
		book.setPrice(price);
		
		BookDao b = new BookDao();
		b.addBook(book);
		response.sendRedirect("AddBook.jsp");
	}

}
