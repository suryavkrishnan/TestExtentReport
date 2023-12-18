package org.TestNgProjects;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class testDemo3 {
	
	@Test
	public void WebloginCarLoan()
	{
		System.out.println("WebloginCarLoan1");
	}
	
	@Test(dataProvider= "getData")
	public void WebloginCarLoan2(String userName,String pass)
	{
		System.out.println("WebloginCarLoan2");
		System.out.println("data provider  :"+userName);
		System.out.println("data provider  :"+pass);
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data=new Object[3][2];
		data[0][0]="firstUsername";
		data[0][1]="password1";
		
		data[1][0]="secondUsername";
		data[1][1]="password2";
		
		data[2][0]="thirdUsername";
		data[2][1]="password3";
		
		return data;
		
	}
	
	@BeforeSuite
	public void BFSuit()
	{
		System.out.println("I am before suite ++++++++++ set up envoronment for api testing");
	}
	@BeforeClass
	public void BFClass()
	{
		System.out.println("I am before class -----");
	}
	@AfterClass
	public void AFClass()
	{
		System.out.println("I am after class -----");
	}
	@BeforeMethod
	public void BFMethod()
	{
		System.out.println("I am before method -----");
	}
	@AfterMethod
	public void AFMethod()
	{
		System.out.println("I am after method -----");
	}
	
	@Test(groups={"Smoke"})
	public void MobileloginCarLoan()
	{
		System.out.println("MobileloginCarLoan");
	}
	@Test(timeOut=4000)
	public void MobileloginCarLoan2()
	{
		System.out.println("MobileloginCarLoan2");
	}
	@Test(enabled=false)
	public void MobileloginCarLoan3()
	{
		System.out.println("MobileloginCarLoan3");
	}
	
	
	@Test(dependsOnMethods={"WebloginCarLoan","WebloginCarLoan2"})
	public void LoginAPiCarLoan()
	{
		System.out.println("LoginAPiCarLoan");
	}
	

	


}
