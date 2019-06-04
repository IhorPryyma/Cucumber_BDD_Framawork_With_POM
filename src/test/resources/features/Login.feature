@Login
Feature: Acceptance testing to validate Login to the application
	As a User I should successfully login 
	with valid username and password,
	and should not login in
	with invalid login or password
	
@Login-Positive
Scenario Outline: Login with valid username and password
	Given I am on the Home Page "http://practice.automationtesting.in/" of TestShop website
	When I move to the menu
	|Menu      |
	|Shop      |
	|My Account|
	And click on "My Account" link
	And set username as "<username>" in username field
	And set password as "<password>" in password field
	And click on "LOGIN" button
	Then I should see "Dashboard" link on Account Page
	And the page title should be "My Account – Automation Practice Site"
	
Examples:
	|username                  | password             |
	| ************@gmail.com   | *****************    |

