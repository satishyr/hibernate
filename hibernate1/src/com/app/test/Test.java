package com.app.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.app.model.Employee;

public class Test {

	public static void main(String[] args) {
		Configuration cf=new Configuration();
		cf.configure();
		SessionFactory sf=cf.buildSessionFactory();
		Session ses=sf.openSession();
		Transaction tx=ses.beginTransaction();
	Employee e=new Employee();
	e.setEmpid(10);
	e.setEmpname("satish");
	e.setSaddr("hyderabad");
	ses.save(e);
	tx.commit();
	ses.close();
	}
	
}
