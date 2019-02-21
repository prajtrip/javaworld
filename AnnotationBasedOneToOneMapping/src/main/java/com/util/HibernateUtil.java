package com.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {
private static SessionFactory sessionFactory;
private static SessionFactory buildSessionFactory()
{
	try {
		//create the sessionfactory from hibernate.cfg.xml
		Configuration configuration=new Configuration();
		configuration.configure("hibernate.cfg.xml");
		ServiceRegistry serviceRegistry=new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
		SessionFactory sessionFactory=configuration.buildSessionFactory(serviceRegistry);
		return sessionFactory;
	} catch (Exception e) {
		 e.printStackTrace();
		 throw new ExceptionInInitializerError(e);
	}
}
public static SessionFactory getSessionFactory()
{
	if(sessionFactory==null)
		sessionFactory=buildSessionFactory();
	return sessionFactory;
}
}
