package code4life.tests.day5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropList {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/select-menu");
        WebElement dropDown = driver.findElement(By.cssSelector("#oldSelectMenu"));
        Select select = new Select(dropDown);
        select.selectByIndex(2);

        boolean test = select.isMultiple();
        if(test){
            System.out.println("Passed!!!!");}
            else{
            System.out.println("Multi choice not allowed");
            }
            List<WebElement> allColors = select.getOptions();

            for(WebElement option: allColors){
                System.out.println(option.getText());
            }
            Thread.sleep(2000);
        }




}
