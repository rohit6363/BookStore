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
import com.store.model.Order;


@WebServlet("/ConfirmOrder")
public class ConfirmOrder extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		Book b = (Book) session.getAttribute("book");
		int quantity = Integer.parseInt(request.getParameter("quantity"));
		
		BookDao dao = new BookDao();
		 double fp = b.getPrice()*quantity;
		 
		 Order o = new Order();
		 o.setFinal_price(fp);
		 o.setQuantity(quantity);
		 o.setBook_id(b.getBook_id());
		 o.setBook_name(b.getBook_name());
		 
		dao.confirmOrder(o);
		
	}

	

}
