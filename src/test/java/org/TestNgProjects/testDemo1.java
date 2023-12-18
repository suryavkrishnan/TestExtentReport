package org.TestNgProjects;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testDemo1 {
	
//	public static void main(String args[])
//	{
//		System.out.println("Hello world");
//	}
	
	@AfterTest
	public void preRequestTest()
	{
		System.out.println("I will execute last ...........");
		
	}
	
	@AfterSuite
	public void AFSuit()
	{
		System.out.println("I am after suite ++++++++++");
	}

	@Test(groups={"Smoke"})
	public void firstTest()
	{
		System.out.println("Hello world");
		Assert.assertTrue(false);
	}
	
	@Test
	public void secondTest()
	{
		System.out.println("Bye");
	}
	
	@Test
	public void secondTest2()
	{
		System.out.println("Bye");
	}

}
