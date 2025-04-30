package com.jbk;


import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import java.lang.module.Configuration;

public class HQLEx {
	public static void main(String[] args) {
		
		Configuration cfg=new Configuration().configure();
		cfg.addAnnotatedClass(Song.class);
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
   
	
	}

}
