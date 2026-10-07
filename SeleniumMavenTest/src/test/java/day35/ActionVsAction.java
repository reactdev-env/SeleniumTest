package day35;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionVsAction {

    public static void main(String[] args) {

        // Launch Chrome browser
        WebDriver driver = new ChromeDriver();

        // Open website
        driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");

        // Maximize browser
        driver.manage().window().maximize();

        // Locate the button
        WebElement button = driver.findElement(
                By.xpath("//span[@class='context-menu-one btn btn-neutral']")
        );

        // Create Actions object
        Actions act = new Actions(driver);

        // Build the right-click action and store it in Action variable
        Action myAction = act.contextClick(button).build();

        // Perform the action
        myAction.perform();

        // Close browser
        //driver.quit();
    }
}