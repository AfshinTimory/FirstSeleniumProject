package code4life.tests.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {
    public static void main(String[] args) throws InterruptedException {
//        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
//
//        WebDriver driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.amazon.com");
        Thread.sleep(2000);
        driver.navigate().to("http://www.gooogle.com");
        driver.navigate().back();
        driver.navigate().forward();

        String title = driver.getTitle();
        System.out.println(title);
        Thread.sleep(3000);
        driver.quit();


    }
}
