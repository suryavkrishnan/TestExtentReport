package org.ExtentReportDemo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.*;

public class ExtentReportDemo 
{
	ExtentReports extent;
	
	@BeforeTest
	public void config()
	{
		String path=System.getProperty("user.dir")+"//report//index.html";
		ExtentSparkReporter report=new ExtentSparkReporter(path);//This class help to configure the extent report by goving path and names
		report.config().setReportName("Web Automation Results");
		report.config().setDocumentTitle("Test Results");
		
		extent=new ExtentReports();
		extent.attachReporter(report);//this is the exact class which create the extend report using the abouve spark class
		extent.setSystemInfo("Tester", "Surya Krishnan");
		
		System.out.println("first  commit by develop branch");
	}
	
	@Test
	public void initialDemo()
	{
		System.out.println("second commit by first");
		System.out.println("third commit by second person");
		System.out.println("fourth commit by first  person");
		
		ExtentTest test=extent.createTest("Initial Demo");
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/");
		System.out.println(driver.getTitle());
		driver.close();
		//test.fail("Result do not match"); //To write failed status in report
		extent.flush();
	}

}
