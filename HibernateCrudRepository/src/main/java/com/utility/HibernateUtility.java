package com.utility;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.service.spi.SessionFactoryServiceInitiator;

@SuppressWarnings("deprecation")
public class HibernateUtility {
private static  SessionFactory sf;
static
{
	try {
		sf=new AnnotationConfiguration().buildSessionFactory();
	} catch (Throwable e) {
		System.out.println("sessionfactory not created");
		throw new ExceptionInInitializerError(e);
	}
}
public static SessionFactory getSessionFactory()
{
	return sf;
}

}
