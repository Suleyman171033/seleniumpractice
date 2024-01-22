package otomasyontest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class US_09 {
    WebDriver driver;
    @BeforeEach
    public void setUp() {
         driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://allovercommerce.com/");
    }

    @Test
    public void tc_01() throws InterruptedException {
        List<WebElement> register =driver.findElements(By.tagName("span"));


        for (WebElement w:register) {

            if (w.getText().equals("Register")){

                w.click();
            }

        }

        WebElement a =driver.findElement(By.linkText("Become a Vendor"));
        a.click();

        driver.findElement(By.id("user_email")).sendKeys("amartya.oluwapelumi@falkcia.com");
        driver.findElement(By.id("passoword")).sendKeys("1234Sa.");
        driver.findElement(By.id("confirm_pwd")).sendKeys("1234Sa.");
        WebElement register1=driver.findElement(By.id("wcfm_membership_register_button"));

        Thread.sleep(60000);
        register1.click();
        System.out.println("ali");

         WebElement tag = driver.findElement(By.xpath("(//h1)[2]"));
         tag.getText().equals("Welcome to Allover Commerce!");






    }

}
