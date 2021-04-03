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
  private WebDriverWait wait;

    MainPage(String Url, WebDriver Driver) {
        url = Url;
        driver = Driver;
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 5);
        PageFactory.initElements(driver, this);

    }

    public WebElement waitForElement(WebElement ob) {
        WebDriverWait wait = new WebDriverWait(driver, 15);
        return wait.until(ExpectedConditions.elementToBeClickable(ob));
    }

    public String checkSumOnIteamPage () {
        String returnPrice = null;
        try {
        if (waitForElement(PRICEWITHSALE) != null) {
           waitForElement(PRICEWITHSALE).getText();
            String ob  = PRICEWITHSALE.getText();
            return  ob.substring(0,ob.length()-1);
        }
    } catch (NullPointerException ex) {}
        try {
        if (waitForElement(PRICE) != null) {
             waitForElement(PRICE).getText() ;
            String ob = PRICE.getText();
            return ob.substring(0, ob.length() - 1);
        }
    }catch (NullPointerException ex){}
        return returnPrice;
}



    public void open(){
        driver.get(url);
        System.out.println(url);
    }
    public void open(String url){
        driver.get(url);
    }

    public void  search(String text){
        waitForElement(SEARCH).sendKeys(text);
        waitForElement(FIND).click();

    }
    public void addtoBasket(){
      waitForElement(BUY).click();
       waitForElement(CONTINUED).click();

    }

    public void gotoBasket(){
        waitForElement(BASKET).click();
    }


    public String checkBasketSum(){
        waitForElement(BASKETWITHITEAM).getText();
        String og =BASKETWITHITEAM.getText();
        return  og.substring(0,og.length()-2);
    }




}















