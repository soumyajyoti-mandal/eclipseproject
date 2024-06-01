package StepDefinitions;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginDemoSteps {
//	WebDriver driver = null;
//	@Given("browser window is open")
//	public void browser_window_is_open() {
//		String projectPath = System.getProperty("user.dir");
//		System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/Drivers/chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		driver.manage().window().maximize();
//	}
//
//	@And("user is on login home page")
//	public void user_is_on_login_home_page() {
//		driver.navigate().to("https://example.testproject.io/web/");
//	}
//
//	@When("^user enters credentials (.*) and password$")
//	public void user_enters_credentials_username_and_password( String username) {
//		driver.findElement(By.xpath("//input[@id='name']")).sendKeys(username);
//		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("12345");
//	}
//
//	@And("user clicks on login")
//	public void user_clicks_on_login() throws InterruptedException {
//	    driver.findElement(By.xpath("//button[@id='login']")).click();
//	    Thread.sleep(2000);
//	}
//	@Then("user is navigated to the landing page")
//	public void user_is_navigated_to_the_landing_page() throws InterruptedException {
//	    driver.findElement(By.id("logout")).isDisplayed();
//	    Thread.sleep(2000);
//	    driver.findElement(By.id("logout")).click();
//	    driver.close();
//	    driver.quit();
//	}
}
