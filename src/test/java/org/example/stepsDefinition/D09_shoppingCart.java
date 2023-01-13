package org.example.stepsDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.pages.P04_HomePage;
import org.example.pages.P06_BooksCategoryPage;
import org.junit.Assert;

import static org.example.stepsDefinition.Hooks.driver;

public class D09_shoppingCart {
    P04_HomePage homePage = new P04_HomePage(driver);
    P06_BooksCategoryPage BooksCategoryPage = new P06_BooksCategoryPage(driver);
    @And("user click on category")
    public void user_click_on_category() throws InterruptedException {
        homePage.BooksCategory().click();
        Thread.sleep(3000);

    }

    @And("user add item to their cart")
    public void user_add_item_to_their_cart() {
        BooksCategoryPage.AddToCart().click();


    }
    @Then("vertify item is added to cart successfully")
    public void vertify_item_is_added_to_cart_successfully() throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertTrue(BooksCategoryPage.AddToCartSuccessMessage().getText().contains("The product has been added to your shopping cart"));

    }
}
