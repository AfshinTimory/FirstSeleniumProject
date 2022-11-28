package code4life.tests.Parctices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class dropDownSelect {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Wait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        driver.get("https://demoqa.com/select-menu");

        Actions actions = new Actions(driver);
        WebElement valueOption = driver.findElement(By.xpath("//select[@id='oldSelectMenu']"));
        wait.until(ExpectedConditions.elementToBeClickable(valueOption));
        Select select = new Select(valueOption);
        select.selectByIndex(2);
        actions.moveToElement(valueOption);

        WebElement valueOpetion = driver.findElement(By.xpath("(//div[@class=' css-tlfecz-indicatorContainer'])[1]"));
        //wait.until(ExpectedConditions.elementToBeClickable(valueOpetion));
        valueOpetion.click();
        WebElement group  = driver.findElement(By.xpath("//div[text()='Group 1, option 1']"));
       // wait.until(ExpectedConditions.elementToBeClickable(group));

        group.click();

        Thread.sleep(5000);
        driver.close();
    }

}
