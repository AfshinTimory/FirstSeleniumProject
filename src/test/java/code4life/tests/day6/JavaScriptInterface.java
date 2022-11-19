package code4life.tests.day6;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class JavaScriptInterface {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://demoqa.com");

        JavascriptExecutor executor = (JavascriptExecutor) driver;
        Thread.sleep(2000);
        executor.executeScript("window.scrollBy(0, 700)");
        Thread.sleep(1000);

        WebElement element = driver.findElement(By.xpath("//h5[text()='Elements']"));
        executor.executeScript("arguments[0].click();", element);
        Thread.sleep(2000);
        driver.quit();

    }
}
