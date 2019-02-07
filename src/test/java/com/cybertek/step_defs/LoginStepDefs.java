package com.cybertek.step_defs;

import com.cybertek.pages.LandingPage;
import com.cybertek.pages.LoginPage;
import com.cybertek.utilities.ConfigReader;
import com.cybertek.utilities.Driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class LoginStepDefs {


    @Given("manager is on landing page")
    public void manager_is_on_landing_page() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));

    }

    @When("manager clicks on BriteErpDemo button")
    public void manager_clicks_on_BriteErpDemo_button() {

        LandingPage landingPage =new LandingPage();

        landingPage.briteErpDemoButton.click();
    }

    @Then("the title should be Login | Website localhost")
    public void the_title_should_be_Login_Website_localhost() {
        Assert.assertEquals("Login | Website localhost", Driver.getDriver().getTitle());
    }

    @Then("the database should be {string}")
    public void the_database_should_be(String expectedText) {

        LoginPage loginPage =  new LoginPage();

        Assert.assertEquals(expectedText, loginPage.databaseText.getAttribute("value"));

    }

    @When("the manager enters valid email address")
    public void the_manager_enters_valid_email_address() {
        LoginPage loginPage =  new LoginPage();

        loginPage.emailInput.sendKeys(ConfigReader.getProperty("manager-username"));

    }

    @When("the manager enters valid password")
    public void the_manager_enters_valid_password() {
        LoginPage loginPage =  new LoginPage();

        loginPage.passwordInput.sendKeys(ConfigReader.getProperty("manager-password"));
    }

    @When("the manager clicks Log in button")
    public void the_manager_clicks_Log_in_button() {
        LoginPage loginPage =  new LoginPage();

        loginPage.loginButton.click();
    }

    @Then("the title should be Odoo")
    public void the_title_should_be_Odoo() {
        LoginPage loginPage =  new LoginPage();

        Assert.assertEquals("Odoo", Driver.getDriver().getTitle());
    }
}
