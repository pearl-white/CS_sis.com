@smoke
Feature: Automatic testing of Login Functionality
  Scenario: Login with valid credentials
    Given User is on the homepage of conceptsis "https://conceptsis.com/Login.aspx"
    When user types valid username and password
    And click the submit button
    Then sees "Welcome Department" as a proof of valid signing in

  Scenario:
    Given User is on the homepage of conceptsis "https://conceptsis.com/Login.aspx"
    When user types INVALID username and password
    And clicks the submit button
    Then sees "You've specified a wrong username or password." as a proof of INVALID credentials

