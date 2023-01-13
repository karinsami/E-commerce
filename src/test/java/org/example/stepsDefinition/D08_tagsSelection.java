package org.example.stepsDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.pages.P05_ShoesCategoryPage;
import org.junit.Assert;

import static org.example.stepsDefinition.Hooks.driver;

public class D08_tagsSelection {
    P05_ShoesCategoryPage ShoesCategoryPage = new P05_ShoesCategoryPage(driver);
    @And("user click on chosen tag")
    public void user_click_on_chosen_tag() {
    ShoesCategoryPage.BookTag().click();
    }
    @Then("vertify user naviagtes to tag page")
    public void vertify_user_naviagtes_to_tag_page() throws InterruptedException {
        Thread.sleep(3000);

        Assert.assertTrue(ShoesCategoryPage.PageTitle().getText().contains("book"));

    }
}
