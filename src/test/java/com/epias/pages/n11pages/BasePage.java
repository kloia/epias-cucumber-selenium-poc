package com.epias.pages.n11pages;

import com.epias.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    public BasePage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(id = "searchData")
    public WebElement searchBox;


    public void searchFor(String keyword){
        //searchbox send keys
        //search button click
        searchBox.sendKeys(keyword, Keys.ENTER);
    }
}
