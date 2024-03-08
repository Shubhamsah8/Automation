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
    @Test
    public void uploadFile(){
        try {
            // Execute AutoIt script to handle file selection
            ProcessBuilder builder = new ProcessBuilder("\"C:\\Users\\RYZEN\\Downloads\\fileToUpload.exe\C:\Users\RYZEN\Downloads");
            Process process = builder.start();
            process.waitFor(); // Wait for the process to finish
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }

        // Instantiate WebDriver after AutoIt script finishes executing
        WebDriver driver = new ChromeDriver();

        // Navigate to the webpage
        driver.get("https://smallpdf.com/compress-pdf");

        // Wait for the file upload button to become clickable
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement uploadButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='app']/div/div[1]/header/div[2]/div/div/label/form/label/div/div[2]/div[2]/button[1]/span")));

        // Click the file upload button
        uploadButton.click();


    }
}
