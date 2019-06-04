package com.ihorautolab.pages.actions;

import org.openqa.selenium.support.PageFactory;

import com.ihorautolab.pages.locators.HomePageLocators;
import com.ihorautolab.utils.SeleniumDriver;

public class HomePageActions {
	
	HomePageLocators homePageLocators = null;
	
	public HomePageActions() {
		this.homePageLocators = new HomePageLocators();
		
		PageFactory.initElements(SeleniumDriver.getDriver(), homePageLocators);
	}
	
	public void clickOnMyAccount() {
		this.homePageLocators.myAccountLink.click();
	}
	
	public void clickOnShop() {
		this.homePageLocators.shopLink.click();
	}
	
	public void setUsername(String username) {
		this.homePageLocators.usernameField.sendKeys(username);
	}
	
	public void setPassword(String password) {
		this.homePageLocators.passwordField.sendKeys(password);
	}
	
	public void clickOnLogin() {
		this.homePageLocators.loginButton.click();
	}
	
	

}
