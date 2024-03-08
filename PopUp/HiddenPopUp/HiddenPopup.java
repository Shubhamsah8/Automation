package PopUp.HiddenPopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HiddenPopup {

    public WebDriver driver;
    @Test
    public void hiddenPopUp() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.irctc.co.in/nget/train-search");

        WebElement datePopUp = driver.findElement(By.xpath("//*[@id=\"jDate\"]/span/input"));
        datePopUp.click();
        WebElement datePicker = datePopUp.findElement(By.xpath("//*[@id=\"jDate\"]/span/div/div/div[1]/a[2]/span"));
        datePicker.click();
        Thread.sleep(2000);
        WebElement dateChoose = datePopUp.findElement(By.xpath("//*[@id=\"jDate\"]/span/div/div/div[2]/table/tbody/tr[2]/td[2]/a"));
        dateChoose.click();
    }
}
