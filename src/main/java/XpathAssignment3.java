import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class XpathAssignment3 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://formy-project.herokuapp.com/form");
        List<WebElement> elements =driver.findElements(By.xpath("//input[starts-with(@placeholder,'Enter')]"));
        System.out.println("Available elements with common xpath size: "+elements.size());
    }
}
