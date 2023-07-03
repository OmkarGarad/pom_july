package com.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.pages.amazon_login_page;

import data_provider.TestBase;


public class amazon_login_test extends TestBase {
	
	WebDriver driver;
	amazon_login_page alp;
	
	@Parameters("browser") 
	@BeforeTest
 public void amzon_launch(String browser) throws Exception {
		
	driver= TestBase.amazon_lauch_url(browser);
	System.out.println("launch");
	
	
	
 }
	@Test
	public void amzon_launch11()  {
		
		
		System.out.println("launch");
		
		
		
	 }

}
