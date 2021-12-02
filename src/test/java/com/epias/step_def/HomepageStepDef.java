package com.epias.step_def;

import com.epias.pages.Homepage;
import com.epias.utilities.ConfReader;
import com.epias.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class HomepageStepDef {

    Homepage homepage = new Homepage();

    @Given("I open the homepage")
    public void i_open_the_homepage() {
        Driver.get().get(ConfReader.get("url"));
    }

    @Given("I open the login page")
    public void i_open_the_login_page() {
        homepage.openLoginPage();
    }

    @Then("I should see logged in")
    public void i_should_see_logged_in() {
        homepage.verifyMyAccount();
    }
}
