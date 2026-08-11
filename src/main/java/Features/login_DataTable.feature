Feature: Login on Automation Exercise Website
# With Data Tablea using cucumber framework
  Scenario: User login with valid credentials
    Given Open Login page of Automation Exercise Website
    When Login page title is Automation Exercise - Login
    Then Enters username and password
    | testauto_45@yopmail.com | Testauto@45|

    Then Clicks on the login button
    Then Navigate to the home page

  Scenario: List of all the products displayed on the home page
    Given Redirect to the home page
    Then List of all the products displayed on the home page
    Then Close the browser
