package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	protected WebDriver driver;
	private By txt_username = By.id("name");
	private By txt_password = By.id("password");
	private By btn_login = By.id("login");
	private By btn_logout = By.id("logout");
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		if (!driver.getTitle().equals("TestProject Demo")) {
			throw new IllegalStateException("This is not login page");
		}
	}
	public void enterUsername(String username) {
		driver.findElement(txt_username).sendKeys(username);
	}
	public void enterPassword() {
		driver.findElement(txt_password).sendKeys("12345");
	}
	public void clickLogin() {
		driver.findElement(btn_login).click();
	}
	public void checkLogoutDisplayed() {
		driver.findElement(btn_logout).isDisplayed();
	}
	public void loginValidUser(String username) {
		driver.findElement(txt_username).sendKeys(username);
		driver.findElement(txt_password).sendKeys("12345");
		driver.findElement(btn_login).click();
	}

}
