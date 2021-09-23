package com.comcast.orgtest.copy;

import org.testng.annotations.Test;

public class OrgTest {
	
	@Test(groups = "SmokeTest")
	public void createOrgTest() {
		System.out.println("execute createOrgTest");
	}
	
	@Test(groups = "RegressionTest")
	public void createOrgWithIndutriesTest() {
		System.out.println("execute createOrgWithIndutriesTest");
	}
	@Test(groups = "RegressionTest")
	public void deleteOrgTest() {
		System.out.println("execute deleteOrgTest");
	}
}
