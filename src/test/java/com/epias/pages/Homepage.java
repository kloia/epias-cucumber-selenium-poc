package com.epias.pages;

import com.epias.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
    public Homepage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(className = "btnSignUp")
    public WebElement signUpButton;


    public void clickSignUpButton(){
        signUpButton.click();
    }


}
