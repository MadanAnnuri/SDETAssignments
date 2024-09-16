import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitsAssignment5 {
    public static void main(String[] args) {

        WebDriver driver= new ChromeDriver();

        try {

            driver.get("https://demo.guru99.com/V4/");

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            WebElement loginButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("btnLogin")));
            WebElement resetButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("btnReset")));

            if (loginButton.isDisplayed() && resetButton.isDisplayed()) {
                System.out.println("Both LOGIN and RESET buttons are present. Test Passed.");
            } else {
                System.out.println("One or both buttons are missing. Test Failed.");
            }

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Test Failed due to an exception.");
        } finally {
            driver.quit();
        }
    }
    }

