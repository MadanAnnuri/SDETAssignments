import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsAssignment3 {
    public static void main (String[] args){

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demo.guru99.com/V4/");

        Actions actions = new Actions(driver);
        WebElement drpdown=driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[1]"));
        actions.moveToElement(drpdown).click().perform();

        WebElement cusDlt=driver.findElement(By.xpath("//a[contains(text(),'Delete Customer Form')]"));
        actions.moveToElement(cusDlt).click().perform();

    }
}
