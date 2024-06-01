Feature: check login functionality
	@smoke
  Scenario: Scenario1
  
    Given user is on login landing page
    When user enters valid login name and password
    And Clicks on login button on page
    Then user is navigated to home page

  Scenario: Scenario2
  
    Given user is on login landing page
    When user enters valid login name and password
    And Clicks on login button on page
    Then user is navigated to home page