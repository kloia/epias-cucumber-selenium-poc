package com.epias.pages;

import com.epias.utilities.Driver;
import com.epias.utilities.Utils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    public BasePage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(name = "profile")
    public WebElement loginIcon;

    @FindBy(linkText = "Giriş Yap")
    public WebElement loginButton;

    public void openLoginPage(){
        Utils.hoverOverElement(loginIcon);
        loginButton.click();

    }

}
