package com.ua.rozetka;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testBasketpage {
    WebDriver Browser;
    String URL;


    @BeforeMethod
    @Parameters({"browser", "Url"})
    public void setDriver(String browser, String Url) {
        BasePage obj = new BasePage();
        obj.Setdriver(browser);
        URL = obj.returnString(Url);
        Browser = obj.returnDriver();
    }

    @AfterMethod
    public void Dropdown() {
          Browser.quit();
    }


     @Test(groups = {"Basket page"})
    public void whenAddingItemCounterGrow() {
        BasketPage page = new BasketPage(Browser, URL);
        page.open("https://bt.rozetka.com.ua/ua/washing_machines/c80124/");
        page.findrandomProduct();
        page.addtoBasket();
        page.numberOfItemsInCart();
        page.gotoBasket();
        Assert.assertEquals(page.numberOfItemsInCart(), 1);

    }

     @Test(groups = {"Basket page"})
    public void deleteProductFromCard() {
        BasketPage page = new BasketPage(Browser, URL);
        page.open("https://bt.rozetka.com.ua/ua/washing_machines/c80124/");
        page.findrandomProduct();
        page.addtoBasket();
        page.gotoBasket();
        page.deleteProduct();
        Assert.assertEquals(page.basketIsEmpty(), "Кошик порожній");

    }

     @Test(groups = {"Basket page"})
    public void changeAmountProductInBasket() throws InterruptedException {
        BasketPage page = new BasketPage(Browser, URL);
        page.open("https://bt.rozetka.com.ua/ua/washing_machines/c80124/");
        page.findrandomProduct();
        page.addtoBasket();
        page.gotoBasket();
        page.setNumberOfProduct(3);
        Assert.assertEquals(page.numberOfItemsInCart(),3);


    }
}