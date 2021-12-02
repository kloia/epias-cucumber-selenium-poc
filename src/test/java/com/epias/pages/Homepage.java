package com.epias.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends BasePage{

    @FindBy(css = ".gekhq4-4.egoSnI")
    public WebElement myAccount;


    public void verifyMyAccount(){
        Assert.assertEquals("Hesabım",myAccount.getText());
    }

}
