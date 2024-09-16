import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Assignment2 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://omayo.blogspot.com/");
        List<WebElement> Links =driver.findElements(By.tagName("a"));
        System.out.println("Total no of Links in a WebPage: "+Links.size());
        System.out.println("Total Available links details");

        for(int i=0;i< Links.size();i++){
            System.out.println(i+1 +" " + Links.get(i).getText());
        }
/*
        *//* Using for each loop*//*
        for(WebElement l:Links) {
            System.out.println(l.getText());
        }*/

    }
}
