package com.epias.step_def;

import com.epias.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginPageSteps {
    LoginPage loginPage = new LoginPage();
    @Given("I fill usernamebox with {string}")
    public void i_fill_usernamebox_with(String username) {
        loginPage.fillUsername(username);
    }

    @Given("I fill passwordbox with {string}")
    public void i_fill_passwordbox_with(String password) {
        loginPage.fillPass(password);
    }

    @When("I click on login button")
    public void i_click_on_login_button() {

    }
}
