package code4life.tests.Parctices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class WaitParctice {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://www.google.com");
       driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
       WebElement engLan = driver.findElement(By.linkText("English"));
       engLan.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement img = driver.findElement(By.xpath("//img[@class='lnXdpd']"));
        wait.until(ExpectedConditions.visibilityOf(img));
        img.click();
        WebElement secImg = driver.findElement(By.xpath("//img[@id='pimg_1']"));
        secImg.click();
        WebElement dropDown = driver.findElement(By.id("lang-chooser"));

        Select lang = new Select(dropDown);
        Thread.sleep(2000);
        Thread.sleep(5000);
        List<WebElement> options = lang.getOptions();

       for(WebElement text:options){
           System.out.println(text.getText());
       }


    }
}
