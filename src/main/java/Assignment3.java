import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Assignment3 {
    public static void main(String[] args) {
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demo.guru99.com/V4/");
        List<WebElement> text=driver.findElements(By.tagName("input"));

        System.out.println(text.size());
        for(int i=0;i<text.size();i++){
            System.out.println(i+":"+text.get(i).getAccessibleName());
        }

    }
}
