package com.stepdefs;


import com.utils.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;


public class TestAutomationUnivercity_steps extends DriverFactory {

    @Given("I will be at {string} page")
    public void i_will_be_at_page(String string) {

        getDriver().get("https://the-internet.herokuapp.com/");

    }

    @When("i will click on the {string} link")
    public void i_will_click_on_the_link(String string) {
        testAutomationUniversityPage.get().clickOnTheLink(string);

    }

}
