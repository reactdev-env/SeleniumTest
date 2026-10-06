package Day33;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicPainationTa {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://demo.opencart.com/admin/index.php");

        driver.manage().window().maximize();

        // 1. Enter username
        WebElement username = driver.findElement(
                By.xpath("//input[@id='input-username']")
        );

        username.clear();
        username.sendKeys("demo");

        // 2. Enter password
        WebElement password = driver.findElement(
                By.xpath("//input[@id='input-password']")
        );

        password.clear();
        password.sendKeys("demo");

        // 3. Click Login
        driver.findElement(
                By.xpath("//button[normalize-space()='Login']")
        ).click();

        // 4. Close alert/window if available
        List<WebElement> closeButtons = driver.findElements(
                By.xpath("//button[@class='btn-close']")
        );

        if (closeButtons.size() > 0 && closeButtons.get(0).isDisplayed()) {
            closeButtons.get(0).click();
        }

        // 5. Get pagination text
        String text = driver.findElement(
                By.xpath("//div[contains(text(),'Pages')]")
        ).getText();

        System.out.println("Pagination text: " + text);

        // Example:
        // Showing 1 to 10 of 19081 (1909 Pages)

        // 6. Extract total number of pages
        int totalPages = Integer.parseInt(
                text.substring(
                        text.indexOf("(") + 1,
                        text.indexOf("Pages") - 1
                )
        );

        System.out.println("Total number of pages: " + totalPages);

        // 7. Repeat through all pages
        for (int p = 1; p <= totalPages; p++) {

            System.out.println("========== Page " + p + " ==========");

            // Click page number
            if (p > 1) {

                WebElement pageNumber = driver.findElement(
                        By.xpath("//ul[@class='pagination']//a[normalize-space()='" + p + "']")
                );

                pageNumber.click();
            }

            // 8. Find number of rows
            int noOfRows = driver.findElements(
                    By.xpath("//table[contains(@class,'table')]//tbody//tr")
            ).size();

            System.out.println("Number of rows: " + noOfRows);

            // 9. Read data from each row
            for (int i = 1; i <= noOfRows; i++) {

                String customer = driver.findElement(
                        By.xpath("//table[contains(@class,'table')]//tbody//tr[" + i + "]/td[2]")
                ).getText();

                String email = driver.findElement(
                        By.xpath("//table[contains(@class,'table')]//tbody//tr[" + i + "]/td[3]")
                ).getText();

                String status = driver.findElement(
                        By.xpath("//table[contains(@class,'table')]//tbody//tr[" + i + "]/td[5]")
                ).getText();

                System.out.println(
                        customer + "\t" + email + "\t" + status
                );
            }
        }

        // 10. Close browser
        driver.quit();
    }
}