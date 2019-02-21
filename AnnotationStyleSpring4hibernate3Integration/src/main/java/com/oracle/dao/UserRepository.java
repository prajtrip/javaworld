package com.oracle.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.oracle.model.User;

@Transactional
@Repository
public class UserRepository {
	@Autowired
private HibernateTemplate hibernateTemplate;
	public List<User> getAllUser()
	{
		return this.hibernateTemplate.loadAll(User.class);
	}
	
	public Integer createUser(User user)
	{
		User user1=this.hibernateTemplate.merge(user);
		return user1.getId();
	}
}
