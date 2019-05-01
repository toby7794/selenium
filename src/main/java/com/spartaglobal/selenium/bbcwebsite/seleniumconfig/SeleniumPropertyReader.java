package com.spartaglobal.selenium.bbcwebsite.seleniumconfig;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class SeleniumPropertyReader {

    private String chromeDriverPath;
    private String fireFoxDriverPath;
    private String propertiesFileLocation = "resources/selenium.properties";


    public SeleniumPropertyReader() {

        Properties seleniumProperties = new Properties();

        try {
            seleniumProperties.load(new FileReader(propertiesFileLocation));
        } catch (IOException e) {
            e.printStackTrace();
        }

        chromeDriverPath = seleniumProperties.getProperty("chromedriverpath");
        fireFoxDriverPath = seleniumProperties.getProperty("firefoxdriverpath");
    }

    public String getChromeDriverPath() {
        return chromeDriverPath;
    }

    public String getFireFoxDriverPath() {
        return fireFoxDriverPath;
    }
}
