package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class P04_HomePage {
    WebDriver driver;

    public P04_HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement SearchBox() {
        return driver.findElement(By.id("small-searchterms"));
    }

    public WebElement ProductName() {

        return driver.findElements(By.className("product-title")).get(0);

    }

    public WebElement SearchButton() {
        return driver.findElement(By.className("search-box-button"));
    }

    public WebElement currancyDropDownMenu() {
        return driver.findElement(By.id("customerCurrency"));
    }

    public List<WebElement> ProductPrices() {

        return driver.findElements(By.className("actual-price"));
    }

    public WebElement BooksCategory() {
        return driver.findElement(By.linkText("Books"));
    }

    public WebElement AppareCategory() {
        return driver.findElement(By.linkText("Apparel"));
    }

    public WebElement Shoes() {
        return driver.findElement(By.linkText("Shoes"));
    }
    public WebElement AddToWishlist() {
        return driver.findElements(By.className("add-to-wishlist-button")).get(2);}
    public WebElement AddToComparelist() {
        return driver.findElements(By.className("add-to-compare-list-button")).get(0);}
    public WebElement GoToCart() {return driver.findElement(By.id("topcartlink"));}


}