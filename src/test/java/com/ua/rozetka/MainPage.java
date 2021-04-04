package com.ua.rozetka;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class MainPage extends  BasePage {
    private   WebDriver driver;
    private   String url;


    MainPage(String Url, WebDriver Driver) {
        url = Url;
        driver = Driver;
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        PageFactory.initElements(driver, this);

    }


    public void switchLanguage(){
        LANGUAGE.click();
    }


    public void open(){
        driver.get(url);
        System.out.println(url);
    }
    public void open(String url){
        driver.get(url);
    }

    public void  search(String text){
        SEARCH.sendKeys(text);
        FIND.click();

    }



    public WebElement waitForElement(WebElement ob) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        return wait.until(ExpectedConditions.elementToBeClickable(ob));
    }



    public String checkSumOnItemPage () {
        String returnPrice = null;
        try {
            if (PRICEWITHSALE != null) {
                PRICEWITHSALE.getText();
                String ob  = PRICEWITHSALE.getText();
                return  ob.substring(0,ob.length()-1);
            }
        } catch (NullPointerException ex) {}
        try {
            if (PRICE != null) {
                PRICE.getText() ;
                String ob = PRICE.getText();
                return ob.substring(0, ob.length() - 1);
            }
        }catch (NullPointerException ex){}
        return returnPrice;
    }
    public void goToCatalog(){
        CATALOG.click();
        CATEGORIES.get(0).click();
       waitForElement(driver.findElement
               (By.cssSelector("[href=\"https://rozetka.com.ua/ua/phones-mp3-gps/c80257/\"]"))).click();




    }



}























