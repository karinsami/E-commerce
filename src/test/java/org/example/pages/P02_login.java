package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class P02_login {

    WebDriver driver ;
    public P02_login(WebDriver driver){
        this.driver = driver ;
        PageFactory.initElements(driver,this);
    }

    public WebElement LoginLink() {return driver.findElement(By.className("ico-login"));}
    public WebElement Email()
    {
        return driver.findElement(By.className("email"));
    }
    public WebElement Password()
    {
        return driver.findElement(By.className("password"));
    }
    public WebElement LoginButton()
    {
        return driver.findElement(By.className("login-button"));
    }
    public WebElement MyAccount() {return driver.findElement(By.className("ico-account"));}
    public WebElement ErrorMessage() {return driver.findElement(By.className("message-error"));}
    public WebElement ForgotPassword() {return driver.findElement(By.className("forgot-password"));}



}
