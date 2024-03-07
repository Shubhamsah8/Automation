package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class FaceBookActions {
    public WebDriver driver;

    @Test
    public void createAccount() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.facebook.com/");
        driver.findElement(By.linkText("Create new account")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("firstname")));

        WebElement firstName = driver.findElement(By.xpath("//input[contains(@name, 'firstname')]"));
        new Actions(driver).moveToElement(firstName).sendKeys("Shubham").perform();

        WebElement lastName = driver.findElement(By.xpath("//input[contains(@name, 'lastname')]"));
        new Actions(driver).moveToElement(lastName).sendKeys("Shah").perform();

        WebElement email = driver.findElement(By.xpath("//input[contains(@name, 'reg_email__')]"));
        new Actions(driver).moveToElement(email).sendKeys("shubhamsah086@gmail.com").perform();

        WebElement password = driver.findElement(By.xpath("//input[contains(@name, 'reg_passwd__')]"));
        new Actions(driver).moveToElement(password).sendKeys("Helloshubham123#").perform();

        WebElement day = driver.findElement(By.xpath("//select[contains(@id, 'day')]"));
        new Actions(driver).moveToElement(day).sendKeys("4").perform();

        WebElement month = driver.findElement(By.xpath("//select[contains(@id, 'month')]"));
        new Actions(driver).moveToElement(month).sendKeys("April").perform();

        WebElement year = driver.findElement(By.xpath("//select[contains(@id, 'year')]"));
        new Actions(driver).moveToElement(year).sendKeys("2002").perform();

        WebElement gender = driver.findElement(By.xpath("//input[contains(@type, 'radio') and contains(@value, '2')]"));
        new Actions(driver).moveToElement(gender).click().perform();

        WebElement signup = driver.findElement(By.xpath("//button[contains(text(), 'Sign Up')]"));
        new Actions(driver).moveToElement(signup).click().perform();
    }
}
