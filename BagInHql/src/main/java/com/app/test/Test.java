package com.app.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.app.model.Employee;
import com.app.util.HibernateUtil;

public class Test {
public static void main(String[] args) {
	try(Session ses=HibernateUtil.getSf().openSession()){
	Transaction ts=ses.beginTransaction();
	Employee e=new Employee();
	e.setEid(101);
    e.setEname("satish");
    e.setEsal(10000);
    e.getEprjs().add("java");
    e.getEprjs().add("spring");
    e.getEprjs().add("hibernate");
    ses.save(e);
    System.out.println(e);
    
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
}
