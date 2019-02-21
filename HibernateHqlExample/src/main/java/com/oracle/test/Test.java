package com.oracle.test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.oracle.model.Person;

public class Test {
public static void main(String[] args) {
	Configuration configuration=new Configuration();
	configuration.configure("hibernate.cfg.xml");
	SessionFactory sessionFactory=configuration.buildSessionFactory();
	Session session=sessionFactory.getCurrentSession();
	Transaction tx=session.beginTransaction();
	Query query=session.createQuery("from Person");
	List<Person> list=query.list();
	tx.commit();
	for(Person person:list)
	{
		System.out.println(person);
	}
}
}
