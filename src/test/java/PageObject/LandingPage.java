package PageObject;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LandingPage {

	
	
	public static final String FIRSTNAME_CSSSELECTOR = "input[name='firstname']";
	public static final String LATENAME_CSSSELECTOR = "input[name='lastname']";
	public static final String GENDER_XPATH = "//div[@class='control-group']//b[text()='Gender']//following-sibling::input";
	public static final String EXPERIENCE_XPATH = "//div[@class='control-group']//span[text()='Years of Experience']//following-sibling::input";
	public static final String DATE_CSSSELECTOR = "#datepicker";
	public static final String PROFESSION_XPATH = "//div[@class='control-group']//span[text()='Profession']//following-sibling::input";
	public static final String AUTOMATIONTOOLS_Xapth = "//div[@class='control-group']//span[text()='Automation Tools']//following-sibling::input";
	public static final String  CONTINENTS_CSSSELECTOR = "#continents";
	public static final String SELENIUMCOMMANDS_CSSSELECTOR = "#selenium_commands";
	public static final String PHOTO_CSSSELECTOR = "#photo";
	public static final String DOWNLOADFILE_CSSSELECTOR = "a[href*='conf.yaml']";
	public static final String CLOSE_CSSSELECTOR = "div[id='dismiss-button']";
	public static final String BUTTON_ID ="#submit";
	
	
	@FindBy(css=FIRSTNAME_CSSSELECTOR)
	WebElement firstname;
	
	@FindBy(css = LATENAME_CSSSELECTOR)
	WebElement lastname;
	
/*	@FindBy (xpath = GENDER_XPATH)
	WebElement gender;
*/
	
	/*
	 * @FindBy(xpath = EXPERIENCE_XPATH) String experience;
	 */
	
	@FindBy(css= DATE_CSSSELECTOR)
	WebElement date;
	
/*	@FindBy(xpath=PROFESSION_XPATH)
	WebElement profession;
*/
	
/*	@FindBy(xpath =AUTOMATIONTOOLS_Xapth)
	WebElement automationtools;
	*/
	
	@FindBy(css= CONTINENTS_CSSSELECTOR)
	WebElement continents;
	
	@FindBy(css=SELENIUMCOMMANDS_CSSSELECTOR)
	WebElement seleniumcommands;
	
/*	@FindBy(css=PHOTO_CSSSELECTOR)
	WebElement photo;
*/
	
	@FindBy(css=DOWNLOADFILE_CSSSELECTOR)
	WebElement downloadfile;
	
	@FindBy(css=CLOSE_CSSSELECTOR)
	WebElement close;
	
	
	@FindBy(id=BUTTON_ID)
	WebElement button;
	
	
	
	WebDriver driver;
	
	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver =driver;
		PageFactory.initElements(driver, this);
	}

	public void firstName()
	{
		firstname.sendKeys("JAVVAJI");
	}
	
	public void lastname()
	{
		lastname.sendKeys("PRAKASHRAJ");
	}
	
	public void selectGender(String gender)
	{
		List<WebElement> genders  = driver.findElements(By.xpath(GENDER_XPATH));
		for(WebElement gen : genders)
		{
			if((gen.getAttribute("value")).equals(gender))
				gen.click();
				break;
			
		}
	}
	
	public void experience(String exp)
	{
		List<WebElement> Options = driver.findElements(By.xpath(EXPERIENCE_XPATH));
		
		for(WebElement opt : Options)
		{
			if((opt.getAttribute("value")).equals(exp))
			{
			opt.click();
			break;
			}		
		}
		
	}
	
	public void Date()
	{
		date.sendKeys("13/07/2022");
	}
	
	public void profession()
	{
		List<WebElement> prof = driver.findElements(By.xpath(PROFESSION_XPATH));
		for(WebElement profession : prof)
		{
			profession.click();
		}
	}
	

	public void SelectProfession(String Profession)
	{
		List<WebElement> prof = driver.findElements(By.xpath(PROFESSION_XPATH));
		for(WebElement profession : prof)
		{
			if((profession.getAttribute("value")).equals(Profession))
			{
			profession.click();
			}
		}
	}
	
	public void UFT(String Automationuft)
	{
		List<WebElement> tool  = driver.findElements(By.xpath(AUTOMATIONTOOLS_Xapth));
		
		for(WebElement tool1 : tool)
		{
			if((tool1.getAttribute("value")).equals(Automationuft))
			{
			tool1.click();
			}
		}
	}
	
	
	public void PROTRACTOR(String AutomationProtractor)
	{
		List<WebElement> tool  = driver.findElements(By.xpath(AUTOMATIONTOOLS_Xapth));
		
		for(WebElement tool2 : tool)
		{
			if((tool2.getAttribute("value")).equals(AutomationProtractor))
			{
			tool2.click();
			}
		}
	}
	
	public void SELENIUMWEBDRIVER(String AutomationSWD)
	{
		List<WebElement> tool  = driver.findElements(By.xpath(AUTOMATIONTOOLS_Xapth));
		
		for(WebElement tool3: tool)
		{
			if((tool3.getAttribute("value")).equals(AutomationSWD))
			{
			tool3.click();
			}
		}
	}
	
	public void selectContinent(String continentName)
	{
		continents.sendKeys(continentName);
	}
	
	public void SeleniumCommands()
	{
		Select option = new Select(seleniumcommands);
		
		option.selectByVisibleText("WebElement Commands");
		option.selectByVisibleText("Wait Commands");
	}
	
	public void uploadimage()
	{
		WebElement photo = driver.findElement(By.cssSelector(PHOTO_CSSSELECTOR));
		photo.sendKeys("C:\\Users\\Admin\\Pictures\\prakash.jfif");
	}
	
	public String downloadfile()
	{
		downloadfile.click();
		
	return	driver.getCurrentUrl();
	}
	public void Close()
	{
		close.click();
	
	}
	
	public void button()
	{
		button.click();
	}
	
	
}
