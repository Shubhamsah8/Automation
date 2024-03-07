package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SwitchIframe {
    @Test
    public void swithcToIframe() {

        WebDriver driver = new ChromeDriver();

        driver.get("C:\\Users\\RYZEN\\IdeaProjects\\Automation\\src\\test\\java\\Iframe\\index.html");

        // Switch to iframe1
        driver.switchTo().frame("frame1");

        System.out.println(driver.findElement(By.tagName("h2")).getText());

        // Switch back to main page
        driver.switchTo().defaultContent();

        // Switch to iframe2
        driver.switchTo().frame("frame2");

        System.out.println(driver.findElement(By.tagName("h2")).getText());

        // Switch back to main page
        driver.switchTo().defaultContent();

    }
}
