Feature: Test login functionality

  Scenario Outline: Check login is successful with valid credentials
    Given browser window is open
    And user is on login home page
    When user enters credentials <username> and password
    And user clicks on login
    Then user is navigated to the landing page

    Examples: 
      | username    |
      | soumyajyoti |
      | nilanjana   |
