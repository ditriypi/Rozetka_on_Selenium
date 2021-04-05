package com.ua.rozetka;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testLoginpage {

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


 @Test(groups = "Login page")
    public void testloginOnSite(){
        LoginPage page = new LoginPage(URL, Browser);
        page.open();
        page.gotoAccountField();
        page.setLogin("testaccount@gmail.com");
        page.setPassword("1234test");
        page.loginOnSite();
 }
    @Test(groups = "Login page")
    public void testRegistrationOnSite(){
        LoginPage page = new LoginPage(URL, Browser);
        page.open();
        page.goToRegistrationField();
        page.setDataInRegistrationField();
        page.clickOnRegbutton();
        page.succsesReg();
        Assert.assertEquals( page.succsesReg(),"Підтвердження номера телефону");

    }
    @Test(groups = "Login page")
    public void testRestorePassword(){
        LoginPage page = new LoginPage(URL, Browser);
        page.open();
        page.gotoAccountField();
        page.restorePassword();
        page.setLogin("testaccount@gmail.com");
        page.clickOnRestorePasswordBtn();


    }
    


}
