package com.fedex.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LanguagePage {

    WebDriver driver;
    By languageElement = By.xpath("//div[@data-emptytext='Rich Text']/p/a");


    public LanguagePage(WebDriver driver) {
        this.driver = driver;
    }


    public HomePage clickOnEnglishLanguage(){
        driver.findElement(languageElement).click();

        return new HomePage(driver);
    }

}
