package com.ihorautolab.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MyAccountPageLocators {
	
	@FindBy(how=How.XPATH, using="//a[contains(text(),'Dashboard')]")
	public WebElement dashboardLink;
	
	
	@FindBy(how=How.XPATH, using="//a[contains(text(),'Orders')]")
	public WebElement ordersLink;
	
	
	@FindBy(how=How.XPATH, using="//a[contains(text(),'Downloads')]")
	public WebElement downloadsLink;
	
	
	@FindBy(how=How.XPATH, using="//a[contains(text(),'Addresses')]")
	public WebElement addressesLink;
	
	
	@FindBy(how=How.XPATH, using="//a[contains(text(),'Account Details')]")
	public WebElement detailsLink;
	
	@FindBy(how=How.XPATH, using="//a[contains(text(),'Logout')]")
	public WebElement logoutLink;
	
	

}
