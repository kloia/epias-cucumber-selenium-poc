package com.epias.step_def;

import com.epias.utilities.ConfReader;
import com.epias.utilities.Driver;
import io.cucumber.java.en.Given;

public class HomepageSteps {

    @Given("homepage is opened")
    public void homepage_is_opened() {
        Driver.get().get(ConfReader.get("url"));
    }

}
