package com.utils;

import com.pages.TestAutomationUniversity_page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;
import java.util.HashMap;

public class DriverFactory {

    // Constructer
    protected DriverFactory() {

//        globalProp = PropertyFileUtils.getAllProperties(System.getProperty("user.dir") + "\\GlobalConfig.properties");

    }


    public static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    private static HashMap<String, String> globalProp;


    // Object calling

    public static ThreadLocal<TestAutomationUniversity_page> testAutomationUniversityPage = new ThreadLocal<>();


    public WebDriver getDriver() {

        if (driver.get() == null) {
            driver.set(initiliseDriver("Chrome", 10));
        }
        return driver.get();
    }

    protected void closeDriverSession() {
        driver.get().quit();
        driver.set(null);
    }

    WebDriver initiliseDriver(String browserName, int implicitWait) {

        if (browserName.equalsIgnoreCase("chrome")) {
            driver.set(new ChromeDriver());

        } else if (browserName.equalsIgnoreCase("firefox")) {
            driver.set(new FirefoxDriver());

        } else if (browserName.equalsIgnoreCase("ie")) {
            driver.set(new EdgeDriver());

        } else if (browserName.equalsIgnoreCase("safari")) {
            driver.set(new SafariDriver());

        }

        driver.get().manage().window().maximize();
        driver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(implicitWait));

        /*  Page factory initialization for pages */
        testAutomationUniversityPage.set(PageFactory.initElements(driver.get(), TestAutomationUniversity_page.class));


        return driver.get();
    }


}
