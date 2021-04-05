package com.ua.rozetka;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginLocator {
    @FindBy(id = "auth_email")
    WebElement EMAIL;

    @FindBy(id ="auth_pass")
    WebElement PASSWORD;

    @FindBy(css = "[class='button button--large button--green auth-modal__submit']")
    WebElement LOGINBTN;

    @FindBy(css = "[href=\"https://my.rozetka.com.ua/signup/\"]")
    WebElement GOTOREGISTRATIONFIELD;

    @FindBy(xpath = "//div/form/fieldset[1]/input")
    WebElement NAME;
    @FindBy(xpath = "//div/form/fieldset[2]/input")
    WebElement SURNAME;

    @FindBy(xpath = "//div/form/fieldset[3]/input")
    WebElement PHONENUMBER;

    @FindBy(xpath = "//div/form/fieldset[4]/input")
    WebElement REGISTRATIONEMAIL;

    @FindBy(xpath = "//div/form/fieldset[5]/div/input")
    WebElement REGISTRATIONPASWRD;

    @FindBy(xpath = "//div/form/div[2]/button[1]")
    WebElement REGISTRATION;

    @FindBy(css = "[class='header-actions__item header-actions__item--user']")
    WebElement USERICON;

    @FindBy(css = "[class='auth-modal__form ng-untouched ng-pristine ng-invalid'] h1")
    WebElement SUCCESSFULREGISTRATIONTEXT;

    @FindBy(css = "[class='button button--large button--green auth-modal__get-pass']" )
    WebElement  GETTEMPORARYPASSWORD;


    @FindBy(css = "[class=\"link-dotted auth-modal__restore-link\"]")
    WebElement REMEMBERPASSWORD;

}
