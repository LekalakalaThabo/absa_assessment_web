package com.absa.actions;

import com.absa.helpers.HelperClass;
import com.absa.user_interface.LandingPage_Locators;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

public class LandingPage_Actions {
    LandingPage_Locators landingPage_locators = null;

    public LandingPage_Actions() {

        this.landingPage_locators = new LandingPage_Locators();

        PageFactory.initElements(HelperClass.getDriver(),landingPage_locators);
    }

    public void ensureDataCapture_is_on_LandingPage(){
        Assert.assertTrue(landingPage_locators.ADD_USER_BUTTON.isDisplayed());
    }
    public void clickAddUser() {
        landingPage_locators.ADD_USER_BUTTON.click();
    }

    public void verifyUserExists(String firstName, String lastName, String userName, String passWord, String customer, String role, String email, String cell) {
        landingPage_locators.SEARCH_USER_BUTTON.sendKeys(firstName);
        Assert.assertEquals(landingPage_locators.USENAME_VALUE.getText(),userName);
    }
}
