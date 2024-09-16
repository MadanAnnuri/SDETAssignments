import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SourceType;

public class ActionsAssignment1 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.selenium.dev/downloads/");

         Actions action=new Actions(driver);
         action.keyDown(Keys.CONTROL).sendKeys(Keys.F5).perform();
        System.out.println("hello bala");

    }
}
