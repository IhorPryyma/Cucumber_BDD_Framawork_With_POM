package steps;

import org.testng.Assert;

import com.ihorautolab.pages.actions.HomePageActions;
import com.ihorautolab.pages.actions.ShopAndroidPageActions;
import com.ihorautolab.pages.actions.ShopPageActions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class ShopSteps {
	
	HomePageActions homePageActions = new HomePageActions();
	ShopPageActions shopPageActions = new ShopPageActions();
	ShopAndroidPageActions shopAndroidPageActions = new ShopAndroidPageActions();
	String menu;
	
	
	@And("^click on the \"([^\"]*)\" link$")
	public void click_on_the_link(String arg1) throws Throwable {
		homePageActions.clickOnShop();
	}
	
	@Then("^I should see \"([^\"]*)\" Page$")
	public void i_should_see_Page(String expected) throws Throwable {
	    String actual = shopPageActions.getShopPageTitle();
	    Assert.assertEquals(actual, expected);
	}

	@Then("^click on \"([^\"]*)\" link in \"([^\"]*)\" menu$")
	public void click_on_link_in_menu(String arg1, String arg2) throws Throwable {
	    shopPageActions.clickOnAndroidLink();
	}

	@Then("^I should see \"([^\"]*)\" Product categories Page$")
	public void i_should_see_Product_categories_Page(String expected) throws Throwable {
	    boolean actual = shopAndroidPageActions.isAndroidPage();
	    Assert.assertTrue(actual);
	}



}
