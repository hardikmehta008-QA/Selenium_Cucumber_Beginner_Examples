Feature: Login on Automation Exercise Website
# With Dat Driven using Maps cucumber framework
  Scenario: Login with valid credentials
    Given Login page of Automation Exercise Website
    When Title of the login page Automation Exercise
    Then User is entered username and password
      | username                | password |
      | testauto_45@yopmail.com | Testauto@45|
    Then Login button is clicked
    Then After login navigate to the home page

  Scenario: List of all the products displayed on the home page
    Given Successful login redirect to the home page
    Then All the products displayed on the home page
    Then Browser is closed
