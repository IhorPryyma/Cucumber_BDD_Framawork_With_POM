package com.ihorautolab.pages.actions;

import org.openqa.selenium.support.PageFactory;

import com.ihorautolab.pages.locators.MyAccountPageLocators;
import com.ihorautolab.utils.SeleniumDriver;

public class MyAccountPageActions {
	
	MyAccountPageLocators myAccountPageLocators;
	
	public MyAccountPageActions() {
		this.myAccountPageLocators = new MyAccountPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), myAccountPageLocators);
	}
	
	public String getDashboardText() {
		return this.myAccountPageLocators.dashboardLink.getText();
	}
	
	public void clickDashboardLink() {
		this.myAccountPageLocators.dashboardLink.click();
	}
	
	public void clickOrdersLink() {
		this.myAccountPageLocators.ordersLink.click();
	}
	
	public void clickDownloadsLink() {
		this.myAccountPageLocators.downloadsLink.click();
	}
	
	public void clickAddressesLink() {
		this.myAccountPageLocators.addressesLink.click();
	}
	
	public void clickDetailsLink() {
		this.myAccountPageLocators.detailsLink.click();
	}
	
	public void clickLogoutLink() {
		this.myAccountPageLocators.logoutLink.click();
	}
	
	public String getMyAccountPageTitle() {
		return SeleniumDriver.getDriver().getTitle();
	}

}
