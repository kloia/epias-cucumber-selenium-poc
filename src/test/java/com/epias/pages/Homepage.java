package com.epias.pages;

import com.epias.utilities.Utils;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends BasePage{

    @FindBy(css = ".gekhq4-4.egoSnI")
    public WebElement myAccount;

    @FindBy(css = "[title='Mobil Uygulamalar'] div")
    public WebElement mobilIcon;

    public void verifyMyAccount(){
        Assert.assertEquals("Hesabım",myAccount.getText());
    }

    public void openMobilePage() {

        Utils.scrollToElement(mobilIcon);
        mobilIcon.click();
    }

}
