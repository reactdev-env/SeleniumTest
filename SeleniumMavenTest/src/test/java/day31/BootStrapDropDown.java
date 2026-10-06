package day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrapDropDown {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		
		//Select multiple options from the dropdown
		
		driver.findElement(By.xpath("//button[contains(@class,'multiselect']")).click();
		
		//select single option java
		
		driver.findElement(By.xpath("//input[@value='java']")).click();
		
		//capture all the options
		
		List<WebElement> options =driver.findElements(By.xpath("//ul[contains(@class,'multiselect-container')]//label"));
		
		//find out the size
		
		System.out.println("Number of options: " +options.size());
		
		//print all options
		
		for(WebElement option:options) {
			System.out.println(option.getText());
		}
		
		//Select multiple options
		
		for(WebElement op:options) {
			String option = op.getText();
			if(op.getText().equals("Java") || op.getText().equals("Python") || op.getText().equals("My sql")){
				
				op.click();
				
			}
		}
		//close browser
		driver.quit();

	}

}
