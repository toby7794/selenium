package com.spartaglobal.selenium;

import com.spartaglobal.selenium.bbcwebsite.BbcWebsite;
import com.spartaglobal.selenium.bbcwebsite.seleniumconfig.SeleniumConfig;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\TGoddard\\Documents\\chromedriver\\chromedriver.exe");
        //WebDriver chromeDriver = new ChromeDriver();

        BbcWebsite bbcWebsite = new BbcWebsite(new SeleniumConfig("chrome").getDriver());
        bbcWebsite.homePage().goToHomePage();
        bbcWebsite.homePage().clickSignInLink();
        bbcWebsite.loginPage().inputUserName("gehiwfwk").inputPassWord("nvjewifkec");
//        bbcWebsite.loginPage().inputUserName("jenfkwnca");
//        bbcWebsite.loginPage().inputPassWord("nkjnvdfksv");
        //bbcWebsite.quitDriver();

//        chromeDriver.navigate().to("https://www.bbc.co.uk/");
//        chromeDriver.findElement(By.id("idcta-username")).click();
//        System.out.println(chromeDriver.getCurrentUrl());
//        System.out.println(chromeDriver.findElement(By.id("user-identifier-input")).isDisplayed());
//        chromeDriver.findElement(By.id("user-identifier-input")).sendKeys("vmeosmvosmo@gmail.com");
//        chromeDriver.findElement(By.id("password-input")).sendKeys("fkglsogomsl");
//
//        chromeDriver.findElement(By.id("user-identifier-input")).click();
//        System.out.println(chromeDriver.findElement(By.className("form-message__text")).getText());
//        System.out.println(chromeDriver.findElement(By.xpath("//*[@id=\"form-message-password\"]")).getText());
//        chromeDriver.findElement(By.className("top-story__title")).click();
//        System.out.println(chromeDriver.getCurrentUrl());
//*[@id="form-message-password"]/p/span


       // chromeDriver.quit();
    }
}
