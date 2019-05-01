package com.spartaglobal.selenium.bbcwebsite.bbcpageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    private WebDriver driver;

    private String signInPageURL = "https://account.bbc.com/signin";
    private By userField = By.id("user-identifier-input");
    private By passWordField = By.id("password-input");
    private By signinButtonId = By.id("submit-button");
    private By incorrectEmailErrorMessage = By.className("form-message__text");

    public LoginPage(WebDriver driver){this.driver = driver;}

    public WebElement findElement(By element){return driver.findElement(element);}

    public void goToSignInPage(){driver.navigate().to(signInPageURL);}

    public LoginPage inputUserName(String userName){findElement(userField).sendKeys(userName); return this;}

    public LoginPage inputPassWord(String passWord){findElement(passWordField).sendKeys(passWord); return this;}

    public LoginPage clickSignInButton(){
        findElement(signinButtonId).click();
        return this;
    }

    public String getIncorrectEmailErrorText(){
        return findElement(incorrectEmailErrorMessage).getText();
    }

}
