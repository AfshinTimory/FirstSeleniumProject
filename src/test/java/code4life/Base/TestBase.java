package code4life.Base;

import code4life.utilities.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;

public class TestBase {
    @BeforeMethod
    public void setDriver() throws IOException {

        Driver.getDriver().get("http://www.saucedemo.com");}
}
