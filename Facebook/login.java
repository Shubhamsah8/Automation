package Automation.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class login {
    public WebDriver driver;

    @Test
    public void facebookLogin(){
        driver = new ChromeDriver();  //New Chrome driver
        driver.get("https://www.facebook.com/"); //Link to lauch the application
        driver.manage().window().maximize(); // To maximize the size of the window

        //Get the title of the browser window
        String title = driver.getTitle();
        System.out.println(title);

        // Get the Current URL
        String  url = driver.getCurrentUrl();
        System.out.println(url);

        // Get the page source code of the window
        String source = driver.getPageSource();
        System.out.println(source);

        // To close the window
        driver.close();

        // Navigate to different site
        driver.navigate().to("https://www.flipkart.com/");

        driver.findElement(By.name("email")).sendKeys("Shubham");
        driver.findElement(By.name("pass")).sendKeys("Hello123");

        driver.findElement(By.name("login")).click();
    }
}
