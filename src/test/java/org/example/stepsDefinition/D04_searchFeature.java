package org.example.stepsDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P04_HomePage;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.Color;

import static org.example.stepsDefinition.Hooks.driver;
public class D04_searchFeature {


    P04_HomePage searchFeature = new P04_HomePage(driver);

    @And("user search with product name")
    public void user_search_with_product_name() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
       searchFeature.SearchBox().sendKeys("Apple");
      //  System.out.println(searchFeature.SearchButton().getText());
       searchFeature.SearchButton().click();


    }

    @Then("search shows relevant results")
    public void search_shows_relevant_results() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        Thread.sleep(3000);
        Assert.assertTrue(searchFeature.ProductName().getText().contains("Apple"));

    }
}
