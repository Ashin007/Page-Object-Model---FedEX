package com.fedex.testcases;

import com.fedex.base.Base;
import com.fedex.pages.HomePage;
import com.fedex.pages.LanguagePage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//Open FedEX Web application
//Route to Main Page
//click on calculate fedEx shipping rates
//from cheeral to arizona university - 10kg pack and display the total charge on the console

public class TC_001 extends Base {

    WebDriver driver;
    LanguagePage languagePage;
    HomePage homePage;

    @BeforeTest
    public void setUpFunction(){
        System.out.println("Invoked Before Function");
    }

    @Test
    public void cheeral_to_arizona(){
        driver = initialization();
        System.out.println("Initialization");
        driver.get("https://www.fedex.com");
        System.out.println("Opening URL");
        languagePage = new LanguagePage(driver);
        homePage = languagePage.clickOnEnglishLanguage();
        homePage.clickOnIndia();
        homePage.clickOnCovidCloseNotification();
        homePage.clickOnRate();
        System.out.println("Quit Browser");
        driver.quit();
    }
}
