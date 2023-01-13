package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class P05_ShoesCategoryPage {
    WebDriver driver ;
    public P05_ShoesCategoryPage(WebDriver driver){
        this.driver = driver ;
        PageFactory.initElements(driver,this);
    }
    public WebElement PageTitle(){
        return   driver.findElement(By.className("page-title"));
    }
    public WebElement RedFilter(){
        return   driver.findElement(By.id("attribute-option-15"));
    }
    public WebElement ShoesItem(){
        return   driver.findElement(By.className("product-title"));
    }
    public WebElement ShoesDes(){
        return   driver.findElement(By.className("short-description"));}
    public WebElement BookTag() {
        return driver.findElement(By.linkText("book"));}
}
