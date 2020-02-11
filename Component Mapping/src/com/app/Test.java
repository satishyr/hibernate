package com.app;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Test {

	public static void main(String[] args) {
		try(Session ses=HibernateUtil.getSf().openSession())
		{
			Transaction ts=ses.beginTransaction();
			Address a=new Address();
			a.setLoc("hyd");
			a.setPincode(5-26);
			Employee e1=new Employee();
			e1.setEmpid(101);
			e1.setEmpname("satish");
			e1.setEmpsal(60000);
			e1.setAddr(a);
			ses.save(e1);
			ts.commit();
			ses.close();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
