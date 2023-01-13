package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class P06_BooksCategoryPage {
    WebDriver driver ;
    public P06_BooksCategoryPage(WebDriver driver){
        this.driver = driver ;
        PageFactory.initElements(driver,this);
    }
    public WebElement AddToCart(){
        return   driver.findElements(By.className("product-box-add-to-cart-button")).get(0);
    }
    public WebElement SuccessMessage(){
        return   driver.findElement(By.className("content"));

    }
}
