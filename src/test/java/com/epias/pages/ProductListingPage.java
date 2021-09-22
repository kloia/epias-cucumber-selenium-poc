package com.epias.pages;

import com.epias.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ProductListingPage {
    public ProductListingPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(css = "div#view img")
    public List<WebElement> listOfProduct;

    public void clickProductByNumber(int productNumber){
        listOfProduct.get(productNumber).click();
    }
}
