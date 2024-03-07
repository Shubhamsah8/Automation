package Automation.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDrop {

    public WebDriver driver;
    @Test
    public void drag_and_drop(){
        driver = new ChromeDriver();

        driver.get("https://www.w3schools.com/html/html5_draganddrop.asp");
        driver.manage().window().maximize();

        WebElement source_file = driver.findElement(By.xpath("//*[@id=\"drag1\"]"));

        WebElement destination_file = driver.findElement(By.xpath("//*[@id=\"div2\"]"));

        Actions actions = new Actions(driver);

        actions.dragAndDrop(source_file, destination_file).build().perform();
    }

    @Test
    public void click_and_release(){
        driver = new ChromeDriver();

        driver.get("https://www.w3schools.com/html/html5_draganddrop.asp");
        driver.manage().window().maximize();

        WebElement source_file = driver.findElement(By.xpath("//*[@id=\"drag1\"]"));

        WebElement destination_file = driver.findElement(By.xpath("//*[@id=\"div2\"]"));

        Actions actions = new Actions(driver);

        actions.clickAndHold(source_file).moveToElement(destination_file).release().build().perform();
    }

}
