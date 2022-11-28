package code4life.pages;

import code4life.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class LogingPage {


    By username = By.id("user-name");
    By password = By.id("password");
    By loginBtn = By.id("login-button");

    public void sendUsernameText(String userText) throws IOException {
        Driver.getDriver().findElement(username).sendKeys(userText);

    }
    public void sendPasswordText(String pass) throws IOException {
       Driver.getDriver().findElement(password).sendKeys(pass);
    }
    public void clickLoginBtn() throws IOException {
        Driver.getDriver().findElement(loginBtn).click();
    }
}
