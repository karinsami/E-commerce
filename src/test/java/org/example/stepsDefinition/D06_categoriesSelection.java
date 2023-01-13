package org.example.stepsDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.pages.P04_HomePage;
import org.example.pages.P05_ShoesCategoryPage;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

import static org.example.stepsDefinition.Hooks.driver;

public class D06_categoriesSelection {
    P04_HomePage homePage = new P04_HomePage(driver);
    P05_ShoesCategoryPage ShoesCategoryPage = new P05_ShoesCategoryPage(driver);
    Actions actions = new Actions(driver);
    @And("user hover over category")
    public void user_hover_over_category() throws InterruptedException {
        Thread.sleep(3000);

        actions.moveToElement(homePage.AppareCategory());
        actions.build().perform();



    }
    @And("user choose a category from sub-category menu")
    public void user_choose_a_category_from_sub_category_menu() {
        homePage.Shoes().click();

    }
    @Then("User navigate to this category successfully")
    public void user_navigate_to_this_category_successfully() throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertEquals("Shoes",ShoesCategoryPage.PageTitle().getText());

    }
}
