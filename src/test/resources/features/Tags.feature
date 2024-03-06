Feature: Login Functionality

  @smoke
  Scenario: User logs in with valid credentials1
    Given the user is on the login page1
    When the user enters valid username and password1
    Then the user should be logged in successfully1

  @regression
  Scenario: User logs in with invalid credentials1
    Given the user is on the login page1
    When the user enters invalid username and password1
    Then the user should see an error message1
