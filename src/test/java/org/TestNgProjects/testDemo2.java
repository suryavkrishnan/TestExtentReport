package org.TestNgProjects;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testDemo2 {
	

	@BeforeTest
	public void preRequestTest()
	{
		System.out.println("I will execute first ...........");
		
	}
	@AfterMethod
	public void AFMethod()
	{
		System.out.println("I am after method -----");
	}
	@Test(groups={"Smoke"})
	public void thirdTest()
	{
		System.out.println("thirdTest");
	}
	
	@Parameters({"URL","apikey"})
	@Test
	public void fourthTest(String url,String api)
	{
		System.out.println("fourthTest");
		System.out.println("The url taken from testng paramter is ------------- "+url);
		System.out.println("The api taken from testng paramter is  "+api);
	}
	
	

}
