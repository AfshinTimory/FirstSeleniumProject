package code4life.tests.day10_ApachePOI;

import code4life.pages.LogingPage;
import code4life.utilities.ConfigurationReader;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class LoginTest {
    WebDriver driver;

    @Test
    public void loginTest() throws IOException {
        LogingPage page = new LogingPage();
        page.sendUsernameText(ConfigurationReader.getValue("user"));
        page.sendPasswordText(ConfigurationReader.getValue("password"));
    }
}
