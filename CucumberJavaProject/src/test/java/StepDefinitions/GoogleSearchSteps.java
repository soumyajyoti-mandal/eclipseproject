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

public class GoogleSearchSteps {
	
	WebDriver driver = null;
	@Given("browser is open")
	public void browser_is_open() {
		System.out.println("Inside step - browser is open");
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@And("user is on google search page")
	public void user_is_on_google_search_page() {
		System.out.println("Inside step - user is on google search page");
		driver.navigate().to("https://google.com");
	}

	@When("user enters a text in search text box")
	public void user_enters_a_text_in_search_text_box() throws InterruptedException {
		System.out.println("Inside step - user enters a text in search text box");
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("AutomationStepByStep");
		Thread.sleep(2000);
	}

	@And("hits enter")
	public void hits_enter() throws InterruptedException {
		System.out.println("Inside step - user enters a text in search text box");
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
	}

	@Then("user is navigated to the search results")
	public void user_is_navigated_to_the_search_results() throws InterruptedException {
		System.out.println("Inside step - user is navigated to the search results");
		driver.getPageSource().contains("Online Courses");
		Thread.sleep(2000);
		driver.close();
		driver.quit();
	}

}
