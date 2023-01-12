package org.example.stepsDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_RegistrationPage;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static org.example.stepsDefinition.Hooks.driver;

public class D01_registrationSteps {
    P01_RegistrationPage registrationPage = new P01_RegistrationPage(driver);
    @Given("user navigate to registration page")
    public void user_navigate_to_registration_page() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        registrationPage.RegisterLink().click();
//        driver.navigate().to("https://demo.nopcommerce.com/register?returnUrl=%2Fcart");
        Thread.sleep(3000);
    }
    @When("user select gender type")
    public void user_select_gender_type() {
        // Write code here that turns the phrase above into concrete actions
        registrationPage.Gender().click();
    }
    @And("user enter first name {string} and last name {string}")
    public void user_enter_first_name_and_last_name(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        registrationPage.FirstName().sendKeys("Mervat");
        registrationPage.LastName().sendKeys("Medhat");
    }
    @And("user enter date of birth")
    public void user_enter_date_of_birth() {
        // Write code here that turns the phrase above into concrete actions
        Select day =new Select(registrationPage.Day());
        day.selectByValue("5");
        Select month =new Select(registrationPage.Month());
        month.selectByValue("11");
        Select year =new Select(registrationPage.Year());
        year.selectByValue("1998");
    }
    @And("user enter email {string} field")
    public void user_enter_email_field(String string) {
        // Write code here that turns the phrase above into concrete actions
        registrationPage.Email().sendKeys("Mervat@Mervat.Mervat");
    }
    @And("user fills Password fields {string} {string}")
    public void user_fills_password_fields(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        registrationPage.Password().sendKeys("Mervat Bardo");
        registrationPage.ConfirmPassword().sendKeys("Mervat Bardo");
    }
    @And("user clicks on register button")
    public void user_clicks_on_register_button() {
        // Write code here that turns the phrase above into concrete actions
        registrationPage.RegisterButton().click();
    }
    @Then("success message is displayed")
    public void success_message_is_displayed() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        Thread.sleep(3000);
        WebElement succesMessage = registrationPage.SuccessMessage();
        Assert.assertEquals(succesMessage.getText(),"Your registration completed");
        Assert.assertEquals(succesMessage.getCssValue("color"),"rgba(76, 177, 124, 1)");

    }

}
