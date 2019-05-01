package com.spartaglobal.selenium.bbcwebsite.seleniumconfig;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class SeleniumConfig {

    private WebDriver driver;
    private SeleniumPropertyReader seleniumProperties = new SeleniumPropertyReader();

    public SeleniumConfig(String browserName){
        if(browserName.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver", seleniumProperties.getChromeDriverPath());
            this.driver = new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.gecko.driver", seleniumProperties.getFireFoxDriverPath());
            this.driver = new FirefoxDriver();
        }
        this.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }

    public WebDriver getDriver() {
        return driver;
    }
}
