package code4life.tests.day6;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DragDrop2 {
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
       WebElement acceptTab = driver.findElement(By.id("droppableExample-tab-accept"));
        actions.moveToElement(acceptTab).click().build().perform();
       WebElement acceptable = driver.findElement(By.id("acceptable"));
       WebElement dropHere = driver.findElement(By.xpath("(//div[@id='droppable])[2]"));
        actions.clickAndHold(acceptable).moveToElement(dropHere).release().build().perform();
        Thread.sleep(2000);
        driver.quit();
    }
}
