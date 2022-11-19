package code4life.tests.day6;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ActionDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/interaction");

        JavascriptExecutor executor = (JavascriptExecutor) driver;
        Thread.sleep(2000);
        executor.executeScript("window.scrollBy(0, 700)");
        Thread.sleep(1000);

        WebElement element = driver.findElement(By.xpath("//span[text()='Droppable']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().build().perform();
        Thread.sleep(5000);
        WebElement dragMe = driver.findElement(By.id("draggable"));
        WebElement dropMe = driver.findElement(By.id("droppable"));
        String color = dropMe.getCssValue("background-color");
        System.out.println("This is before drag and drop"+ color);

        actions.dragAndDrop(dragMe, dropMe).build().perform();
        String color2 = dropMe.getCssValue("background-color");
        System.out.println("Color after drag and drop "+color2 );


        Thread.sleep(2000);
        driver.quit();
    }
}
