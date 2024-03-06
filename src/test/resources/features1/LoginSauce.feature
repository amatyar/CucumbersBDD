Feature: LoginSauce Functionality

  Scenario: Valid Logins with Correct Credentials
    Given the users is on the login page
    When the users enters valid username and password
    And the clicks on the Logins button
    Then the users should be redirected to the dashboard