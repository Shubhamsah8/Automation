package Automation.Selenium;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.nio.file.Files;

public class FacebookScreenshot {

    public WebDriver driver;
    @Test
    public void takeScreenshot(){
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();

        File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        try{
            File destinationFile = new File("screenshot.jpg");
            Files.copy(screenshotFile.toPath(), destinationFile.toPath());

            System.out.println("Screenshot saved successfully to: "+destinationFile.getAbsolutePath());
        }
        catch (Exception e){
            System.out.println("Failed to save screenshot: "+e.getMessage());
        }

        driver.quit();
    }
}
