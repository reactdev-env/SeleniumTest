package Day7;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

public class FluentWaitDemo {

    public static void main(String[] args) throws InterruptedException {

        // Launch Chrome
        WebDriver driver = new ChromeDriver();

        // Fluent Wait declaration
        FluentWait<WebDriver> mywait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(1))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class);

      driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
      driver.manage().window().maximize();
      
      WebElement txtusername = mywait.until(new Function<WebDriver, WebElement>() {
		  public WebElement apply(WebDriver driver) {
			  return driver.findElement(By.xpath("//input[@placeholder='Username']"));
		  }
	  });
      
      txtusername.sendKeys("Admin");
      driver.close();
      
    }
}