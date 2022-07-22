package TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import PageObject.Webtable;

public class WebTebleTest {

	WebDriver driver;
	@Test
	public void initialize()
	{
		System.setProperty("webdriver.chrome.driver","C:/Softwares_Jars/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Webtable wt = new Webtable(driver);
		
		wt.tablevalues();
	}
	
		
	
}
