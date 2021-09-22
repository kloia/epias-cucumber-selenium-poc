package com.epias.step_def;

import com.epias.utilities.ConfReader;
import com.epias.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.util.concurrent.TimeUnit;

public class Hooks {

    @Before
    public void setup(){
        Driver.get().get(ConfReader.get("url"));
        Driver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Driver.get().manage().window().maximize();
    }
    @After
    public void teardown(){
        Driver.closeDriver();
    }
}
