package code4life.tests.day4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class day4 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com");

        WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));

        WebElement password = driver.findElement(By.id("password"));
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement loginBtn = driver.findElement(By.xpath("//input[2id='login-button']"));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        wait.until(ExpectedConditions.visibilityOf(username)).sendKeys();

        wait.until(ExpectedConditions.visibilityOf(password)).sendKeys();

        WebElement loginBtn1 = driver.findElement(By.cssSelector("#login-button"));

    }
}
