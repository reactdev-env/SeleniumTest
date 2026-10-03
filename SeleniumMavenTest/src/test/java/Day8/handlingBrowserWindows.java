package Day8;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingBrowserWindows {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		
		 driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		 Set<String> CurrentWindow=driver.getWindowHandles();
		 System.out.println(CurrentWindow);
		 
		 //Approach1
		 
		 List<String> windowList= new ArrayList<>(CurrentWindow);
		 
		 String parentId = windowList.get(0);
		 String childId = windowList.get(1);
		 //Switch to child window
		 driver.switchTo().window(childId);
		 System.out.println(driver.getTitle());
		 
		 //switch back to parent window
		 
		 driver.switchTo().window(parentId);
		 System.out.println(driver.getTitle());
		 
		 //driver.quit();
		 
		 
	}

}
