package com.fedex.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;
    By countrySelectionElement = By.className("fxg-geo-locator__button-label");
    By closeCovidNotification = By.className("fxg-alert__close-btn");
    By rateAndTransitTimes = By.xpath("//button[@class='fxg-cube__content'][1]");


    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnIndia(){
        driver.findElement(countrySelectionElement).click();
    }
    public void clickOnCovidCloseNotification(){
        driver.findElement(closeCovidNotification).click();
    }

    public void clickOnRate(){
        driver.findElement(rateAndTransitTimes).click();
    }
}
