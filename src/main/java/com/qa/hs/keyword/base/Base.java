package com.qa.hs.keyword.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Base {
    public WebDriver driver;
    public Properties prop;

    public WebDriver init_driver(String browserName) {
        if (browserName.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
            if (prop.getProperty("headless").equals("yes")) {
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--headless");
                driver = new ChromeDriver(options);
            } else {
                driver = new ChromeDriver();
            }
        }
        return driver;
    }

    public Properties init_properties() throws FileNotFoundException {
        prop = new Properties();
        try {
            FileInputStream ip = new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\src\\test\\java\\Selenium\\KeywordDriven\\src\\main\\java\\com\\qa\\hs\\keyword\\config\\config.properties");
            prop.load(ip);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop;
    }
}