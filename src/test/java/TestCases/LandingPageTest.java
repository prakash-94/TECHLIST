package TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import PageObject.LandingPage;
import org.testng.Assert;

public class LandingPageTest {
	
	WebDriver driver;
	String gender = "Male";
	String exp = "5";
	String Profession = "Manual Tester";
	String Automationuft = "QTP";
	String AutomationSWD = "Selenium Webdriver";
	String AutomatiomProtractor = "Selenium IDE";
	String continentName = "Antartica";
	
	@Test
	public void initialize()
	{
		System.setProperty("webdriver.chrome.driver","C:/Softwares_Jars/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		LandingPage lp = new LandingPage(driver);
		lp.firstName();
		lp.lastname();
		lp.selectGender(gender);
		lp.experience(exp);
		lp.Date();
		lp.SelectProfession(Profession);
		lp.SELENIUMWEBDRIVER(AutomationSWD);
		lp.selectContinent(continentName);
		lp.SeleniumCommands();
		lp.uploadimage();
		lp.downloadfile();
		lp.Close();
		String Currenturl = lp.downloadfile();
		String Expectedurl= "https://github.com/stanfy/behave-rest/blob/master/features/conf.yaml";
		Assert.assertEquals(Currenturl, Expectedurl);
		driver.navigate().back();
		lp.button();
		
		
		
		driver.close();

	}
	

}
