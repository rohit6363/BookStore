package com.store.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.store.model.Book;
import com.store.model.Order;



public class BookDao {
	static Session session;
	static SessionFactory sf;
	
	static
	{
		sf = new Configuration().configure().buildSessionFactory();
		
		session = sf.openSession();
	}

	public List<Book> display() {
		session.beginTransaction();
		Query q = session.createQuery("from Book");
		session.getTransaction().commit();
		List<Book> book = q.list();
		
				return book;
		
	}

	public void addBook(Book book) {
		session.beginTransaction();
		session.save(book);
		session.getTransaction().commit();
		
	}

	public List<Order> showOrders() {
		session.beginTransaction();
		Query q = session.createQuery("form Order");
		session.getTransaction().commit();
		List<Order> order = q.list();
		return order;
		
		
	}

	public Book getSingle(int id) {
		session.beginTransaction();
		
		Book b =(Book) session.get(Book.class, id);
		return b;
	}

	public void confirmOrder(Order o) {
		session.beginTransaction();
		session.save(o);
		session.getTransaction().commit();
		
	}
	

}
