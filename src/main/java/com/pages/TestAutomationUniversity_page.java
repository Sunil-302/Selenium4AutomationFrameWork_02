package com.pages;

import com.utils.DriverFactory;
import org.openqa.selenium.By;

public class TestAutomationUniversity_page extends DriverFactory {

    public void clickOnTheLink(String val) {
        String stringLinks = "//*[contains(text(),'" + val + "')]";
        getDriver().findElement(By.xpath(stringLinks)).click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


//		WebElement links = getDriver().findElement(By.xpath(stringLinks));

    }

}
