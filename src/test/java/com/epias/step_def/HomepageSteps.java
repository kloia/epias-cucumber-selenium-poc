package com.epias.step_def;

import com.epias.pages.Homepage;
import com.epias.utilities.ConfReader;
import com.epias.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class HomepageSteps {

    Homepage homepage = new Homepage();
    @Given("homepage is opened")
    public void homepage_is_opened() {
        Driver.get().get(ConfReader.get("url"));
    }


    @When("clicks on sign up button")
    public void clicks_on_sign_up_button() {

        homepage.clickSignUpButton();
    }

}
