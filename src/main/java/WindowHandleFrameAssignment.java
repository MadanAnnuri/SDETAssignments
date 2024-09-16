import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Set;

public class WindowHandleFrameAssignment {
public static void main(String[] args){

    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    WebDriver                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  Wait
    String parentHandle= driver.getWindowHandle();

    driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_link_target");
    driver.switchTo().frame(1);
    driver.findElement(By.xpath("//a[contains(text(),'com!')]")).click();

    Set<String> allWindowHandles = driver.getWindowHandles();

    for (String windowHandle : allWindowHandles) {
        if (!windowHandle.equals(parentHandle)) {
            driver.switchTo().window(windowHandle);
            break;
        }
    }

    List  Tags = driver.findElements(By.tagName("a"));
    System.out.println("all tags available in Child window: "+Tags.size());

    driver.switchTo().window(parentHandle);
    System.out.println("Title of parent window: "+driver.getTitle());

    driver.quit();





}
}
