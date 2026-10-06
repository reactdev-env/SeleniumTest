package Day32;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch_AutoSuggestDropDown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.google.com");
		
		driver.manage().window().maximize();
		
		
		//Search box
		
		driver.findElement(By.name("q")).sendKeys("selenium");
		
		Thread.sleep(5000);
		
		//Capture all auto-suggestion options
		
		List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//li//div[@role='option']"));
		
		//print number of suggestions
		
		System.out.println(list.size());
		
		  // Print all suggestions and select Selenium
		
		
		for (int i=0; i<list.size(); i++) {
			
			System.out.println(list.get(i).getText());
			
			if(list.get(i).getText().equals("SELENIUM")) {
				
				list.get(i).click();
				break;
			}
		}
		
		
		
		driver.quit();
		

	}

}
