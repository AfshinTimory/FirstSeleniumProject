package code4life.tests.day8_TestNG;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class Annotation {
    WebDriver driver;
    @BeforeSuite
            public void test12(){
        System.out.println("This is BeforeSuite");
    }
    @BeforeTest
          public void beforeTest(){
        System.out.println("This is before Test");
    }


    @BeforeMethod
    public void setupDriver(){
        System.out.println("This is before method");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
    }

    @Test()
    public void testLogin () {
        Assert.assertEquals(2,3);
        System.out.println("this is a smoke test");

      /*  String actual = "Swag Labs";
        Assert.assertEquals(actual, driver.getTitle());*/
    }
    @Test(dependsOnMethods = "testLogin")
            public void testLogin2(){
        System.out.println("This is loging test");


    }

    @AfterMethod
    public void runafter() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }





}
