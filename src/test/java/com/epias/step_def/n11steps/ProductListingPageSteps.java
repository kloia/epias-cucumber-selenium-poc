package com.epias.step_def.n11steps;

import com.epias.pages.n11pages.ProductListingPage;
import io.cucumber.java.en.When;

public class ProductListingPageSteps {

    ProductListingPage productListingPage = new ProductListingPage();

    @When("clicks on {int}st product")
    public void clicks_on_st_product(int productNumber) {
        productListingPage.clickProductByNumber(productNumber);
    }
}
