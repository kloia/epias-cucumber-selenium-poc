package com.epias.step_def;

import com.epias.pages.RegisterPage;
import io.cucumber.java.en.Then;

public class RegisterPageSteps {

    RegisterPage registerPage = new RegisterPage();
    @Then("user should see register page")
    public void user_should_see_register_page() {
        registerPage.verifyTitle();
    }
}
