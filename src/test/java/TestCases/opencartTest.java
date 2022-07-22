package TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import PageObject.opencart;
import PageObject.opencartlandingpage;

public class opencartTest {

	WebDriver driver;
	@Test
	public void initialize()
	{
		System.setProperty("webdriver.chrome.driver","C:/Softwares_Jars/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/admin/index.php?route=common/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		opencart oc = new opencart(driver);
		oc.sendusername();
		oc.sendpassword();
		oc.clicklogin();
		
		opencartlandingpage olp = new opencartlandingpage(driver);
		olp.clickalertbutton();
		olp.clicksales();
		olp.clickorders();
		olp.pages();
		olp.tablevalues();
		
	}
	
}
