import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;


public class ActionsAssignment4 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://omayo.blogspot.com/");
        WebElement mulsel=driver.findElement(By.id("drop1"));

        Actions action=new Actions(driver);
        action.moveToElement(mulsel).click().perform();

        for (int i = 0; i < 3; i++) {
            action.sendKeys(Keys.ARROW_DOWN).perform();
        }
     /*   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement doc3=driver.findElement(By.id("ironman4"));
        action.moveToElement(doc3).click().perform();*/


    }
}
