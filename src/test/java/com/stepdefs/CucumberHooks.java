package com.stepdefs;

import com.utils.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;

public class CucumberHooks extends DriverFactory {

    @After
    public void tearDown() {
        closeDriverSession();

    }
}
