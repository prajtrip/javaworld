package com.model.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.Student;

public class UpdateStudent {

	public static void main(String[] args) {
		Configuration configuration=new Configuration();
		configuration.configure();
		SessionFactory factory=configuration.buildSessionFactory();
		Session session=factory.openSession();
	      Transaction transaction=session.beginTransaction();
	     Student student =(Student) session.get(Student.class, 1);
	    session.delete(student);;
	    transaction.commit();
	    factory.close();
		

	}

}
