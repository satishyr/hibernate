package com.app.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.app.model.Course;
import com.app.model.Student;
import com.app.util.HibernateUtil;

public class Test {
public static void main(String[] args) {
	Transaction ts=null;
	try(Session ses=HibernateUtil.getSf().openSession())
	{
		ts=ses.beginTransaction();
		Course c1=new Course();
		c1.setCrid(101);
		c1.setCrname("java");
		c1.setCrcost(2000);
		
		
		Course c2=new Course();
		c2.setCrid(102);
		c2.setCrname("advance java");
		c2.setCrcost(1500);

		Course c3=new Course();
		c3.setCrid(103);
		c3.setCrname("hibernate");
		c3.setCrcost(1000);

		Course c4=new Course();
		c4.setCrid(104);
		c4.setCrname("spring");
		c4.setCrcost(3000);

		
		
		Student s1=new Student();
		s1.setSid(196);
		s1.setSname("satish");
		s1.setSmarks(85);
		s1.getCobs().add(c1);
		s1.getCobs().add(c2);
		
		Student s2=new Student();
		s2.setSid(197);
		s2.setSname("sai");
		s2.setSmarks(89);
		s2.getCobs().add(c3);
		s2.getCobs().add(c4);

		
		Student s3=new Student();
		s3.setSid(198);
		s3.setSname("banny");
		s3.setSmarks(85);
		s3.getCobs().add(c2);
		s3.getCobs().add(c4);

ses.save(c1);
ses.save(c2);
ses.save(c3);
ses.save(c4);



ses.save(s1);
ses.save(s2);
ses.save(s3);
ts.commit();
	}
	catch(Exception e)
	
	{
		e.printStackTrace();
	}
}
	
	
}
