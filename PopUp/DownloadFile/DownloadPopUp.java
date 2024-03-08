package PopUp.DownloadFile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class DownloadPopUp {

    public WebDriver driver;

    @Test
    public void downloadPopUp() {

        String downloadPath = "D:\\";
        Map<String, Object> chromePrefs = new HashMap<>();
        chromePrefs.put("download.default_directory", downloadPath);

        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", chromePrefs);

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        driver.get("https://demo.automationtesting.in/FileDownload.html");


        String xpath = "//a[contains(@type, 'button')]";
        WebElement downloadButton = driver.findElement(By.xpath(xpath));
        downloadButton.click();
    }
}
