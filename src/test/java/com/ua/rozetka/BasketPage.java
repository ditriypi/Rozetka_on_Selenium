package com.ua.rozetka;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class BasketPage  extends  BasePage{
    WebDriver driver;
    String url;

    BasketPage(WebDriver Driver , String Url){
        driver = Driver;
        url  = Url;
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        PageFactory.initElements(driver,this);
        driver.manage().window().maximize();
    }

    public WebElement waitForElement(WebElement ob) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        return wait.until(ExpectedConditions.elementToBeClickable(ob));
    }

    public void open(){
        driver.get(url);
    }

    public  void open(String url){
        driver.get(url);
    }

    public int  numberOfItemsInCart() {

        return Integer.parseInt(BASKETCOUNT.getText());


    }
    public void deleteProduct(){
        CARCTPRODUCT.click();
        DELETE.click();

    }
    public String basketIsEmpty(){
      return BASKETSTATUSEMPTY.getText();
    }

    public void setNumberOfProduct(int i) throws InterruptedException {
        NUMBERPRODUCTCOPIES.clear();
        waitForElement(NUMBERPRODUCTCOPIES).sendKeys((String.valueOf(i)));
       Thread.sleep(5000);

    }


}
