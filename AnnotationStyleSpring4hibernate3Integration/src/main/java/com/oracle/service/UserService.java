package com.oracle.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.oracle.dao.UserRepository;
import com.oracle.model.User;

public class UserService {
	@Autowired
private UserRepository  userRepository;
	
	public List<User> getAllUsers()
	{
		return this.userRepository.getAllUser();
	}
	
	public Integer createUser(User user)
	{
		return this.userRepository.createUser(user);
	}
}
