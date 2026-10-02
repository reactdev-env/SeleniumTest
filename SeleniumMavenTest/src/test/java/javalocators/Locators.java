package javalocators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

    public static void main(String[] args) {

        // Launch Chrome
        WebDriver driver = new ChromeDriver();

        // Open Google
        driver.get("https://www.google.com");

        // Maximize browser
        driver.manage().window().maximize();


        // =========================================================
        // 1. NAME LOCATOR
        // =========================================================

        // Google search box has name = "q"
        driver.findElement(By.name("q")).sendKeys("Selenium Java");

        // Clear the search box
        driver.findElement(By.name("q")).clear();


        // =========================================================
        // 2. ID LOCATOR
        // =========================================================

        // Example of finding an element using ID
        // Uncomment and inspect Google's current HTML if needed

        // driver.findElement(By.id("someId")).click();


        // =========================================================
        // 3. CLASSNAME LOCATOR
        // =========================================================

        List<WebElement> elements =
                driver.findElements(By.className("g"));

        System.out.println("Number of elements with class 'g': "
                + elements.size());


        // =========================================================
        // 4. TAGNAME LOCATOR
        // =========================================================

        List<WebElement> links =
                driver.findElements(By.tagName("a"));

        System.out.println("Total number of links: "
                + links.size());


        // =========================================================
        // 5. LINKTEXT LOCATOR
        // =========================================================

        // Example:
        // driver.findElement(By.linkText("About")).click();


        // =========================================================
        // 6. PARTIALLINKTEXT LOCATOR
        // =========================================================

        // Example:
        // driver.findElement(By.partialLinkText("Ab")).click();


        // =========================================================
        // 7. CSS SELECTOR
        // =========================================================

        // Google search box using CSS selector
        WebElement searchBox =
                driver.findElement(By.xpath("//textarea[@id='ti6dpd']"));

        searchBox.sendKeys("pavan");

        System.out.println("Search box displayed: "
                + searchBox.isDisplayed());


        // =========================================================
        // 8. XPATH LOCATOR
        // =========================================================

        WebElement searchBox2 =
                driver.findElement(By.xpath("//textarea[@name='q']"));

        System.out.println("Search box enabled: "
                + searchBox2.isEnabled());


        // =========================================================
        // 9. FIND MULTIPLE ELEMENTS
        // =========================================================

        List<WebElement> allImages =
                driver.findElements(By.tagName("img"));

        System.out.println("Total number of images: "
                + allImages.size());


        // Close browser
        //driver.quit();
    }
}