package PageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.agent.builder.AgentBuilder.InitializationStrategy.SelfInjection.Split;

public class opencartlandingpage {
	
	public static final String ALLERTCANCEL_CSSSELECTOR = "button[class='btn-close']";
	public static final String SALES_CSSSELECTOR = "a[href='#collapse-4']";
	//public static final String ORDERS_xpath = "(//li[@id='menu-sale']//ul[@id='collapse-4']//li//a) [1]";
	public static final String ORDERS_xpath = "(//li[@id='menu-sale']//li) [1]";
	public static final String PAGES_XPATH = "//div[@class='col-sm-6 text-end'] ";
	
	public static final String  ROW_XPATH = "//table[@class='table table-bordered table-hover']//following-sibling::tr";
	public static final String COLOUM_XPATH = "//table[@class='table table-bordered table-hover']//tr/td";
	
	
	
	@FindBy(css=ALLERTCANCEL_CSSSELECTOR)
	WebElement alertbutton;
	
	@FindBy(css=SALES_CSSSELECTOR)
	WebElement sales;
	
	@FindBy(xpath=ORDERS_xpath)
	WebElement orders;

	WebDriver driver;
	
	public opencartlandingpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void clickalertbutton()
	{
		alertbutton.click();
	}
	
	public void clicksales()
	{
		sales.click();
	}
	
	public void clickorders()
	{
		orders.click();
	}
	
	public void pages()
	{
		String numberofpages = driver.findElement(By.xpath(PAGES_XPATH)).getText();
		System.out.println("NUMBER OF PAGES = "+ numberofpages.charAt(23));
		
		for(int i=1;i<=numberofpages;i++)
		{
			WebElement activepage = driver.findElement(By.cssSelector("//ul[@class='pagination']//li//span"));
		}
	}
	
	
	public void tablevalues()
	{
		List<WebElement> rows = driver.findElements(By.xpath(ROW_XPATH));
		System.out.println("NUMBER OF ROWS = "+rows.size());
		
		List<WebElement> coloums = driver.findElements(By.xpath(COLOUM_XPATH));
		System.out.println("NUMBER OF COLOUMS = "+coloums.size());
		
	}
}
 