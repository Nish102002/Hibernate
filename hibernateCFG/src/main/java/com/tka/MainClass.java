 package com.tka;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainClass {
	public static void main(String[] args) {
		System.out.println(1);
		Configuration cfg=new Configuration();
		System.out.println(2);
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Classroom.class);
		System.out.println(3);
		SessionFactory factory=cfg.buildSessionFactory();
		
		
	}

}
