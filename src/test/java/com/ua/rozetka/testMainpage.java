package com.ua.rozetka;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.*;

public class testMainpage {


    WebDriver Browser;
    String HHT;


    @BeforeMethod
    @Parameters({"browser", "value"})
    public void setDriver(String browser, String value) {
        System.out.println(value);
        BasePage obj = new BasePage();
        obj.Setdriver(browser);
        HHT = obj.returnString(value);
        Browser = obj.returnDriver();
    }

    @AfterMethod
    public void Dropdown() {
          Browser.quit();
    }


     @Test(groups = {"Main page"})
    public void addIteamToBasketAndCompearePrice() {
        MainPage page = new MainPage(HHT, Browser);
        page.open();
        page.search("ноутбук");
        page.findrandomProduct();
        page.checkSumOnIteamPage();
        page.addtoBasket();
        page.gotoBasket();
        page.checkBasketSum();
        Assert.assertEquals(page.checkBasketSum(), page.checkSumOnIteamPage());
    }


   @Test(groups = {"Main page"})
    public void addProductWithDifferentParameter() {
        MainPage page = new MainPage(HHT, Browser);
        page.open("https://rozetka.com.ua/ua/z16_2000000107974_1/p251796656/");
        page.findRandomProductOption();


    }



 //   @Test(groups = {"Main page"})
    public void s() {
    }
}

  //  }
  //  @Test(groups = {"MainPage"})
  // public void findproductfromcatalog(){
    //    MainPage page = new MainPage(Browser,HHT);
        //page.checkingTheAvailabilityInTheShoppingCart();

//}