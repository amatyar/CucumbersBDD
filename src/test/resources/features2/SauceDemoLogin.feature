Feature: Login to SauceDemo

  Scenario: Valid Login
    Given I am on the SauceDemo login page
    When I enter valid credentials
    Then I should be logged in successfully
