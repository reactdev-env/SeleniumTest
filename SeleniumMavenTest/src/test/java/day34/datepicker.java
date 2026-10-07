package day34;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class datepicker {

    // Method to select Month and Year
    static void selectMonthAndYear(WebDriver driver, String month, String year) {

        while (true) {

            // Get current displayed month
            String currentMonth = driver
                    .findElement(By.xpath("//span[@class='ui-datepicker-month']"))
                    .getText();

            // Get current displayed year
            String currentYear = driver
                    .findElement(By.xpath("//span[@class='ui-datepicker-year']"))
                    .getText();

            System.out.println("Current Month: " + currentMonth);
            System.out.println("Current Year: " + currentYear);

            // If required month and year are displayed, stop
            if (currentMonth.equals(month) && currentYear.equals(year)) {
                break;
            }

            // Convert year to integer for comparison
            int currentYearInt = Integer.parseInt(currentYear);
            int requiredYearInt = Integer.parseInt(year);

            // Get month numbers
            int currentMonthNumber = getMonthNumber(currentMonth);
            int requiredMonthNumber = getMonthNumber(month);

            // Decide Previous or Next
            if (requiredYearInt < currentYearInt ||
                (requiredYearInt == currentYearInt &&
                 requiredMonthNumber < currentMonthNumber)) {

                // Click Previous Month
                driver.findElement(
                        By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")
                ).click();

            } else {

                // Click Next Month
                driver.findElement(
                        By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")
                ).click();
            }
        }
    }


    // Convert month name to month number
    static int getMonthNumber(String month) {

        switch (month) {

            case "January":
                return 1;

            case "February":
                return 2;

            case "March":
                return 3;

            case "April":
                return 4;

            case "May":
                return 5;

            case "June":
                return 6;

            case "July":
                return 7;

            case "August":
                return 8;

            case "September":
                return 9;

            case "October":
                return 10;

            case "November":
                return 11;

            case "December":
                return 12;

            default:
                throw new IllegalArgumentException("Invalid month: " + month);
        }
    }


    public static void main(String[] args) {

        // Launch Chrome
        WebDriver driver = new ChromeDriver();

        // Implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Open website
        driver.get("https://jqueryui.com/datepicker/");

        // Maximize browser
        driver.manage().window().maximize();

        // Switch to iframe
        driver.switchTo().frame(0);

        // Date to select
        String year = "2026";
        String month = "April";
        String date = "20";

        // Open Datepicker
        driver.findElement(
                By.xpath("//input[@id='datepicker']")
        ).click();

        // Select Month and Year
        selectMonthAndYear(driver, month, year);

        // Select Date
        driver.findElement(
                By.xpath("//table[contains(@class,'ui-datepicker-calendar')]//a[text()='"
                        + date + "']")
        ).click();

        System.out.println("Date selected successfully");

        // Close browser
        driver.quit();
    }
}