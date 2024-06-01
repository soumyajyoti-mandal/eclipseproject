package StepsForHooks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class HooksDemoSteps {
	
	WebDriver driver = null;
	@Before(order = 2)
	public void browsersetup() {
		System.out.println("I am inside browsersetup");
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	@Before(value = "@smoke",order = 1)
	public void setup() {
		System.out.println("I am inside setup2");
	}
	
	@After(order = 1)
	public void teardown() {
		System.out.println("I am inside tear down");
		driver.close();
		driver.quit();
	}
	@After(order = 2)
	public void teardown2() {
		System.out.println("I am inside teardonw 2");
	}
	@BeforeStep
	public static void beforeSteps() {
		System.out.println("I am before step");
	}
	@AfterStep
	public static void afterStep() {
		System.out.println("I am inside after step");
	}
	@Given("user is on login landing page")
	public void user_is_on_login_landing_page() {

	}

	@When("user enters valid login name and password")
	public void user_enters_valid_login_name_and_password() {

	}

	@And("Clicks on login button on page")
	public void clicks_on_login_button_on_page() {

	}

	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page() {

	}

}
