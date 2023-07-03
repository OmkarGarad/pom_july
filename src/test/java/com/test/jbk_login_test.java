package com.test;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pages.jbk_login_page;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import data_provider.TestBase;




public class jbk_login_test {
	
	static WebDriver driver;	
    jbk_login_page lp = null;
   
    static ExtentReports report;
    static ExtentTest test;
    
    
    private String capture(WebDriver driver,String name) throws Exception {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File Dest = new File("src/../ErrImages/" + name
		+ ".png");
		String errflpath = Dest.getAbsolutePath();
		FileUtils.copyFile(scrFile, Dest);
		
		//return null;
		return errflpath;
	}
    
    @BeforeMethod
    public static void startTest()
    {
    report = new ExtentReports(System.getProperty("user.dir")+"\\ExtentReportResultsJBK.html",true);
    test = report.startTest("ExtentDemo01");
	driver=	TestBase.jbk_lauch_url();
    }
    
 
	@Test	
	public void jbk_launch() throws Exception {	

	lp = new jbk_login_page(driver);
	lp.valid_credentials();
	
	if(driver.getTitle().equals("JavaByKiran | Dashboard"))
	{
	test.log(LogStatus.PASS, "Navigated to the specified URL");
	}
	else
		
	{
	test.log(LogStatus.FAIL, "Test Failed");
	test.log(LogStatus.FAIL,test.addScreenCapture(capture(driver,"jbk_launch"))+ "Test Failed");
	}
		
	}
	
	
	@AfterMethod
	
	public static void endTest()
	{
	report.endTest(test);
	report.flush();
	}

}
