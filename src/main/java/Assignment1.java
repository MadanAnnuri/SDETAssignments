import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/*............. PartialLinktext Assignment...............*/
public class Assignment1 {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demo.guru99.com/V4/");
        driver.findElement(By.partialLinkText("Bank")).click();
        // Here it was navigating to the requirement (first webelement having bank as Linktext)

        driver.findElement(By.partialLinkText("Project")).click();
        // here its navigating to the first element present in the webpage

    }
}
