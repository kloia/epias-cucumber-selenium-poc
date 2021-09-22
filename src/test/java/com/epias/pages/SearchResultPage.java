package com.epias.pages;

import com.epias.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultPage {

    public SearchResultPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(className = "filter-top-result-text")
    public WebElement searchResultText;

    public void verifySearchResult(){
        Assert.assertTrue(searchResultText.getText().contains("sonuç bulundsadfsadfu."));

    }
}
