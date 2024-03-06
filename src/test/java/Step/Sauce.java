package Step;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Sauce {
WebDriver driver;
	
	
	@Given("I am on the SauceDemo login page")
	public void i_am_on_the_sauce_demo_login_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rabindra\\OneDrive\\Desktop\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
	}

	@When("I enter valid credentials")
	public void i_enter_valid_credentials() {
	    // Write code here that turns the phrase above into concrete actions
		 driver.findElement(By.id("user-name")).sendKeys("standard_user");
	     driver.findElement(By.id("password")).sendKeys("secret_sauce");
	     driver.findElement(By.id("login-button")).click();
	}

	@Then("I should be logged in successfully")
	public void i_should_be_logged_in_successfully() {
	    // Write code here that turns the phrase above into concrete actions
		boolean success = driver.getCurrentUrl().contains("inventory.html");
        driver.quit();
        assert success;
	}

}
