Feature: User Login on Shopping Simple Practice Website

  Scenario: Login with valid credentials
    Given User is on the login page
    When Title of the login page is Let's Shop
    Then User enters valid username and password
    Then User clicks on the login button
    Then User is navigated to the home page

  Scenario: List of all the products displayed on the home page
    Given User is on the home page
    Then User see a list of all the products displayed on the home page