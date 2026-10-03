package Day4Cpathdemo;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CPathdem {

	public static void main (String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		
		driver.manage().window().maximize();
		
		//Xpath with single attribute
		
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Macbook");
		
		//Xpath with Multiple  attribute
		driver.findElement(By.xpath("//input[@name='Search'][@placeholder='search']")).sendKeys("Macbook");
		
		 // XPath with 'and' operator
		
	driver.findElement(By.xpath("//input[@name='search'] and [@placeholder='search']")).sendKeys("Pavan");
	// XPath with 'or' operator
	driver.findElement(By.xpath("//input[@name='search'] or [@plcaeholder='search']")).sendKeys("Chandhini");
	
	//XPath with InnerText

	driver.findElement(By.xpath("//text()='Featured']")).isDisplayed();
	
	boolean b=driver.findElement(By.xpath("//n3[text()='featured']")).isDisplayed();
	
	System.out.println(b);
	
	String value=driver.findElement(By.xpath("//h3[text()='featured']")).getText();
	System.out.println(value);
	
	//Xpath with contains()
	driver.findElement(By.xpath("//input[contains(@placeholder,'Search')]")).sendKeys("Macbook");	
	
	
	//Chained Xpath
	
	boolean imagestatus=driver.findElement(By.xpath("//div[@id='logo']/a/img")).isDisplayed();
	System.out.println("imagestatus");
	
	
	
	
	
	
	
	}
	
	
}
