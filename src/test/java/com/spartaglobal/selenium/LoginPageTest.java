package com.spartaglobal.selenium;

import com.spartaglobal.selenium.bbcwebsite.BbcWebsite;
import com.spartaglobal.selenium.bbcwebsite.seleniumconfig.SeleniumConfig;
import org.junit.*;

public class LoginPageTest {

    private static BbcWebsite bbcWebsite;

    @BeforeClass
    public static void setup() {
        bbcWebsite = new BbcWebsite(new SeleniumConfig("chrome").getDriver());
    }

   @Test
   public void isPasswordValid(){
       setup();
       bbcWebsite.loginPage().goToSignInPage();
       bbcWebsite.loginPage().inputUserName("jfeiujfie@@gmail.com").clickSignInButton();
       Assert.assertEquals(bbcWebsite.loginPage().getIncorrectEmailErrorText(), "Sorry, that email doesn’t look right. Please check it's a proper email.");
   }

   @AfterClass
    public static void teardown(){
        bbcWebsite.quitDriver();
   }
}
