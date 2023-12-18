package org.TestNgProjects;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testDemo4 {
	

	@Parameters({"URL"})
	@Test
	public void WebloginHomeLoan(String url)
	{
		System.out.println("WebloginHomeLoan");
		System.out.println("The url taken from testng paramter is"+url);
	}
	
	@Test
	public void MobileloginHomeLoan()
	{
		System.out.println("MobileloginHomeLoan");
	}
	
	@Test(groups={"Smoke"})
	public void LoginAPiHomeLoan()
	{
		System.out.println("LoginAPiHomeLoan");
	}
	


}
