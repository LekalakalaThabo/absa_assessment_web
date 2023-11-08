package com.absa.user_interface;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddUserForm_Locators {
    @FindBy(xpath = "//input[@name='FirstName']")
    public WebElement FIRST_NAME_FIELD;

    @FindBy(xpath = "//input[@name='LastName']")
    public WebElement LAST_NAME_FIELD;

    @FindBy(xpath = "//input[@name='Email']")
    public WebElement  EMAIL_FIELD;

    @FindBy(xpath = "//input[@name='Mobilephone']")
    public WebElement  PHONE_FIELD;

    @FindBy(xpath = "//input[@name='UserName']")
    public WebElement USER_NAME_FIELD;

    @FindBy(xpath = "//input[@name='Password']")
    public WebElement PASSWORD_FIELD;

    @FindBy(xpath = "//label[1]//input[1]")
    public WebElement AAA_RADIO_BUTTON;

    @FindBy(xpath = "//label[2]//input[1]")
    public WebElement BBB_RADIO_BUTTON;

    @FindBy(xpath = "//option[contains(text(),'Sales Team')]")
    public WebElement SALES_ROLE_OPTION;

    @FindBy(xpath = "//option[contains(text(),'Customer')]")
    public WebElement CUSTOMER_ROLE_OPTION;

    @FindBy(xpath = "//option[contains(text(),'Admin')]")
    public WebElement ADMIN_ROLE_OPTION;

    @FindBy(xpath = "//h3[@class='ng-binding']")
    public WebElement HEADING;

    @FindBy(xpath = "//button[@class='btn btn-danger']")
    public WebElement CLOSE_BUTTON;

    @FindBy(xpath = "//button[@class='btn btn-success']")
    public WebElement SAVE_BUTTON;
}
