package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class orange_hrm_dashboard_page {
	
	WebDriver org_dash_driver;
	
	
	public orange_hrm_dashboard_page(WebDriver driver) {
		this.org_dash_driver= driver;
		PageFactory.initElements(org_dash_driver, this);
	}
	
	
	//// click on Fname_Collings to open dropdown
	@FindBy(className = "oxd-userdropdown-tab")
      private WebElement Fname_Collings;
	
	
	public void Fname_Collings() {
		Fname_Collings.click();
	}
	
	// click on logout button
	
	@FindBy(partialLinkText = "Logout")
	private WebElement logout;
	
	
	public void logout() {
		logout.click();
	}
	
	
}
