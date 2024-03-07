package Automation.Selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class CreateAccount {
    public WebDriver driver;

    @Test
    public void createAccount() throws InterruptedException {
        driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();

        driver.findElement(By.linkText("Create new account")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("firstname")));

        WebElement firstName = driver.findElement(By.name("firstname"));
        firstName.sendKeys("Shubham");

        WebElement lastName = driver.findElement(By.name("lastname"));
        lastName.sendKeys("Shah");

        WebElement email = driver.findElement(By.name("reg_email__"));
        email.sendKeys("8779817254");

        WebElement password = driver.findElement(By.name("reg_passwd__"));
        password.sendKeys("Whysoserious123#");

        WebElement day = driver.findElement(By.id("day"));
        day.sendKeys("4");

        WebElement month = driver.findElement(By.id("month"));
        month.sendKeys("April");

        WebElement year = driver.findElement(By.id("year"));
        year.sendKeys("2002");
    }
}
