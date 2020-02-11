package com.app.test;


import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.app.model.Manager;
import com.app.util.HibernateUtil;

public class Test {
	public static void main(String[] args) {

		Transaction ts=null;	
		try(Session ses=HibernateUtil.getSf().openSession())
		{
			ts=ses.beginTransaction();
			//select all records
			/**String hql="from com.app.model.Manager";
			Query q=ses.createQuery(hql);
			List<Manager> m=q.list();
			m.forEach(System.out::println);
			
		}
			*/
			
			//SELECT MULTIPLE RECORDS
			/**
			 String hql="select mid,mname from com.app.model.Manager";
			Query q=ses.createQuery(hql);
			List<Object[]> list=q.list();
			for(Object[] ob:list)
			{
				System.out.println(ob[0]+","+ob[1]);
			}
			*/
			
			
			
			
			//select only one record
			

			/**
			 String hql= "select mname from com.app.model.Manager";
			
			Query q=ses.createQuery(hql);
			List<String> list=q.list();
			for(String s:list)
			{
				System.out.println(s);
			}
			
			*/

			//display all records
			/**

	String hql="from com.app.model.Manager";
	 Query q=ses.createQuery(hql);
	List<Manager> m=q.list();
	for(Manager man:m)
	{
		System.out.println(man);
	}
*/
			
	Manager m=new Manager();
	m.setMname("venkey");
	m.setMid(196);
	m.setMfee(10000);

	Manager m1=new Manager();
	m1.setMname("muthu");
	m1.setMid(197);
	m1.setMfee(10001);

	Manager m2=new Manager();
	m2.setMname("banny");
	m2.setMid(198);
	m2.setMfee(10002);

	Manager m3=new Manager();
	m3.setMname("brhmi");
	m3.setMid(199);
	m3.setMfee(10003);


	ses.save(m);
	ses.save(m1);
	ses.save(m2);
	ses.save(m3);

	ts.commit();
	ses.close();
			 
		}

		
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}
}
