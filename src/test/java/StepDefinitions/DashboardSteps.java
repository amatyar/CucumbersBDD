package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DashboardSteps
{
	@Given("the user is on the dashboard page")
	public void the_user_is_on_the_dashboard_page() 
	{
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("hello");
	}

	@When("the user enters valid dusername and dpassword")
	public void the_user_enters_valid_dusername_and_dpassword() 
	{
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("hello1");
	}

	@When("the clicks on the Login button")
	public void the_clicks_on_the_login_button() 
	{
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("hello22");
	}

	@Then("the user should be navigated to the dashboard")
	public void the_user_should_be_navigated_to_the_dashboard() 
	{
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("hello333");
	}



}
