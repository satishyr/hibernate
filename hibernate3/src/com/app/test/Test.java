package com.app.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.app.model.Product;

public class Test {

	public static void main(String[] args) {
		
	Configuration cfg=new Configuration();
	cfg.configure();
	SessionFactory sf=cfg.buildSessionFactory();
	Session ses=sf.openSession();
	Transaction ts=ses.beginTransaction();
	Product p=new Product();
	p.setPid(123);
	p.setPname("soap");
	p.setPcost(25.3);
ses.save(p);
ts.commit();
ses.close();
	}
}
