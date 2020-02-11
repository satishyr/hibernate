package com.app.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.app.model.Employee;

public class Test {
	public static void main(String[] args) {
		try(Session ses=HibernateUtil.getSf().openSession())
		{
			Transaction tx=ses.beginTransaction();
			Employee e=new Employee();
			e.setEmpid(100);
			e.setEmpname("satish");
			e.setEmpsal(124);
			e.setEmpcode(2);
			ses.update(e);
			tx.commit();
		}
		
		catch(Exception ee)
		{
			ee.printStackTrace();
			
			
			//ses.close();

			
		}
	}

}
