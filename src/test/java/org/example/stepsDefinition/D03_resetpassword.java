package org.example.stepsDefinition;




import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P02_login;
import org.example.pages.P03_ResetPassword;
import org.junit.Assert;
import org.openqa.selenium.support.Color;

import static org.example.stepsDefinition.Hooks.driver;

public class D03_resetpassword {

    P02_login login = new P02_login(driver);
    P03_ResetPassword resetPassword = new P03_ResetPassword(driver);


    @Given("user navigate to login page")
    public void user_navigate_to_login_page() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        login.LoginLink().click();
        Thread.sleep(3000);
    }
    @When("user click on Forgot password")
    public void user_click_on_Forgot_password() throws InterruptedException {
        login.ForgotPassword().click();
        System.out.println("Forgot Password");
        Thread.sleep(3000);

    }

    @And("user enter their email {string} field")
    public void user_enter_their_email_field(String string) {
        // Write code here that turns the phrase above into concrete actions
        resetPassword.Email().sendKeys("Mervat@Mervat.Mervat");
    }


    @And ("user click on recover button")
    public void user_click_on_recover_button(){

      resetPassword.RecoverButton().click();

    }
    @Then ("user reset their password successfully")
    public void user_reset_their_password_successfully() throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertEquals(resetPassword.EmailSentMes().getText(),"Email with instructions has been sent to you.");

        // Write code here that turns the phrase above into concrete actions
    }

}
