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

        @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']")
        private WebElement product1Data;
        public WebElement getProduct1Data(){
            return product1Data;
        }
}