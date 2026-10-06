package day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelctDropDown {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpraactice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		
		//Locate the country dropdown
		
		WebElement drpCountryEl = driver.findElement(By.xpath("//select[@id='country']"));
		
		//Create select object
		
		Select drpCountry = new Select(drpCountryEl);
		
		//Selectoption from dropdown
		
		drpCountry.selectByContainsVisibleText("France");
		drpCountry.selectByValue("australia");
		drpCountry.selectByIndex(2);
		
		
		//Capture the options from the dropdown
		
	List<WebElement>options = drpCountry.getOptions();
	
	System.out.println("Num of options:" +options.size());
	
	
	
	
		
		//printing the options
		
		for(int i=0;i<options.size();i++)
		{
			System.out.println(options.get(i).getText());
		}
		
//Enhancing for loop
		for(WebElement op:options) {
			System.out.println(op.getText());
		}
		
		driver.quit();
	}

}
