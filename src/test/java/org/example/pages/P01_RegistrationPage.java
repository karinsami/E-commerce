package org.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.By;
public class P01_RegistrationPage {
    WebDriver driver ;
    public P01_RegistrationPage(WebDriver driver){
        this.driver = driver ;
        PageFactory.initElements(driver,this);
    }
    public WebElement RegisterLink() {return driver.findElement(By.className("ico-register"));}
    public WebElement Gender(){
        return   driver.findElement(By.id("gender-male"));
    }
    public WebElement FirstName(){
        return   driver.findElement(By.id("FirstName"));
    }
    public WebElement LastName(){
        return   driver.findElement(By.id("LastName"));
    }
    public WebElement Day(){
        return   driver.findElement(By.name("DateOfBirthDay"));
    }
    public WebElement Month(){
        return   driver.findElement(By.name("DateOfBirthMonth"));
    }
    public WebElement Year(){
        return   driver.findElement(By.name("DateOfBirthYear"));
    }
    public WebElement Email(){
        return   driver.findElement(By.id("Email"));
    }
    public WebElement Password(){
        return   driver.findElement(By.id("Password"));
    }
    public WebElement ConfirmPassword(){
        return   driver.findElement(By.id("ConfirmPassword"));
    }
    public WebElement RegisterButton(){
        return   driver.findElement(By.id("register-button"));
    }
    public WebElement SuccessMessage(){
        return   driver.findElement(By.className("result"));
    }


}
