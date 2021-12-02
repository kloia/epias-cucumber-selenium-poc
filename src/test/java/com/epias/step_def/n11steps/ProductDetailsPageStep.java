package com.epias.step_def.n11steps;

import com.epias.pages.n11pages.ProductDetailsPage;
import io.cucumber.java.en.Then;

public class ProductDetailsPageStep {

    ProductDetailsPage productDetailsPage = new ProductDetailsPage();

    @Then("user should see add to cart button")
    public void user_should_see_add_to_cart_button() {
        productDetailsPage.verifyAddToCart();
    }


}
