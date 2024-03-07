package JavaScriptExecutable;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavaScriptExecute {
    @Test
    public void javaScriptExecutor() {

        WebDriver driver = new ChromeDriver();


        driver.get("C:\\Users\\RYZEN\\IdeaProjects\\Automation\\src\\test\\java\\JavaScriptExecutable\\javascript_sample.html");

        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;


        WebElement textBox = driver.findElement(By.id("textbox1"));
        jsExecutor.executeScript("arguments[0].value = 'Shubh'", textBox);


        WebElement disabledTextBox = driver.findElement(By.id("textbox2"));
        jsExecutor.executeScript("arguments[0].value = 'Clark';", disabledTextBox);

        jsExecutor.executeScript("changeColor();");

    }
}
