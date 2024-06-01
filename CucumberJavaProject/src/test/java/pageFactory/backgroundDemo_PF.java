package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class backgroundDemo_PF {
	protected WebDriver driver;
	
	@FindBy(name = "username")
	WebElement txt_username;
	
	@FindBy(name = "password")
	WebElement txt_password;
	
	@FindBy(xpath = "//button[text()=' Login ']")
	WebElement btn_login;
	
	@FindBy(xpath = "//span[text()='Dashboard']")
	WebElement lbl_dashboard;
	
	@FindBy(xpath = "//*[@class='oxd-userdropdown-name']")
	WebElement lnk_welcome;
	
	@FindBy(xpath = "//*[text()='Logout']")
	WebElement lnk_logout;
	
	@FindBy(xpath="//*[text()='Quick Launch']")
	WebElement lbl_quicklaunch;
	
	public backgroundDemo_PF(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void entercredentials() {
		txt_username.sendKeys("Admin");
		txt_password.sendKeys("admin123");
	}
	
	public void clickLogin() {
		btn_login.click();
	}
	public void checklogin() {
		lbl_dashboard.isDisplayed();
	}
	public void clickWelcome() {
		lnk_welcome.click();
	}
	public void checkLogout() {
		lnk_logout.isDisplayed();
	}
	
	public void clickLogout() {
		lnk_logout.click();
	}
	public void clickDashboard() {
		lbl_dashboard.click();
	}
	public void checkQuickLaunch() {
		lbl_quicklaunch.isDisplayed();
	}

}
