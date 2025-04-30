package com.jbk;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EmployeeDao {
	private Session session;
	
	Session getSession() {
		Configuration cfg =new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Employee.class);
		SessionFactory factory=cfg.buildSessionFactory();
		session=factory.openSession();
		System.out.println(1);
		return session;
	}
	
	
	public void addEmployee(Employee employee) {
		session=getSession();
		session.saveOrUpdate(employee);
		session.beginTransaction().commit();
		System.out.println("data inserted successfully");
	}

}
