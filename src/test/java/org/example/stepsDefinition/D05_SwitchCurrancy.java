package org.example.stepsDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.pages.P04_HomePage;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static org.example.stepsDefinition.Hooks.driver;

public class D05_SwitchCurrancy {
    P04_HomePage homePage = new P04_HomePage(driver);



    @And("User choose Euro")
    public void user_choose_euro() {
        // Write code here that turns the phrase above into concrete actions
        Select currancyList =new Select(homePage.currancyDropDownMenu());
        currancyList.selectByValue("https://demo.nopcommerce.com/changecurrency/6?returnUrl=%2F");

    }

    @Then("vertify that prices change to Euro")
    public void vertify_that_prices_change_to_euro() {
        // Write code here that turns the phrase above into concrete actions
        for (int i=0;i<4;i++){
            Assert.assertTrue(homePage.ProductPrices().get(i).getText().contains("€"));
        }


    }




}
