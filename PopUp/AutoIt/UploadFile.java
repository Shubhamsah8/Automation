package PopUp.AutoIt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;

public class UploadFile {
    public WebDriver driver;
    @Test
    public void uploadFile() throws IOException, InterruptedException {
        driver = new ChromeDriver();

        driver.get("https://smallpdf.com/compress-pdf");
        driver.manage().window().maximize();



        WebElement uploadButton = driver.findElement(By.xpath("//button[@type='button']"));
        uploadButton.click();
        Runtime.getRuntime().exec("\"C:\\Users\\RYZEN\\Downloads\\fileToUpload.exe\"");
        Thread.sleep(5000);

    }
}
