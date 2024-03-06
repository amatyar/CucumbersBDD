package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login 
{
	 WebDriver driver;
	 LoginPage loginPage;

	    @Given("the user is on the login page")
		public void the_user_is_on_the_login_page() 
	    {
			WebDriverManager.chromedriver().setup();
			System.out.println("Opening the login page");
	        driver = new ChromeDriver();
	        driver.get("https://www.saucedemo.com/");
	        loginPage=new LoginPage(driver);
		    
		}
		
		@When("the user enters valid username and password")
		public void the_user_enters_valid_username_and_password() 
		{
			System.out.println("Entering the username and password");
			loginPage.enterUsername("standard_user");
		    loginPage.enterPassword("secret_sauce");
			
		}    

		@When("clicks on the Login button")
		public void clicks_on_the_login_button() 
		{
			System.out.println("Click on login button");
			loginPage.clickLogin();
		    
		}
		
		@Then("the user should be redirected to the dashboard")
		public void the_user_should_be_redirected_to_the_dashboard() 
		{
		    // Write code here that turns the phrase above into concrete actions
			System.out.println("Validate logo on dashboard");
			driver.quit();
		}

}
