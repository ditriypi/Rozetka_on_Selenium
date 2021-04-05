package com.ua.rozetka;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class LoginPage extends  BasePage {

        private WebDriver driver;
        private String url;


        LoginPage(String Url, WebDriver Driver) {
            url = Url;
            driver = Driver;
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

            PageFactory.initElements(driver, this);

        }

        public void open() {
            driver.get(url);
            System.out.println(url);
        }

        public void open(String url) {
            driver.get(url);
        }

        public void setLogin(String login){
            EMAIL.sendKeys(login);
        }
        public  void gotoAccountField(){
         USERICON.click();
     }

        public void setPassword(String paswrd){
            PASSWORD.sendKeys(paswrd);
        }


        public void loginOnSite(){
            LOGINBTN.click();
        }

        public void goToRegistrationField(){
            USERICON.click();
            GOTOREGISTRATIONFIELD.click();
    }

         public void setDataInRegistrationField(){
              NAME.sendKeys("Дмитрий");
              SURNAME.sendKeys("Иванович");
              PHONENUMBER.sendKeys("0666484021");
              REGISTRATIONEMAIL.sendKeys("test11223@gmail.com");
              REGISTRATIONPASWRD.sendKeys("1234Test");
    }
         public void restorePassword(){
              REMEMBERPASSWORD.click();

   }

         public void clickOnRegbutton(){
        REGISTRATION.click();
    }

         public String succsesReg(){
              return  SUCCESSFULREGISTRATIONTEXT.getText();
    }

    public void clickOnRestorePasswordBtn(){
            GETTEMPORARYPASSWORD.click();
    };
    }
