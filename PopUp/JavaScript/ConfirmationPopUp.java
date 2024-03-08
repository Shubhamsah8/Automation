package PopUp.JavaScript;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ConfirmationPopUp {

    public WebDriver driver;

    @Test
    public void confirmation() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();

        WebElement confirmClickHere = driver.findElement(By.xpath("//button[contains(@id, 'confirmButton')]"));
        confirmClickHere.click();
        Thread.sleep(2000);

        Alert alert = driver.switchTo().alert();

        String confirmText = alert.getText();
        System.out.println("Confirm Text: " + confirmText);

        alert.accept();
    }

    @Test
    public void confirmationDismiss() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();

        WebElement confirmClickHere = driver.findElement(By.xpath("//button[contains(@id, 'confirmButton')]"));
        confirmClickHere.click();
        Thread.sleep(2000);

        Alert alert = driver.switchTo().alert();

        String confirmText = alert.getText();
        System.out.println("Confirm Text: " + confirmText);

        alert.dismiss();
    }
}
