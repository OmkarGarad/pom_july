package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class orange_hrm_login_page {

	WebDriver org_login_driver;

	public orange_hrm_login_page(WebDriver driver) {

		this.org_login_driver = driver;
		PageFactory.initElements(org_login_driver, this);

	}

	@FindBy(name="username")
	private WebElement username;
	
	/*
	 * private WebElement username() { return
	 * org_driver.findElement(By.name("username"));
	 * 
	 * }
	 */

	@FindBy(name="password")
	private WebElement password;
	
	
	/*
	 * private WebElement password() {
	 * 
	 * return org_driver.findElement(By.name("password")); }
	 */

	
	@FindBy(xpath="//button")
	private WebElement button;
	
	/*
	 * private WebElement button() {
	 * 
	 * return org_driver.findElement(By.xpath("//button")); }
	 */

	
	public void getusername(String text) {
		username.sendKeys(text);

	}

	public void getpassword(String text) {
		password.sendKeys(text);

	}

	public void getbutton() {
		button.click();

	}

	public orange_hrm_dashboard_page ornage_hrm_credentials() {
		getusername("Admin");
		getpassword("admin123");
		getbutton();
		return new orange_hrm_dashboard_page(org_login_driver);
	}

}
