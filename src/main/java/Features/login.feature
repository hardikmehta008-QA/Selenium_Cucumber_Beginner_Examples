Feature: User Login on Shopping Simple Practice Website
# Without Examples Keywork using Data Driven
#  Scenario: Login with valid credentials
#    Given User is on the login page
#    When Title of the login page is Let's Shop
#    Then User enters valid "testauto_45@yopmail.com" and "Testauto@45"
#    Then User clicks on the login button
#    Then User is navigated to the home page

  #Scenario: List of all the products displayed on the home page
    #Given User is on the home page
    #Then User see a list of all the products displayed on the home page

  Scenario Outline: Login with valid credentials
    Given User is on the login page
    When Title of the login page is Let's Shop
    Then User enters valid "<username>" and "<password>"
    Then User clicks on the login button
    Then User is navigated to the home page
    Then User is on the home page
    Then User see a list of all the products displayed on the home page
    Examples:
    | username                | password |
    | testauto_45@yopmail.com | Testauto@45 |
    | automationpw@yopmail.com | Pw@112233  |

