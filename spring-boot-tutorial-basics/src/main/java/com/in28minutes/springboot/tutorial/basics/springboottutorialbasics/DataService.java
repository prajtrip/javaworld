package com.in28minutes.springboot.tutorial.basics.springboottutorialbasics;

import org.springframework.stereotype.Repository;

@Repository
public class DataService {
	public int[] retrieveAllData()
	{
		return new int[] {1,2,3,4,5};
	}

}
