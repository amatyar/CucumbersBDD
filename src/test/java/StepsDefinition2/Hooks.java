package StepsDefinition2;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Hooks {
	@Before("@smoke")
	public void setupForSmokeTests3() {
		
		// Code to set up data or perform setup tasks for smoke tests
		System.out.println("Setting up for Smoke Tests 3");
	}
	
	@Before("@regression")
	public void setupForSmokeTests4() {
		
		// Code to set up data or perform setup tasks for smoke tests
		System.out.println("Setting up for Smoke Tests 4");
	}
	
	@Given("^the user is on the login page0$")
	public void the_user_is_on_the_login_page0() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User is on the login page");
	}

	@When("^the user enters valid username and password0$")
	public void the_user_enters_valid_username_and_password0() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User enters valid username and password");
	}

	@Then("^the user should be logged in successfully0$")
	public void the_user_should_be_logged_in_successfully0() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User is logged in successfully");
	}

	@When("^the user enters invalid username and password0$")
	public void the_user_enters_invalid_username_and_password0() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User enters invalid username and password");
	}

	@Then("^the user should see an error message0$")
	public void the_user_should_see_an_error_message0() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User sees an error message");
	}
	@After
	public void tearDown(Scenario scenario) {
		System.out.println("Tearing down after scenario: " + scenario.getName());

	}
	
}
