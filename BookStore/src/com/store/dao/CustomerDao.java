package com.store.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.store.model.Customer;

public class CustomerDao {
	
	static Session session;
	static SessionFactory sf;
	
	static
	{
		sf = new Configuration().configure().buildSessionFactory();
		
		session = sf.openSession();
	}

	public boolean check(String email, String password) {

		boolean valid=false;
		session.beginTransaction();
		/*
		 * Query q = (Query) session.createQuery("from Customer where email =:email");
		 * q.setParameter("email", email);//.uniqueResult(); q.uniqueResult(); Customer
		 * c = (Customer) q.list();
		 */

		/*
		 * Customer c = (Customer) session.get(Customer.class, email);
		 * if(password.equals(c.getPassword())) { valid=true; } else { valid=false; }
		 * 
		 */
		Query q = session.createQuery("select password from Customer where email = :cemail");
		q.setParameter("cemail" , email);
		session.getTransaction().commit();
		List c =  q.list();
		
		if(password.equals(c.get(0)))
		{
			valid=true;
			
		}
		else
			valid=false;	
		
		return valid;
	}

	
	
	public void register(Customer c) {
		session.beginTransaction();
		session.save(c);
		session.getTransaction().commit();
		
		
	}
	
	
}
