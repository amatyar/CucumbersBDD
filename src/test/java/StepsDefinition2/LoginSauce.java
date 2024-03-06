package StepsDefinition2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSauce {
	WebDriver driver;
	LoginPage loginPage;
	   
	@Given("the users is on the login page")
	public void the_users_is_on_the_login_page() {
	    // Write code here that turns the phrase above into concrete actions
		driver = new ChromeDriver();
	    driver.get("https://www.saucedemo.com/v1/");
	    loginPage = new LoginPage(driver);
	}

	@When("the users enters valid username and password")
	public void the_users_enters_valid_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
		loginPage.enterUsername("standard_user");
		   loginPage.enterPassword("secret_sauce");
	}

	@When("the clicks on the Logins button")
	public void the_clicks_on_the_logins_button() {
	    // Write code here that turns the phrase above into concrete actions
		 loginPage.clickLogin();
	}

	@Then("the users should be redirected to the dashboard")
	public void the_users_should_be_redirected_to_the_dashboard() {
	    // Write code here that turns the phrase above into concrete actions
		driver.quit();
	}
}
