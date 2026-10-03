package Day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	System.out.println(driver.getTitle());
		
		//driver.manage().window().maximize();
		//get title-returns the title of the page
		
		System.out.println(driver.getTitle());
		
		//getCurrentUrl() - returns URL of the page
		System.out.println(driver.getCurrentUrl());
		
		//getPageSource() - returns source code of the page
		
           String PageSource= driver.getPageSource();
           System.out.println("The page source value is "+PageSource);
		
		//driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		//driver.findElement(By.name("password")).sendKeys("admin123");
		

	}

}
