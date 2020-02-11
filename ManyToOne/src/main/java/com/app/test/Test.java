package com.app.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.app.model.Address;
import com.app.model.Employee;
import com.app.util.HibernateUtil;

public class Test {
	public static void main(String[] args) {
		Transaction ts=null;
		try(Session ses=HibernateUtil.getSf().openSession()){
			 ts=ses.beginTransaction();
			Address addr=new Address();
			addr.setAid(101);
			addr.setLoc("hyd");
			addr.setPin("521343");
			
			Employee e1=new Employee();
			e1.setEmpid(10);
			e1.setEmpname("satish");
			e1.setEmpsal(100000);
			e1.setAddr(addr);
			
			Employee e2=new Employee();
			e2.setEmpid(11);
			e2.setEmpname("sati");
			e2.setEmpsal(1000001);
			e2.setAddr(addr);
			
			Employee e3=new Employee();
			e3.setEmpid(12);
			e3.setEmpname("sai");
			e3.setEmpsal(200000);
			e3.setAddr(addr);
			ses.save(e1);
			ses.save(e3);
			ts.commit();
			ses.close();
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			ts.rollback();
		}
	}

}
