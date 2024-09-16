import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class TestNGAssignment1 {

    WebDriver driver;
    @BeforeMethod
    void OpenUrl(){
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.selenium.dev/");
    }
    @Test
    void ValidateText(){
        //Implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //Explicit Wait
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement xyz=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(""))));

       String element= driver.findElement(By.xpath("//span[text()='Downloads']")).getText();
        Assert.assertEquals(element,"Downloads","Content Not matched");
        System.out.println("Test Passed. The link text is 'Downloads'.");
    }
    @AfterMethod
    void TearDown(){
        driver.close();
    }
}
