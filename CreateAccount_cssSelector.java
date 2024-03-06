package Automation.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class CreateAccount_cssSelector {
    public WebDriver driver;

    @Test

    public void createAccount_css(){
        driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();

        driver.findElement(By.linkText("Create new account")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("firstname")));

        driver.findElement(By.cssSelector("input[name=\"firstname\"")).sendKeys("Shubham");
        driver.findElement(By.cssSelector("input[name=\"lastname\"")).sendKeys("Shah");
        driver.findElement(By.cssSelector("input[name=\"reg_email__\"")).sendKeys("8779817254");

        driver.findElement(By.cssSelector("input[name=\"reg_passwd__\"")).sendKeys("Whysoserious123#");
        driver.findElement(By.id("day")).sendKeys("4");
        driver.findElement(By.id("month")).sendKeys("April");
        driver.findElement(By.id("year")).sendKeys("2002");
    }
}
