package page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPages {
        public static WebDriver webDriver;
        public LoginPages(WebDriver webDriver) {
            PageFactory.initElements(webDriver, this);
            this.webDriver = webDriver;
        }

        @FindBy(xpath = "//div[@class='login_logo']")
        private WebElement loginPage;
        public WebElement getLoginPage(){
            return loginPage;
        }


        @FindBy(xpath = "//input[@id='user-name']")
        private WebElement loginUsername;
        public WebElement getLoginUsername(){
            return loginUsername;
        }


        @FindBy(xpath = "//input[@id='password']")
        private WebElement loginPassword;
        public WebElement getLoginPassword(){
            return loginPassword;
        }

        @FindBy(xpath = "//input[@id='login-button']")
        private WebElement loginButton;
        public WebElement getLoginButton(){
            return loginButton;
        }


        @FindBy(xpath = "//h3[.='Epic sadface: Username and password do not match any user in this service']")
        private WebElement invalidLogin;
        public WebElement getInvalidLogin(){
            return invalidLogin;
        }

        @FindBy(xpath = "//h3[.='Epic sadface: Password is required']")
        private WebElement notifBlankData;
        public WebElement getNotifBlankData(){
            return notifBlankData;
        }

        @FindBy(xpath = "//h3[.='Epic sadface: Sorry, this user has been locked out.']")
        private WebElement notifLockedUser;
        public WebElement getNotifLockedUser(){
            return notifLockedUser;
        }

        @FindBy(xpath = "//h3[.='Epic sadface: Username is required']")
        private WebElement notifUsernameReq;
        public WebElement getNotifUsernameReq(){
            return notifUsernameReq;
        }

}