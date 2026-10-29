package com.ccst.steps;

import com.ccst.framework.DriverManager;
import com.ccst.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;


public class LoginSteps {

    private LoginPage loginPage; // Lowercase variable name matches standard Java conventions

    @Given("the user is on the login page")
    public void hasuserlogin() {
        loginPage = new LoginPage(DriverManager.getDriver()).open();
        System.out.println("the user is on the login page");
    }

    @When("the user enters a valid username and password")
    public void Login(){
        loginPage.loginAs("standard_user","secret_sauce");
    }

    public void the_user_enters_a_valid_username_and_password() {
        System.out.println("the user enters a valid username and password");
    }

    @And("the user Submit the form")
    public void the_user_submit_the_form() {
        System.out.println("the user Submit the form");
    }

    @Then("an error message containing {string} is shown")
    public void an_error_message_containing_is_shown(String string) {

    }

    @When("the user logs in as {string} with password {string}")
    public void the_user_logs_in_as_with_password(String username, String pass) {
        loginPage.loginAs(username,pass);
    }




}
