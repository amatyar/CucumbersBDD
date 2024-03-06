package StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Hooks {

	@Before
	public void setupForSmokeTests() {
		System.out.println("Setting up for smoke Tests");
	}

	@After
	public void tearDown(Scenario scenario) {
		System.out.println("Tearing down after scenario:" + scenario.getName());
	}

	@Then("the user should be logged in successfully")
	public void the_user_should_be_logged_in_successfully() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("the user enters invalid username and password")
	public void the_user_enters_invalid_username_and_password() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("the user should see an error message")
	public void the_user_should_see_an_error_message() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

}
