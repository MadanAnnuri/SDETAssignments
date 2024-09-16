import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAssignment1 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        System.out.println();

        driver.get("https://www.calculator.net/");

        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("String1");
        driver.findElement(By.xpath("//*[@name='calcSearchTerm']")).sendKeys("String2");
        driver.findElement(By.xpath("//input[@id='calcSearchTerm']")).sendKeys("String3");
        driver.findElement(By.xpath("//input[contains(@class,'inlongest')]")).sendKeys("String4");
        driver.findElement(By.xpath("//input[starts-with(@onkeyup,'return')]")).sendKeys("String5");

        driver.findElement(By.xpath("//span[text()='Search']")).click();

    }
}
