package PageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Webtable {
	
	
	public static final String ROW_XAPTH = "//div//table[@id='customers']//tbody//tr//following-sibling::tr";
	public static final String COLOUM_XPATH = "//div//table[@id='customers']//tbody//tr//th";
	
	
	WebDriver driver;
	
	public Webtable(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void tablevalues()
	{
		List<WebElement> rows = driver.findElements(By.xpath(ROW_XAPTH));
		System.out.println("NUMBER OF ROWS"+ " "+rows.size());
	
		List<WebElement> coloums = driver.findElements(By.xpath(COLOUM_XPATH));
		System.out.println("NUMBER OF COLOUMS"+ " "+coloums.size());
		
		
/*		for(int i=2;i<=rows.size();i++)
		{
			for(int j=1;j<=coloums.size();j++)
			{
				String Company = driver.findElement(By.xpath("//div//table[@id='customers']//tbody//tr["+i+"]//td["+j+"]")).getText();
				{
					System.out.print(Company+ " ");
				}		
			}
			
			System.out.println(" ");
		}
		*/
		
		
		for(int i=1;i<=rows.size();i++)
		{
			String Company = driver.findElement(By.xpath("//div//table[@id='customers']//tbody//tr//following-sibling::tr["+i+"]/td[1]")).getText();
			if(Company.equalsIgnoreCase("Amazon"))
			{
			String Contact = driver.findElement(By.xpath("//div//table[@id='customers']//tbody//tr//following-sibling::tr["+i+"]/td[2]")).getText();
			String Country = driver.findElement(By.xpath("//div//table[@id='customers']//tbody//tr//following-sibling::tr[" +i+ "]/td[3]")).getText();
			
			System.out.println(Company+" "+ Contact+ " "+ Country);
			}
		
		}
	
	}
	

}
