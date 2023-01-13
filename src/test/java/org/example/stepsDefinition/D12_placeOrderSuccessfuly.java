package org.example.stepsDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.pages.P04_HomePage;
import org.example.pages.P07_CheckoutPage;
import org.example.pages.P08_BillingPage;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

import static org.example.stepsDefinition.Hooks.driver;

public class D12_placeOrderSuccessfuly {
    P04_HomePage homePage = new P04_HomePage(driver);
    P07_CheckoutPage CheckoutPage = new P07_CheckoutPage(driver);
    P08_BillingPage billingPage = new P08_BillingPage(driver);
    @And("user navigate to cart")
    public void user_navigate_to_cart() throws InterruptedException {
        Thread.sleep(10000);
        homePage.GoToCart().click();
        Thread.sleep(3000);
    }
    @And("user accept terms and conditions")
    public void user_accept_terms_and_conditions() {
        CheckoutPage.AcceptTandC().click();


    }
    @And("user click on checkout")
    public void user_click_on_checkout() {
        CheckoutPage.Checkout().click();
    }
    @And("user fill in his data")
    public void user_fill_in_his_data() throws InterruptedException {
        Select Country =new Select(billingPage.Country());
        Country.selectByValue("202");
        billingPage.City().sendKeys("Cairo");
        billingPage.Address1().sendKeys("London el dor el 2");
        Thread.sleep(1000);
        billingPage.ZipPostalCode().sendKeys("123456");
        billingPage.PhoneNumber().sendKeys("012000000");
        billingPage.continueButton().click();
        Thread.sleep(1000);
        billingPage.continueButton2().click();
        Thread.sleep(1000);
        billingPage.continueButton3().click();
        Thread.sleep(1000);
        billingPage.continueButton4().click();
        Thread.sleep(1000);
        billingPage.continueButton5().click();
    }
    @Then("order is placed successfully")
    public void order_is_placed_successfully() throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertTrue(billingPage.OrderPlaced().getText().contains("Your order has been successfully processed!"));
    }

}
