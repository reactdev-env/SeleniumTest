package Day29;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {

	public static void main(String[] args) throws InterruptedException{
		
   WebDriver driver = new ChromeDriver();
   driver.get("https://the-internet.herokuapp.com/javascript_alerts");
  
   driver.manage().window().maximize();
   
   //Noraml alert-ok button
   
   driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
   Thread.sleep(2000);
   
   Alert myalert = driver.switchTo().alert();
   
   //Get alert text
   
   System.out.println(myalert.getText());
   
   //Click OK
   
   myalert.accept();
   
   //Confirmation alert- ok and cancel
   
   driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
   Thread.sleep(2000);
   
   Alert confirmAlert = driver.switchTo().alert();
   
   //clicks cancel
   
   confirmAlert.dismiss();
   
   //Prompt-alert - Input box
   driver.findElement(By.xpath("/button[normalize-space() = 'Click for JS Prompt']")).click();
   Thread.sleep(3000);
   
   
   Alert promptAlert = driver.switchTo().alert();
   
   //Enter text
   
   promptAlert.sendKeys("Welcome");
   
   
   //Click ok
   
   promptAlert.accept();
   
   driver.quit();
   
  
		

	}

}
