package com.ua.rozetka;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;


import java.util.Collections;
import java.util.List;

public class BasePage extends BaseLocator {
    WebDriver driver;


    public String returnString(String urk) {
        return urk;
    }

    public WebDriver returnDriver() {
        return driver;

    }

    public static WebDriver initFierfoxDriver() {
        System.setProperty("webdriver.gecko.driver", "C:\\driver\\geckodriver.exe");
        return new FirefoxDriver();
    }


    public static WebDriver initChromeDriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
        return new ChromeDriver();
    }


    public void Setdriver(String drivertype) {

        switch (drivertype) {
            case "fierfox" -> driver = initFierfoxDriver();
            case "chrome" -> driver = initChromeDriver();
        }
    }
    public void findRandomProductOption(){
        int el =(int)(1+Math.random()*OPTIONSITEAM.size());
        OPTIONSITEAM.get(el).click();

    }

    public void findrandomProduct() {

        int el = (int) (1 + Math.random() * RANDOMITEAM.size()/2);
        RANDOMITEAM.get(el).click();

    }
    public void addtoBasket(){
        BUY.click();
        CONTINUED.click();

    }
    public void gotoBasket(){
        BASKET.click();
    }

    public String checkBasketSum(){
        BASKETWITHITEM.getText();
        String og = BASKETWITHITEM.getText();
        return  og.substring(0,og.length()-2);
    }



}












