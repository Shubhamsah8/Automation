package PopUp.JavaScript;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertPopUp {

    public WebDriver driver;
    @Test
    public void alertPopup() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();

        WebElement alertClickHere = driver.findElement(By.xpath("//button[contains(@id, 'alertButton')]"));
        alertClickHere.click();
        Thread.sleep(2000);

        Alert alert = driver.switchTo().alert();

        String alertText = alert.getText();
        System.out.println("Alert Text: "+alertText);

        alert.accept();


    }
}
