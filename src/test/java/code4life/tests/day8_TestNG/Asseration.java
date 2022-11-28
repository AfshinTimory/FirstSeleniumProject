package code4life.tests.day8_TestNG;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Asseration {
    WebDriver driver;
    @BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
    }
@AfterMethod
public void tearDown(){
    driver.quit();
}

@Test
public void verifyTitle(){
    System.out.println("Begining of test case");
    String actualTitle = "Swaq labs";
    String expected = driver.getTitle();

    Assert.assertEquals(actualTitle, expected);
    System.out.println("End of test case");
}
}
