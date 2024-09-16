import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class ActionsAssignment2 {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://testautomationpractice.blogspot.com/");

        Actions actions = new Actions(driver);

        WebElement name = driver.findElement(By.id("name"));
        actions.sendKeys("Madan Annuri").perform();

        actions.sendKeys(name, Keys.TAB).perform();
        WebElement email = driver.switchTo().activeElement();
        actions.sendKeys(email, "madan.annuri@gmail.com").perform();

    }
}
