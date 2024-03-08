package PopUp.JavaScript;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PromptPopUp {
    public WebDriver driver;

    @Test
    public void promptPopUp() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();

        WebElement prompt = driver.findElement(By.xpath("//button[contains(@id, 'promtButton')]"));
        prompt.click();
        Thread.sleep(2000);

        Alert alert = driver.switchTo().alert();

        String promptText = alert.getText();
        System.out.println("Prompt Text: " + promptText);

        alert.sendKeys("Clicking to accept");

        alert.accept();
    }

    @Test
    public void promptPopUp1() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();

        WebElement prompt = driver.findElement(By.xpath("//button[contains(@id, 'promtButton')]"));
        prompt.click();
        Thread.sleep(2000);

        Alert alert = driver.switchTo().alert();

        String promptText = alert.getText();
        System.out.println("Prompt Text: " + promptText);

        alert.sendKeys("Clicking to dismiss");

    }
}
