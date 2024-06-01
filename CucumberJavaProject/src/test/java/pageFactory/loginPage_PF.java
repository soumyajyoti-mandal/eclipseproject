package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage_PF {
	protected WebDriver driver;
	
	@FindBy(id = "name")
	WebElement txt_username;
	
	@FindBy(id = "password")
	WebElement txt_password;
	
	@FindBy(id = "login")
	WebElement btn_login;
	
	@FindBy(id = "logout")
	WebElement btn_logout;
	
	public loginPage_PF(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void enterUsername(String username){
		txt_username.sendKeys(username);
	}
	
	public void enterPassword() {
		txt_password.sendKeys("12345");
	}
	public void clickLogin() {
		btn_login.click();
	}
	public boolean checkLogin() {
		WebElement element;
		try {
			element  = btn_logout;
		} catch (Exception e) {
			return false;
		}
		return true;
		
	}
	public void clickLogout() {
		btn_logout.click();
	}

}
