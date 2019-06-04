package steps;

import java.util.List;

import org.testng.Assert;

import com.ihorautolab.pages.actions.HomePageActions;
import com.ihorautolab.pages.actions.MyAccountPageActions;
import com.ihorautolab.utils.SeleniumDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
	
	HomePageActions homePageActions = new HomePageActions();
	MyAccountPageActions myAccountPageActions = new MyAccountPageActions();
	String menu;
	
	@Given("^I am on the Home Page \"([^\"]*)\" of TestShop website$")
	public void i_am_on_the_Home_Page_of_TestShop_website(String webSiteURL) throws Throwable {
	    
		SeleniumDriver.openPage(webSiteURL);
	}

	@When("^I move to the menu$")
	public void i_move_to_the_menu(List<String> list) throws Throwable {
	    
		menu = list.get(2);
		
	}

	@And("^click on \"([^\"]*)\" link$")
	public void click_on_link(String myAccountLink) throws Throwable {
	    homePageActions.clickOnMyAccount();
	}

	@And("^set username as \"([^\"]*)\" in username field$")
	public void set_username_as_in_username_field(String username) throws Throwable {
	    homePageActions.setUsername(username);
	}

	@And("^set password as \"([^\"]*)\" in password field$")
	public void set_password_as_in_password_field(String password) throws Throwable {
	    homePageActions.setPassword(password);
	}

	@And("^click on \"([^\"]*)\" button$")
	public void click_on_button(String loginButton) throws Throwable {
	    homePageActions.clickOnLogin();
	}

	@Then("^I should see \"([^\"]*)\" link on Account Page$")
	public void i_should_see_link_on_Account_Page(String expected) throws Throwable {
	    String actual = myAccountPageActions.getDashboardText();
	    Assert.assertEquals(actual, expected, "Dashboard not found");
	}

	@And("^the page title should be \"([^\"]*)\"$")
	public void the_page_title_should_be(String expected) throws Throwable {
	    String actual = myAccountPageActions.getMyAccountPageTitle();
	    Assert.assertEquals(actual, expected, "My Account Page title dosn't match");
	}


}
