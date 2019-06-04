package com.ihorautolab.pages.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ShopAndroidPageLocators {

	@FindBy(how = How.XPATH, using = "//nav[contains(text(), 'Android')]")
	public WebElement androidLabel;
}
