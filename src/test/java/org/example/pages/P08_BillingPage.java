package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class P08_BillingPage {
    WebDriver driver ;
    public P08_BillingPage(WebDriver driver){
        this.driver = driver ;
        PageFactory.initElements(driver,this);
    }
    public WebElement Country(){
        return   driver.findElement(By.id("BillingNewAddress_CountryId"));
    }
    public WebElement City(){
        return   driver.findElement(By.id("BillingNewAddress_City"));

    }
    public WebElement Address1(){
        return   driver.findElement(By.id("BillingNewAddress_Address1"));

    }
    public WebElement ZipPostalCode(){
        return   driver.findElement(By.id("BillingNewAddress_ZipPostalCode"));

    }
    public WebElement PhoneNumber(){
        return   driver.findElement(By.id("BillingNewAddress_PhoneNumber"));

    }
    public WebElement continueButton(){
        return   driver.findElement(By.className("new-address-next-step-button"));

    }
    public WebElement continueButton2(){
        return   driver.findElement(By.className("shipping-method-next-step-button"));

    }
    public WebElement continueButton3(){
        return   driver.findElement(By.className("payment-method-next-step-button"));

    }
    public WebElement continueButton4(){
        return   driver.findElement(By.className("payment-info-next-step-button"));

    }
    public WebElement continueButton5(){
        return   driver.findElement(By.className("confirm-order-next-step-button"));

    }
    public WebElement OrderPlaced(){
        return   driver.findElement(By.className("order-completed"));

    }

}
