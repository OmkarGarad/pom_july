package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import data_provider.screenshot;

public class extent_report {
	
	WebDriver driver;
	static ExtentTest test;
	static ExtentReports report;

	
	
	
	@BeforeClass
	public static void startTest()
	{
	report = new ExtentReports(System.getProperty("user.dir")+"\\ExtentReportResults.html", true);
	test = report.startTest("ExtentDemo");
	}
	@Test
	public void extentReportsDemo() throws Exception
	{
	System.setProperty("webdriver.chrome.driver", "C:/Users/Shree/Desktop/jar/chromedriver.exe");
	 driver = new ChromeDriver();
	driver.get("https://www.google.co.in");
	if(driver.getTitle().equals("Google"))
	{
	test.log(LogStatus.PASS, "Navigated to the specified URL");
	//test.log(LogStatus.FAIL,test.addScreenCapture(screenshot.capture(driver))+ "Test Failed");
	}
	else
		
	{
	test.log(LogStatus.FAIL, "Test Failed");
	test.log(LogStatus.FAIL,test.addScreenCapture(screenshot.capture(driver,"extentReportsDemo"))+ "Test Failed");
	
	}
	}
	
	@AfterClass
	public static void endTest()
	{
	report.endTest(test);
	report.flush();
	}
	}


