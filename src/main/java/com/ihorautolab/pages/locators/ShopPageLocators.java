package com.ihorautolab.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ShopPageLocators {
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Android')]")
	public WebElement androidLink;

}
