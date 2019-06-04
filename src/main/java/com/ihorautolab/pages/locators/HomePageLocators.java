package com.ihorautolab.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePageLocators {

	@FindBy(xpath="//a[contains(text(),'My Account')]")
	public WebElement myAccountLink;
	
	@FindBy(xpath="//a[contains(text(),'Shop')]")
	public WebElement shopLink;
	
	@FindBy(how=How.XPATH, using="//input[@id='username']")
	public WebElement usernameField;
	
	@FindBy(how=How.XPATH, using="//input[@id='password']")
	public WebElement passwordField;
	
	@FindBy(how=How.XPATH, using="//input[@name='login']")
	public WebElement loginButton;
}
