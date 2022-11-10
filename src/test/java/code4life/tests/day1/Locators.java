package code4life.tests.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Locators {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.saucedemo.com");
        WebElement usernameFeild = driver.findElement(By.id("user-name"));
        usernameFeild.sendKeys("standard_user");
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("secret_sauce");
        WebElement key = driver.findElement(By.id("login-button"));
        key.click();
        /*WebElement bikelink = driver.findElement(By.linkText("Sauce Labs Bike Light"));
        bikelink.click();
        driver.navigate().back();
        WebElement partialtext = driver.findElement(By.partialLinkText("Bike Light"));
        partialtext.click();*/
        List<WebElement> linklist = driver.findElements(By.tagName("a"));

        for (WebElement list:linklist){
            System.out.println(list.getText()+ " - "+ list.getAttribute("href"));
        }


        Thread.sleep(3000);

       driver.quit();

    }
}
