package com.ua.rozetka;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasketLocator  {
    @FindBy(css = "[class ='counter counter--green']")
    public WebElement BASKETCOUNT;

    @FindBy(css = "h4.cart-dummy__heading")
    public WebElement BASKETSTATUSEMPTY;

    @FindBy(css= "[class =cart-product__coast]")
    public WebElement BASKETWITHITEM;

    @FindBy(css = "rz-cart.header-actions__component")
    public WebElement BASKET;

    @FindBy(css = "[id='cartProductActions0']")
    public WebElement CARCTPRODUCT;

    @FindBy(css = "[class='button button--medium button--with-icon button--link context-menu-actions__button']")
    public WebElement DELETE;

    @FindBy(xpath = "//rz-cart-product/div/div[2]/rz-cart-counter/div/input")
    public WebElement NUMBERPRODUCTCOPIES;
}
