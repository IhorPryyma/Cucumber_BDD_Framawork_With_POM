@Shop
Feature: Acceptance testing to validate shopping using the application
	As a User I should successfully 
	search, add to basket and buy items
	
@Shop-Positive
Scenario: Shop-Product Categories Functionality
	Given I am on the Home Page "http://practice.automationtesting.in/" of TestShop website
	When I move to the menu
	|Menu      |
	|Shop      |
	|My Account|
	And click on the "Shop" link
	Then I should see "Products – Automation Practice Site" Page
	Then click on "Android" link in "PRODUCT CATEGORIES" menu
	Then I should see "Android" Product categories Page
	And the page title should be "Android – Automation Practice Site"