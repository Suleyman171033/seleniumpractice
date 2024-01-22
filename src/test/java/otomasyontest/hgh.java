package otomasyontest;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class hgh {
    public static void main(String[] args) {
                WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://allovercommerce.com/");

        List<WebElement> tag=driver.findElements(By.tagName("h1"));

        for (WebElement w:tag) {

            if (w.getText().equals("Welcome to Allover Commerce!")) {
                System.out.println(w.getText());

                Assertions.assertEquals("Welcome to Allover Commerce!", w.getText());


            }
        }
    }


}
