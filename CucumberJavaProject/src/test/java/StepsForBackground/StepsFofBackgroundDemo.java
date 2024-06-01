package StepsForBackground;

import pageFactory.backgroundDemo_PF;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepsFofBackgroundDemo {
	WebDriver driver = null;
	backgroundDemo_PF login;
	@Before
	public void browsersetup() {
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
//	@Before(order = 2)
//	public void navigateURL() {
//		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//	}
	
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
		login = new backgroundDemo_PF(driver);
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	@When("user enters username and password")
	public void user_enters_username_and_password() throws InterruptedException {
		login.entercredentials();
		Thread.sleep(2000);
		
	}
	@And("clicks on login page")
	public void clicks_on_login_page() {
		login.clickLogin();
	}
	@Then("user is in the home page")
	public void user_is_in_the_home_page() throws InterruptedException {
		login.checklogin();
		Thread.sleep(2000);
	}
	@Given("user is logged in")
	public void user_is_logged_in() {
	    
	}
	@When("user clicks on Welcome link")
	public void user_clicks_on_welcome_link() throws InterruptedException {
		login.clickWelcome();
		Thread.sleep(2000);
	    
	}
	@Then("logout link is displayed")
	public void logout_link_is_displayed() throws InterruptedException {
		login.checkLogout();
		Thread.sleep(2000);
	}
	
	@When("user clicks on Dashboard link")
	public void user_clicks_on_dashboard_link() {
		login.clickDashboard();
	    
	}
	@Then("quick launch toolbar is displayed")
	public void quick_launch_toolbar_is_displayed() {
		login.checkQuickLaunch();
	    
	}
	@After
	public void tearDown() throws InterruptedException {
		login.clickWelcome();
		Thread.sleep(2000);
		login.clickLogout();
		Thread.sleep(2000);
		driver.close();
		driver.quit();
	}

}
