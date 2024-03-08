package PopUp.ChildBrowserPopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Set;

public class ChildBrowser {

    public WebDriver driver;
    @Test
    public void childBrowserPopUp(){
        driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();

        WebElement searchMobile = driver.findElement(By.xpath("//input[contains(@type, 'text')]"));
        searchMobile.sendKeys("mobiles"+"\n");

        WebElement motorola = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[1]/div[1]/div/div/img"));
        motorola.click();

        Set<String> windowHandles = driver.getWindowHandles();

        for (String handle : windowHandles) {
            if (!handle.equals(driver.getWindowHandle())) {

                driver.switchTo().window(handle);

                System.out.println("Child Window Title: " + driver.getTitle());
                driver.close();
                }

        }
        driver.switchTo().window(driver.getWindowHandles().iterator().next());

    }
}
