package javalocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

    public static void main(String[] args) {

        // Launch the Chrome browser
        WebDriver driver = new ChromeDriver();

        // Open the URL
        driver.get("https://www.Amazon.com/");

        // Maximize the browser
        //driver.manage().window().maximize();

        // -------------------------------
        // 1. ID Locator
        // -------------------------------

        //WebElement input = driver.findElement(By.id("ti6dpd"));

        //input.sendKeys("You got the id of search");

       // System.out.println("The ID of search is: "
               // + input.getAttribute("id"));


        // -------------------------------
        // 2. XPath Locator
        // -------------------------------

        //WebElement searchButton = driver.findElement(
             //   By.xpath("//*[@id='sI1XGe']/div[1]/svg")
       // );

        //searchButton.click();
        
        
        //3.class
        String classLocator = driver.findElement(By.className("productTitle"))
                .getText();

System.out.println("The title is: " + classLocator);

        // Close the browser
        //driver.quit();
    }
}