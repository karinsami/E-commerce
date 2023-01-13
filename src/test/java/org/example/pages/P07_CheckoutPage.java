package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class P07_CheckoutPage {
    WebDriver driver ;
    public P07_CheckoutPage(WebDriver driver){
        this.driver = driver ;
        PageFactory.initElements(driver,this);
    }
    public WebElement AcceptTandC(){
        return   driver.findElement(By.id("termsofservice"));

    }
    public WebElement Checkout(){
        return   driver.findElement(By.id("checkout"));}
}
