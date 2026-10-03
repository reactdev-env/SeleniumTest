package day3selectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        
        //tagid tag #id
        driver.manage().window().maximize();//maximize the browser window
        driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("Apple MacBook Pro 13-inch");
        driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("Apple MacBook Pro 13-inch");
        //driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Apple");
         //tag and class combo(tag class tag tag[attribute=value"])
        
        driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("T-Shirts");
        driver.findElement(By.cssSelector(".search-box-text")).sendKeys("T-Shirts");
        
        
        //Tag attribute
        
        driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("t-Shirts");
        	
	}
}
