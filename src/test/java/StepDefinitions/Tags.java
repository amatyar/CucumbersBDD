package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Tags{
  // Implement code to enter valid username and password
    

	
	@Given("the user is on the login page1")
	public void the_user_is_on_the_login_page1() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Hello from Tags");
	}

	@When("the user enters valid username and password1")
	public void the_user_enters_valid_username_and_password1() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Hello from Tags");
	}

	@Then("the user should be logged in successfully1")
	public void the_user_should_be_logged_in_successfully1() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Hello from Tags");
	}

	@When("the user enters invalid username and password1")
	public void the_user_enters_invalid_username_and_password1() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Hello from Tags");
	}

	@Then("the user should see an error message1")
	public void the_user_should_see_an_error_message1() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Hello from Tags");
	}
}
