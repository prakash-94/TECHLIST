package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class opencart {
	
	public static final String LOGIN_CSSSELECTOR = "#input-username";
	public static final String PASSWORD_CSSSELECTOR = "#input-password";
	public static final String LOGIN_XAPTH = "//button[@type='submit']";
	
	
	
	@FindBy(css=LOGIN_CSSSELECTOR)
	WebElement username;
	
	@FindBy(css=PASSWORD_CSSSELECTOR)
	WebElement password;
	
	@FindBy(xpath= LOGIN_XAPTH)
	WebElement login;
	
	
	
	WebDriver driver;
	
	public opencart(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void sendusername()
	{
		username.sendKeys("demo");
	}
	
	public void sendpassword()
	{
		password.sendKeys("demo");
	}
	
	public void clicklogin()
	{
		login.click();
	}
	

}
