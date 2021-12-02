package com.epias.pages;

import com.epias.utilities.ConfReader;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{


    @FindBy(id = "L-UserNameField")
    public WebElement usernameBox;

    @FindBy(id = "L-PasswordField")
    public WebElement passwordBox;

    @FindBy(id = "L-gg-login-enter")
    public WebElement loginButton;


    public void fillUsername(String username){
        usernameBox.sendKeys(username);
    }

    public void fillPass(String pass){
        passwordBox.sendKeys(pass);
    }

    public void clickLoginButton(){
        loginButton.click();
    }

    public void loginAs(String type){
        String username = ConfReader.get("username-" + type);
        String password = ConfReader.get("password-" + type);
        fillUsername(username);
        fillPass(password);
        clickLoginButton();

    }


}
