package com.cydeo.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EatingCucumber {
    @Given("John is hungry")
    public void john_is_hungry() {
        System.out.println("It is from Given");
    }

    @When("he eats some cucumbers")
    public void he_eats_some_cucumbers() {
        System.out.println("It is from When");

    }@Given("I am on the login page")
    public void i_am_on_the_login_page() {

    }@When("I enter username {string}")
    public void i_enter_username(String string) {

    }



    @Given("User should be able to navigate to webpage")
    public void user_should_be_able_to_navigate_to_webpage() {

    }
    @When("User should be able to enter username {string}")
    public void user_should_be_able_to_enter_username(String string) {

    }
    @When("User should be able to enter password {string}")
    public void user_should_be_able_to_enter_password(String string) {

    }


    @When("I enter password {string}")
    public void i_enter_password(String string) {

    }
    @Then("User should be able to validate page title")
    public void user_should_be_able_to_validate_page_title() {

    }
    @Then("User should be able to logout from the {string} account")
    public void user_should_be_able_to_logout_from_the_account(String string) {

    }



    @Then("he will be full")
    public void he_will_be_full() {
        System.out.println("It is from Then");

    }

    @And("Click the login button")
    public void clickTheLoginButton() {
    }
}
