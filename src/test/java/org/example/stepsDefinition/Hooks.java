package org.example.stepsDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Hooks {
    public static WebDriver  driver ;
    @Before
    public void openBrowser() throws InterruptedException {
        String chromePath = System.getProperty("user.dir") +"/src/main/resources/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",chromePath );
        driver = new ChromeDriver();
        driver.navigate().to("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        System.out.println("Browser Opened");
        Thread.sleep(3000);

    }
    @After
    public static void quitDriver() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
        System.out.println("Browser Closed");

    }


}