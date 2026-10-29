package com.ccst.pages;

import com.ccst.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class LoginPage extends BasePage {

    private final By username = By.id("user-name");
    private final By password = By.id("password");
    private final By loginButton = By.id("login-button");


    public LoginPage(WebDriver driver) {
        super(driver);
    }
    public LoginPage open() {
       this.driver.get("https://saucedemo.com");
        return this;
    }
    public void loginAs(String user, String pass) {
       // logger.info("Starting authorization sequence for user: " + user);

        type(driver.findElement(username), user);
        type(driver.findElement(password), pass);
        click(driver.findElement(loginButton));
    }
}
