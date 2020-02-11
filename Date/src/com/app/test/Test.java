package com.app.test;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.app.model.Employee;
import com.app.util.HibernateUtil;

public class Test {
	public static void main(String[] args) {
		
		try(Session ses=HibernateUtil.getSf().openSession())
		{
			Transaction ts=ses.beginTransaction();
			Employee e=new Employee();
			//Employee e= (Employee)ses.load(Class.forName("com.app.model.Employee"),100);
			//System.out.println(e);
		e.setEid(100);
		e.setEname("satish");
		e.setDt1(new Date());
		e.setDt2(new Date());
		e.setDt3(new Date());
		ses.save(e);
		System.out.println(e);
			ts.commit();
		}
		
		catch(Exception ee)
		{
			ee.printStackTrace();
			
			
			//ses.close();

			
		}

		}
	}


