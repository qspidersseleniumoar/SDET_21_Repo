package com.comcast.conatcttest;

import org.testng.annotations.Test;

public class ContactTest {
	
	@Test(groups = "SmokeTest")
	public void createConatctTest() {
		String BROWSER = System.getProperty("browser");
		String URL = System.getProperty("url");
		System.out.println("=============>"+BROWSER);
		System.out.println("=============>"+URL);
		System.out.println("execute createConatctTest");
	}
	
	@Test(groups = "RegressionTest")
	public void createConatctWithOrgTest() {
		System.out.println("execute createConatctWithOrgTest");
	}
	@Test(groups = "RegressionTest")
	public void deleteCoantctTest() {
		System.out.println("execute deleteCoantctTest");
	}
	
	@Test(groups = "RegressionTest")
	public void searchCoantctTest() {
		System.out.println("execute searchCoantctTest");
	}
}

