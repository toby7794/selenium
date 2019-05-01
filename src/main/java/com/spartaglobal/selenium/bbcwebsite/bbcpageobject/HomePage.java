package com.spartaglobal.selenium.bbcwebsite.bbcpageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;

    private final String homePageURL = "https://www.bbc.co.uk/";

    //attributes of the page
    private final By signInLink = By.id("idcta-link");

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    //behavours of page
    public HomePage goToHomePage(){
        driver.navigate().to(homePageURL);
        return this;
    }

    public HomePage clickSignInLink(){
        driver.findElement(signInLink).click();
        return this;
    }

}
