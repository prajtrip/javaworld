package com.in28minutes.springboot.tutorial.basics.springboottutorialbasics;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootTutorialBasicsApplicationTests {
	@MockBean
	DataService dataServiceMock;
	@Autowired
	BusinessService businessImpl;
	@Test

	public void testFindTheGreatestFromAllData()
	{
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {24,15,3});
		assertEquals(24, businessImpl.findTheGreatestFromAllData());
	}

}

