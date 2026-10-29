package com.ccst.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public abstract class BasePage {
    public final WebDriver driver;
    //protected final Logger logger = LogManager.getLogger(getClass());

    protected BasePage(WebDriver driver) {
        this.driver = driver;
    }

    protected WebElement waitForVisible(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    protected void click(WebElement element) {
        element = waitForVisible(element);
        //logger.info("Clicking element: " + element);
        element.click();
    }

    protected void type(WebElement element, String text) {
        //logger.info("Typing text into element: " + element);
        element = waitForVisible(element);
        element.clear();
        element.sendKeys(text);
    }


    // public Header header() {
    //return new Header(driver);
    // }
}
