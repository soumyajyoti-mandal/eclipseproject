Feature: Check home page functionality
//background contains steps for login and land on home page common to both scenarios
  Background: user is logged in
    Given user is on login page
    When user enters username and password
    And clicks on login page
    Then user is in the home page
	@Regression
  Scenario: Check logout link
    When user clicks on Welcome link
    Then logout link is displayed
	@Smoke
  Scenario: verify quick launch tolbar is present
    When user clicks on Dashboard link
    Then quick launch toolbar is displayed
