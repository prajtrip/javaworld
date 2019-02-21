package com.oracle.springjpa.SpringJpaExample;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserRecord {
	@Id
private int id;
	private String name;
	private String email;
	public UserRecord()
	{
		System.out.println("Zero arg constructor");
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
