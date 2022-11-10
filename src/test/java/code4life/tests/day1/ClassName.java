package code4life.tests.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ClassName {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.saucedemo.com");
        WebElement usernameFeild = driver.findElement(By.id("user-name"));
        usernameFeild.sendKeys("standard_user");
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("secret_sauce");
        WebElement key = driver.findElement(By.id("login-button"));
        key.click();
        List<WebElement> classSize = driver.findElements(By.className("inventory_item"));
        System.out.println("classSize = " + classSize.size());


        System.out.println("Size of the class is = "+ classSize.size());

        WebElement usernamelistLable = driver.findElement(By.tagName("h4"));
        String actual = " This is my book";
        if ( usernamelistLable.equals(actual)){
            System.out.println("Passed !!!");
        }else {
            System.out.println("Failed!!!");
        }


    }


}
