Feature: Login Functionality

  Scenario: Valid Login with Correct Credentials11
    Given the user is on the login page11
    When the user enters valid username and password11
    And clicks on the Login button11
    Then the user should be redirected to the dashboard11
