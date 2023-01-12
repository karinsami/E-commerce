package org.example.stepsDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Given;
import org.example.pages.P02_login;
import org.junit.Assert;
import org.openqa.selenium.support.Color;

import static org.example.stepsDefinition.Hooks.driver;

public class D02_loginStepDef {

    P02_login login = new P02_login(driver);

    @Given("user go to login page")
    public void user_go_to_login_page() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        login.LoginLink().click();
        Thread.sleep(3000);
    }
    @When("user login with {string} {string} and {string}")
    public void user_login_with_and(String string, String string2, String string3) {
        // Write code here that turns the phrase above into concrete actions
        login.Email().sendKeys(string2);
        login.Password().sendKeys(string3);

    }
    @And("user press on login button")
    public void user_press_on_login_button() {
        // Write code here that turns the phrase above into concrete actions
        login.LoginButton().click();
    }
    @Then("user login to the system successfully")
    public void user_login_to_the_system_successfully() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        Thread.sleep(3000);
        Assert.assertEquals("https://demo.nopcommerce.com/",driver.getCurrentUrl());
        Assert.assertEquals(login.MyAccount().getText(),"My account");

    }
    @Then("user could not login to the system")
    public void user_could_not_login_to_the_system() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        Thread.sleep(3000);
        Assert.assertTrue(login.ErrorMessage().getText().contains("Login was unsuccessful."));
        Assert.assertEquals(Color.fromString(login.ErrorMessage().getCssValue("color")).asHex(),"#e4434b");
    }
}
