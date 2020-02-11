package com.app.test;

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
			e.setEmpid(100);
			e.setEmpname("satish");
			e.setEmpsal(123.1);
			//ses.saveOrUpdate(e);
			ses.delete(e);
			ts.commit();
		}
		
		catch(Exception ee)
		{
			ee.printStackTrace();
			
			
			//ses.close();

			
		}

		}
	}


