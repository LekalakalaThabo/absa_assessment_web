package com.absa.stepdefinitions;

import com.absa.actions.AddUser_Actions;
import com.absa.actions.LandingPage_Actions;
import com.absa.helpers.HelperClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class AddUsers_stepDefinition {
    LandingPage_Actions landingPage_actions = new LandingPage_Actions();
    AddUser_Actions addUser_actions = new AddUser_Actions();
    @Given("dataCapture was able to open the application {string}")
    public void data_capture_was_able_to_open_the_application(String url) {
        HelperClass.openPage(url);
    }
    @When("dataCapture adds user with details firstName {string}, lastName {string}, userName {string}, passWord {string}, customer {string}, role {string}, email {string}, cell {string}")
    public void data_capture_adds_user(String firstName, String lastName, String userName, String passWord, String customer, String role, String email, String cell) {
        landingPage_actions.ensureDataCapture_is_on_LandingPage();
        landingPage_actions.clickAddUser();
        addUser_actions.addNewUser(firstName,lastName,userName, passWord, customer, role, email, cell);
    }

    @Then("dataCapture should be able to see newly added user on the list {string}, lastName {string}, userName {string}, passWord {string}, customer {string}, role {string}, email {string}, cell {string}")
    public void datacaptureShouldBeAbleToSeeNewlyAddedUserOnTheList(String firstName, String lastName, String userName, String passWord, String customer, String role, String email, String cell) {
        landingPage_actions.verifyUserExists(firstName,lastName,userName, passWord, customer, role, email, cell);
    }
}
