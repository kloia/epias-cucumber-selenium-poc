package com.epias.step_def;

import com.epias.pages.ProductListingPage;
import com.epias.utilities.Utils;
import io.cucumber.java.en.When;

public class ProductListingPageSteps {

    ProductListingPage productListingPage = new ProductListingPage();

    @When("clicks on {int}st product")
    public void clicks_on_st_product(int productNumber) {
        productListingPage.clickProductByNumber(productNumber);
    }
}
