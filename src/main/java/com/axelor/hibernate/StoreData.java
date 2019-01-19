package com.axelor.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class StoreData {

	
	public Session sessionObj() {
		
		Configuration cfg = new Configuration();
		cfg.addAnnotatedClass(Student.class);
		cfg.configure();
		
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(cfg.getProperties());
		SessionFactory factory = cfg.buildSessionFactory(builder.build());
		Session session = factory.openSession();
		
		return session;
		
	} 
	
}
