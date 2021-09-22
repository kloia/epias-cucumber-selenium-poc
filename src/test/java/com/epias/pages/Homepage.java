package com.epias.pages;

import com.epias.utilities.Driver;
import com.epias.utilities.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
    public Homepage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(className = "btnSignUp")
    public WebElement signUpButton;

    @FindBy(id = "searchData")
    public WebElement searchBox;


    public void clickSignUpButton(){
        signUpButton.click();
    }

    public void clickSubmenuUnderMenu(String submenu, String menu){
        WebElement element = Driver.get().findElement(By.linkText(menu));
        Utils.hoverOverElement(element);
        Driver.get().findElement(By.linkText(submenu)).click();
    }

    public void searchFor(String keyword){
        //searchbox send keys
        //search button click
        searchBox.sendKeys(keyword, Keys.ENTER);
    }


}
