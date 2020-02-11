package com.app.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.app.model.Student;

public class Test {
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session ses=sf.openSession();
		Transaction ts=ses.beginTransaction();
		Student s=new Student();
		s.setSname("sai");
		s.setSid(101);
		s.setSaddr("kaikaluru");
		ses.save(s);
		ts.commit();
		ses.close();
	}

}
