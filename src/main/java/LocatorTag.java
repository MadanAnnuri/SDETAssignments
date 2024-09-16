import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.text.html.HTML;
import java.util.List;

public class LocatorTag {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://www.amazon.in/");
        driver.navigate().to("");
       List  Tags = driver.findElements(By.tagName("a"));
        System.out.println("all tags: "+Tags.size());

       /* for(int i=0;i< Tags.size();i++){
            System.out.println("Link : "+ i +Tags.get(i).getText());
        }*/

       /* for(WebElement l:Tags)
            System.out.println(l.getText());*/
    }
}
