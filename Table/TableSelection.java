package Table;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class TableSelection {
    @Test
    public void tableSelection() {

        WebDriver driver = new ChromeDriver();

        driver.get("C:\\Users\\RYZEN\\IdeaProjects\\Automation\\src\\test\\java\\Table\\table.html");


        WebElement table = driver.findElement(By.id("example-table"));

        List<WebElement> rows = table.findElements(By.tagName("tr"));

        // Select by index
        WebElement rowByIndex = rows.get(1);
        System.out.println("Selected by index: " + rowByIndex.getText());

    }
}
