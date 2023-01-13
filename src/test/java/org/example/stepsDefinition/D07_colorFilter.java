package org.example.stepsDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.pages.P05_ShoesCategoryPage;
import org.junit.Assert;

import static org.example.stepsDefinition.Hooks.driver;

public class D07_colorFilter {
    P05_ShoesCategoryPage ShoesCategoryPage = new P05_ShoesCategoryPage(driver);
    @And("user click on chosen color filter")
    public void user_click_on_chosen_color_filter() {
        ShoesCategoryPage.RedFilter().click();

    }
    @Then("result is filtered by color")
    public void result_is_filtered_by_color() throws InterruptedException {
        Thread.sleep(3000);
        ShoesCategoryPage.ShoesItem().click();
        Thread.sleep(3000);
        Assert.assertTrue(ShoesCategoryPage.ShoesDes().getText().contains("Maroon"));


    }

}
