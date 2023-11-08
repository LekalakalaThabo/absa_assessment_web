package com.absa.actions;

import com.absa.helpers.HelperClass;
import com.absa.user_interface.AddUserForm_Locators;
import org.openqa.selenium.support.PageFactory;

public class AddUser_Actions {
    AddUserForm_Locators addUserForm_locators = null;

    public AddUser_Actions() {

        this.addUserForm_locators = new AddUserForm_Locators();

        PageFactory.initElements(HelperClass.getDriver(),addUserForm_locators);
    }

    public void addFirstName(String firstName) {
        addUserForm_locators.FIRST_NAME_FIELD.sendKeys(firstName);
    }
    public void addLastName(String lastName) {
        addUserForm_locators.LAST_NAME_FIELD.sendKeys(lastName);
    }
    public void addEmail(String email) {
        addUserForm_locators.EMAIL_FIELD.sendKeys(email);
    }
    public void addPhone(String phone) {
        addUserForm_locators.PHONE_FIELD.sendKeys(phone);
    }
    public void addUserName(String username) {
        addUserForm_locators.USER_NAME_FIELD.sendKeys(username);
    }
    public void addPassword(String password) {
        addUserForm_locators.PASSWORD_FIELD.sendKeys(password);
    }

    public void selectCustomer(String customer) {
        if(customer.equalsIgnoreCase("Company AAA"))
            addUserForm_locators.AAA_RADIO_BUTTON.click();
        else
            addUserForm_locators.BBB_RADIO_BUTTON.click();
    }
    public void selectRole(String role) {
        if(role.equalsIgnoreCase("Sales Team"))
            addUserForm_locators.SALES_ROLE_OPTION.click();
        else if (role.equalsIgnoreCase("Customer"))
            addUserForm_locators.CUSTOMER_ROLE_OPTION.click();
        else
            addUserForm_locators.ADMIN_ROLE_OPTION.click();

    }
    public void saveUser() {
        addUserForm_locators.SAVE_BUTTON.click();
    }

    public void addNewUser(String firstName, String lastName, String username, String password, String customer, String role, String email, String phone) {

        addFirstName(firstName);
        addLastName(lastName);
        addEmail(email) ;
        addPhone(phone);
        addUserName(username);
        addPassword(password);
        selectCustomer(customer);
        selectRole(role);
        saveUser();
    }
}
