package com.fedex.testcases;

import com.fedex.base.Base;
import com.fedex.pages.HomePage;
import com.fedex.pages.LanguagePage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

//Open FedEX Web application
//Route to Main Page
//click on calculate fedEx shipping rates
//from cheeral to arizona university - 10kg pack and display the total charge on the console

public class TC_001 extends Base {

    WebDriver driver;
    LanguagePage languagePage;
    HomePage homePage;

    @Test
    public void cheeral_to_arizona(){
        driver = initialization();
        driver.get("https://www.fedex.com");
        languagePage = new LanguagePage(driver);
        homePage = languagePage.clickOnEnglishLanguage();
        homePage.clickOnIndia();
        homePage.clickOnCovidCloseNotification();
        homePage.clickOnRate();
        driver.quit();
    }
}
