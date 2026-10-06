package Day32;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTable {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://testautomationpractice.blogspot.com");

        driver.manage().window().maximize();

        // 1. Find total number of rows in a table

        int rows = driver.findElements(
                By.xpath("//table[@name='BookTable']//tr")
        ).size();

        System.out.println("Total number of rows: " + rows);


        // 2. Find total number of columns in a table

        int columns = driver.findElements(
                By.xpath("//table[@name='BookTable']//th")
        ).size();

        System.out.println("Total number of columns: " + columns);


        // 3. Read data from specific row and column
        // 5th row and 1st column

        String bookName = driver.findElement(
                By.xpath("//table[@name='BookTable']//tr[5]/td[1]")
        ).getText();

        System.out.println("Book name is: " + bookName);


        // 4. Read all data from all rows and columns

        System.out.println(
                "BookName" + "\t" +
                "Author" + "\t" +
                "Subject" + "\t" +
                "Price"
        );

        
        
        for (int r1 = 2; r1 <= rows; r1++) {

            for (int c = 1; c <= columns; c++) {

                String data = driver.findElement(
                        By.xpath("//table[@name='BookTable']//tr[" + r1 + "]/td[" + c + "]")
                ).getText();

                System.out.print(data + "\t");
            }

            System.out.println();
        }


        // 5. Print Book name based on author "Mukesh"

        for (int r = 2; r <= rows; r++) {

            // Get author name from column 2

            String authorName = driver.findElement(
                    By.xpath("//table[@name='BookTable']//tr[" + r + "]/td[2]")
            ).getText();

            // Check if author is Mukesh

            if (authorName.equals("Mukesh")) {

                // Get book name from column 1

                String bookName1 = driver.findElement(
                        By.xpath("//table[@name='BookTable']//tr[" + r + "]/td[1]")
                ).getText();

                System.out.println(
                        "Book Name: " + bookName1 + "\tAuthor: " + authorName
                );
            }
        }
        
        
        
        //find total number of all the books
        for (int r =2; r<=rows; r++)
        {
        	String price = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
        	System.out.println(price);
        }

        driver.quit();
    }
}