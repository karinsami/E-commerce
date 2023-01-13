package org.example.stepsDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.pages.P04_HomePage;
import org.example.pages.P06_BooksCategoryPage;
import org.junit.Assert;

import static org.example.stepsDefinition.Hooks.driver;

public class D011_Comparelist {

    P04_HomePage homePage = new P04_HomePage(driver);
    P06_BooksCategoryPage BooksCategoryPage = new P06_BooksCategoryPage(driver);
    @And("user click on add to Comparelist icon")
    public void user_click_on_add_to_comparelist_icon() throws InterruptedException {
        homePage.AddToComparelist().click();
        Thread.sleep(3000);

    }
    @Then("item is added to Comparelist successfully")
    public void item_is_added_to_comparelist_successfully() {
        Assert.assertEquals(BooksCategoryPage.SuccessMessage().getText(),"The product has been added to your product comparison");
    }

}
