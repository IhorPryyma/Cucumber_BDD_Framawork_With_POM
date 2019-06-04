package com.ihorautolab.pages.actions;

import org.openqa.selenium.support.PageFactory;

import com.ihorautolab.pages.locators.ShopAndroidPageLocators;
import com.ihorautolab.utils.SeleniumDriver;

public class ShopAndroidPageActions {

	ShopAndroidPageLocators shopAndroidPageLocators;
	
	public ShopAndroidPageActions() {
		this.shopAndroidPageLocators = new ShopAndroidPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), shopAndroidPageLocators);
	}
	
	public String getShopAndroidPageTitle() {
		return SeleniumDriver.getDriver().getTitle();
	}
	
	public boolean isAndroidPage() {
		return shopAndroidPageLocators.androidLabel.isDisplayed();
	}
}
