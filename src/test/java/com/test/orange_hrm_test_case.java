package com.test;


import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pages.orange_hrm_dashboard_page;
import com.pages.orange_hrm_login_page;

import data_provider.Orange_hrm_test_base;


public class orange_hrm_test_case extends Orange_hrm_test_base{
	
	WebDriver driver;
	orange_hrm_login_page org_login_page =null;
	orange_hrm_dashboard_page org_dash_page = null;
	
	
	JavascriptExecutor js;
	
	

	
	@BeforeTest
	public void launch_page() {
		
		driver = Orange_hrm_test_base.initilization_orange_hrm();
		//org_login_page = new orange_hrm_login_page(driver);	
		//org_dash_page = new orange_hrm_dashboard_page(driver);
			
	}
	
	@Test(priority = 1)
	public void login_page() throws Exception {
		
		org_login_page = new orange_hrm_login_page(driver);	
		Thread.sleep(3000);
		org_dash_page= org_login_page.ornage_hrm_credentials();		
	}
	

	
	@Test(priority = 2)
	public void dashboard_page() throws Exception {
	Thread.sleep(3000);
	/*
	 * org_page.getusername("admin"); Thread.sleep(3000);
	 * org_page.getpassword("admin123"); Thread.sleep(3000); org_page.getbutton();
	 */
	//org_dash_page= org_login_page.ornage_hrm_credentials();
	Thread.sleep(3000);
	
	org_dash_page.Fname_Collings();
	
	Thread.sleep(3000);
	
	//WebElement buzz = driver.findElement(By.linkText("/web/index.php/buzz/viewBuzz"));
	
	org_dash_page.logout();
	

	
	
	
	
	
	}

}
