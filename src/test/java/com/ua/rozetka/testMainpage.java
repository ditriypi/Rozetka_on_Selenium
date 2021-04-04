package com.ua.rozetka;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.*;

public class testMainpage {


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






    @Test(groups = {"MainPage page"})
    public void addProductFromSearch(){
        MainPage page = new MainPage(URL, Browser);
        page.open();
        page.search("ноутбук");
        page.findrandomProduct();
        page.addtoBasket();

    }


    @Test(groups = {"Main page"})
    public void addProductFromCatalog() {
        MainPage page = new MainPage(URL, Browser);
        page.open();
        page.goToCatalog();
        page.findrandomProduct();
        page.addtoBasket();
        }


      @Test(groups = {"Main page"})
    public void addItemToBasketAndCompearePrice() {
        MainPage page = new MainPage(URL, Browser);
        page.open();
        page.search("ноутбук");
        page.findrandomProduct();
        page.checkSumOnItemPage();
        page.addtoBasket();
        page.gotoBasket();
        page.checkBasketSum();
        Assert.assertEquals(page.checkBasketSum(), page.checkSumOnItemPage());
    }

     @Test(groups = {"Main page"})
    public void addProductWithDifferentParameter() {
        MainPage page = new MainPage(URL, Browser);
        page.open("https://rozetka.com.ua/ua/z16_2000000107974_1/p251796656/");
        page.findRandomProductOption();


    }
    @Test
    public void switchLanguage(){
        MainPage page = new MainPage(URL,Browser);
        page.open();
        page.switchLanguage();
    }
}


