package com.spartaglobal.selenium.bbcwebsite;

import com.spartaglobal.selenium.bbcwebsite.bbcpageobject.HomePage;
import com.spartaglobal.selenium.bbcwebsite.bbcpageobject.LoginPage;
import org.openqa.selenium.WebDriver;

public class BbcWebsite {

    private WebDriver driver;

    public BbcWebsite(WebDriver driver){this.driver = driver;}

    public HomePage homePage(){
        return new HomePage(driver);
    }

    public LoginPage loginPage(){
        return new LoginPage(driver);
    }

    public void quitDriver(){
        driver.quit();
    }
}
