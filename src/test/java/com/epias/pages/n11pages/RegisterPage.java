package com.epias.pages.n11pages;

import com.epias.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
    public RegisterPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(css = ".facebookQuickRegister>h1")
    public WebElement title;


    public void verifyTitle(){
        Assert.assertEquals("n11.com'a Üye Olun",title.getText());
    }


}
