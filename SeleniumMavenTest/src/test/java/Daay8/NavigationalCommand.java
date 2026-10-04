package Daay8;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalCommand {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		
		driver.navigate().to("https://demo.nopcommerce.com/");   //accepts the url in the url ad string format
		
		//URL myurl = new URL("https://demo.nopcommece.com/");
		//driver.navigate().to(myurl);
		
		
		driver.navigate().to("https://demo.nopcommerce.com/");
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//driver.navigate().back();
		
		System.out.println(driver.getCurrentUrl());
	// https://demo.nopecommerce.com/
		
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
	}

}
