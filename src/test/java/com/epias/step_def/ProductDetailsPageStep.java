package com.epias.step_def;

import com.epias.pages.ProductDetailsPage;
import com.epias.utilities.Driver;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.PageFactory;

public class ProductDetailsPageStep {

    ProductDetailsPage productDetailsPage = new ProductDetailsPage();

    @Then("user should see add to cart button")
    public void user_should_see_add_to_cart_button() {
        productDetailsPage.verifyAddToCart();
    }


}
