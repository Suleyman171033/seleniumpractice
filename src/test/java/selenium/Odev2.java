package selenium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.DriverManager;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class Odev2 {
    @Test
     public void test1() {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


       //https://www.google.com/ adresine gidin

        driver.get("https://www.google.com/");


      // cookies uyarisi cikarsa kabul ederek kapatin
       //Sayfa basliginin “Google” ifadesi icerdigini test edin
        Assertions.assertTrue(driver.getTitle().contains("Google"));
       //Arama cubuguna “Selenium” yazip aratin
        driver.findElement(By.id("APjFqb")).sendKeys("Selenium", Keys.ENTER);
      // Bulunan sonuc sayisini yazdirin
        WebElement aramaSonucu=driver.findElement(By.id("result-stats"));

        String aramamaSonucu1=aramaSonucu.getText().split(" ")[1];
        System.out.println(aramamaSonucu1);

        String[] aramaSonucuAray=aramamaSonucu1.split("\\.");
        System.out.println(Arrays.toString(aramaSonucuAray));

        String aramaSonucuString=aramaSonucuAray[0]+aramaSonucuAray[1]+aramaSonucuAray[2];
        System.out.println(aramaSonucuString);


      // sonuc sayisinin 10 milyon’dan fazla oldugunu test edin
        Integer actual=Integer.valueOf(aramaSonucuString);

        Integer expected=10000000;
        Assertions.assertTrue(actual>expected);
      // Sayfayi kapatin
driver.quit();
    }
}
