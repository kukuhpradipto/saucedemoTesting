package page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
        public static WebDriver webDriver;
        public HomePage(WebDriver webDriver) {
            PageFactory.initElements(webDriver, this);
            this.webDriver = webDriver;
        }

        @FindBy(xpath = "//span[@class='title']")
        private WebElement homePage;
        public WebElement getHomePage(){
            return homePage;
        }

        @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")
        private WebElement product1Data;
        public WebElement getProduct1Data(){
            return product1Data;
        }

        @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']")
        private WebElement product2Data;
        public WebElement getProduct2Data(){
            return product1Data;
        }

        @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-fleece-jacket']")
        private WebElement product3Data;
        public WebElement getProduct3Data(){
            return product1Data;
        }

        @FindBy(xpath = "//button[@id='remove-sauce-labs-backpack']")
            private WebElement removeButton;
            public WebElement getRemoveButton(){
                return removeButton;
            }


    @FindBy(xpath = "//button[@id='remove-sauce-labs-bolt-t-shirt']")
        private WebElement remove2Button;
        public WebElement getRemove2Button(){
        return removeButton;
    }


    @FindBy(xpath = "//button[@id='remove-sauce-labs-bike-light']")
        private WebElement remove3Button;
        public WebElement getRemove3Button(){
        return removeButton;
    }
}