package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class P03_ResetPassword {

    WebDriver driver ;
    public P03_ResetPassword(WebDriver driver){
        this.driver = driver ;
        PageFactory.initElements(driver,this);
    }

    public WebElement Email(){
        return   driver.findElement(By.id("Email"));
    }
    public WebElement RecoverButton()
    {
        return driver.findElement(By.className("password-recovery-button"));
    }
    public WebElement EmailSentMes()
    {
        return driver.findElement(By.className("content"));
    }




}
