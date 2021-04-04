package com.ua.rozetka;




import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class BaseLocator  {


     @FindBy(css = "rz-cart.header-actions__component")
     public WebElement BASKET;

     @FindBy(css = "h4.cart-dummy__heading")
     public WebElement BASKETSTATUSEMPTY;

     @FindBy(css = "input[name=\"search\"]")
     public WebElement SEARCH;

     @FindBy(css= "[class =cart-product__coast]")
     public WebElement BASKETWITHITEAM;

     @FindBy(css = "[class = \"button button_color_green button_size_medium search-form__submit\"]")
     public WebElement SUBMITBUT;

     @FindBy(css = "[class ='product-prices__big product-prices__big_color_red']")
     public   WebElement PRICE;

     @FindBy(css = "[class=\"product-prices__big product-prices__big_color_red\"]")
     public  WebElement PRICEWITHSALE;

     @FindBy(css = ".buy-button.button.button_with_icon.button_color_green.button_size_large")
     public   WebElement BUY;


     @FindBy(css = "a[class=\"button button_size_medium button_color_gray cart-footer__continue\"]")
     public WebElement CONTINUED;

     @FindBy(css = ".button.button_color_green.button_size_medium.search-form__submit")
     public WebElement FIND;

     @FindBy(css = "[class= 'goods-tile__heading']")
     public List<WebElement> RANDOMITEAM;

     @FindBy(css ="[class =\"var-options__item\"]" )
     public List<WebElement> OPTIONSITEAM;

     @FindBy(css = "[class =\"button button--medium button--with-icon menu__toggle\"]")
     public WebElement CATALOG;

     @FindBy(css = "[class =\"menu-categories__item\"]")
     public List <WebElement> CATEGORIES;

     @FindBy(css = "[class = 'lang__link']")
     public WebElement LANGUAGE;
}
