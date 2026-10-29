    package com.ccst.framework;

    import org.openqa.selenium.WebDriver;

    public class DriverManager {
        private DriverManager() {

        }
            private static final ThreadLocal<WebDriver> DRIVER = new ThreadLocal<>();

            public static void setDriver(WebDriver driver) {
                DRIVER.set(driver);
            }

            public static WebDriver getDriver() {
                WebDriver driver = DRIVER.get();
                if (driver == null) {
                    throw new IllegalArgumentException("No WebDriver started for this thread.");
                }
                return driver;
            }

            public static void quitDriver() {
                WebDriver driver = DRIVER.get();
                if (driver != null) {
                    driver.quit();
                    DRIVER.remove();
                }
            }
        }