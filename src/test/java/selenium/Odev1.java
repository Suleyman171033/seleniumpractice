package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Odev1 {
    public static void main(String[] args) throws InterruptedException {

//ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title) “Facebook” icerdigini dogrulayin (verify), degilse dogru basligi //yazdirin.

        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.facebook.com");

        if (driver.getTitle().contains("Facebook")){
            System.out.println("Test Passed");

        }else {
            System.out.println("Test Failed");
            String title=driver.getTitle();
            System.out.println(title);

        }


//Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i yazdirin.

        if (driver.getCurrentUrl().contains("facebook")){

            System.out.println("Test Passed");
        }else {
            System.out.println("Test Failed");
            String url=driver.getCurrentUrl();
            System.out.println(url);
        }
//https://www.walmart.com/ sayfasina gidin.
        driver.get("https://www.walmart.com");
//Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
        if (driver.getTitle().contains("Walmart.com")){
            System.out.println("Test Passed");
        }else {
            System.out.println("Test Failed");
            String title= driver.getTitle();
            System.out.println(title);
        }
//Tekrar “facebook” sayfasina donun
        driver.navigate().back();
//Sayfayi yenileyin
        driver.navigate().refresh();
//sayfayi tam sayfa (maximize) yapin
        driver.manage().window().maximize();
        Thread.sleep(3000);
//Sayfayi kapatin
        driver.quit();

    }
}
