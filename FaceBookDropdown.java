package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class FaceBookDropdown {
    public WebDriver driver;

    @Test
    public void createAccount() throws InterruptedException {
        driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();


        driver.findElement(By.linkText("Create new account")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("firstname")));

        WebElement firstName = driver.findElement(By.xpath("//input[contains(@name, 'firstname')]"));
        firstName.sendKeys("Shubham");

        WebElement lastName = driver.findElement(By.xpath("//input[contains(@name, 'lastname')]"));
        lastName.sendKeys("Shah");

        WebElement email = driver.findElement(By.xpath("//input[contains(@name, 'reg_email__')]"));
        email.sendKeys("8779817254");

        WebElement password = driver.findElement(By.xpath("//input[contains(@name, 'reg_passwd__')]"));
        password.sendKeys("Whysoserious123#");

        WebElement day_dropdown = driver.findElement(By.xpath("//select[contains(@id, 'day')]"));
        new Select(day_dropdown).selectByIndex(1);

        WebElement month = driver.findElement(By.xpath("//select[contains(@id, 'month')]"));
        new Select(month).selectByIndex(3);

        WebElement year = driver.findElement(By.xpath("//select[contains(@id, 'year')]"));
        new Select(year).selectByValue("2001");

        WebElement gender = driver.findElement(By.xpath("//input[contains(@type, 'radio') and contains(@value, '2')]"));
        gender.click();

        WebElement signup = driver.findElement(By.xpath("//button[contains(text(), 'Sign Up')]"));
        signup.click();
    }
}
