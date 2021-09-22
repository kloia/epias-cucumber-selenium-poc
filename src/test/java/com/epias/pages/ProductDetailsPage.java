package com.epias.pages;

import com.epias.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDetailsPage {

    public ProductDetailsPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(className = "btnAddBasket")
    public WebElement addToCartButton;

    public void verifyAddToCart(){
        Assert.assertTrue(addToCartButton.isDisplayed());
    }
}
