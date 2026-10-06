package day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleHiddenDropdown {

	public static void main(String[] args) {
		
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get(" https://opensource-demo.orangehrmlive.com/web/index.php");
		
		driver.manage().window().maximize();
		
		//Login
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
		
		//Click PIM
		driver.findElement(By.xpath("//span[normaliz-space()='PIM']")).click();
		
		 // Click Job Title dropdown
		
		driver.findElement(By.xpath("//label[normalize-space()='Job Title']/following::dive[@contains(@class,'oxd-select-text')][1]")).click();
		
		
		//Count numvber of options
		
		
		List<WebElement> options = driver.findElements(By.xpath("//div[@role='listbox']//span"));
		
		 System.out.println("Number of Options: " + options.size());

	        // Select single option
	        driver.findElement(By.xpath(
	                "//div[@role='listbox']//span[normalize-space()='Financial Analyst']"
	        )).click();

	        driver.quit();
		
		

	}

}
