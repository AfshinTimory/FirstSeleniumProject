package code4life.tests.day10_ApachePOI;

import code4life.utilities.ExcelUtil;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

public class DataProviderByExcel {
    WebDriver driver;
    @BeforeMethod
    public void setDriver(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://www.saucedemo.com");}

    @DataProvider
    public Object [][] credentialFromExcel() throws IOException {
        ExcelUtil util = new ExcelUtil("Book2.xlsx", "Sheet1");

        return util.return2DArray();
    }
    @Test(dataProvider = "credentialFromExcel")
    public void loginTestWithExcel(String username, String password){
        driver.findElement(By.id("user-name")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("login-button")).click();


    }
}
