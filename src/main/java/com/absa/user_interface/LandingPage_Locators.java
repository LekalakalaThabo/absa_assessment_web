package com.absa.user_interface;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage_Locators {

    @FindBy(xpath = "//tr[1]//td[3]")
    public WebElement  USENAME_VALUE;

    @FindBy(xpath = "//button[@class='btn btn-link pull-right']")
    public WebElement ADD_USER_BUTTON;

    @FindBy(xpath = "//input[@placeholder='Search']")
    public WebElement SEARCH_USER_BUTTON;

}
