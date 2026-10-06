package day31;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropAction {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		
		
		
		driver.manage().window().maximize();
		
		
		//Locate source and target elements
		
		WebElement source = driver.findElement(By.xpath("//div[@id='box6']"));
		
		WebElement target = driver.findElement(By.xpath("/div[@id='box106']"));
		
		//Create action class object
		Actions act = new Actions(driver);
		
		//Drag and drop
		
		act.dragAndDrop(source, target).perform();
		
		//close browse
		
		driver.quit();
		
		
		
		 ;
	}

}
