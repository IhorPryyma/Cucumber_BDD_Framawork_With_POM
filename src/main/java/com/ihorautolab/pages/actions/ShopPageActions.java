package com.ihorautolab.pages.actions;

import org.openqa.selenium.support.PageFactory;

import com.ihorautolab.pages.locators.ShopPageLocators;
import com.ihorautolab.utils.SeleniumDriver;

public class ShopPageActions {
	
	ShopPageLocators shopPageLocators;
	
	public ShopPageActions() {
		this.shopPageLocators = new ShopPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), shopPageLocators);
	}
	
	public String getShopPageTitle() {
		return SeleniumDriver.getDriver().getTitle();
	}
	
	public void clickOnAndroidLink() {
		shopPageLocators.androidLink.click();
	}

}
