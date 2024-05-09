package page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.text.DecimalFormat;

public class TransactionPage {
        public static WebDriver webDriver;
        public TransactionPage(WebDriver webDriver) {
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
            return product2Data;
        }

        @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-fleece-jacket']")
        private WebElement product3Data;
        public WebElement getProduct3Data(){
            return product3Data;
        }

        @FindBy(xpath = "//button[@id='remove-sauce-labs-backpack']")
            private WebElement removeButton;
            public WebElement getRemoveButton(){
                return removeButton;
            }
        @FindBy(xpath = "//button[@id='remove-sauce-labs-backpack']")
        private WebElement remove1Button;
        public WebElement getRemove1Button(){
            return remove1Button;
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


        @FindBy(xpath = "//span[@class='shopping_cart_badge']")
        private WebElement countListProduct;
        public WebElement getCountListProduct(){
            return countListProduct;
        };

        @FindBy(xpath = "//div[.='Sauce Labs Backpack']")
        private WebElement deleteElement;
        public WebElement getDeleteElement(){
            return deleteElement;
        }

        @FindBy(xpath = "//button[@id='checkout']")
        private WebElement buttonCheckout;
        public WebElement getButtonCheckout(){
            return buttonCheckout;
        }

        @FindBy(xpath = "//input[@id='first-name']")
        private WebElement firstNameField;
        public WebElement getFirstNameField(){
            return firstNameField;
        }

        @FindBy(xpath = "//input[@id='last-name']")
        private WebElement lastNameField;
        public WebElement getLastNameField(){
            return lastNameField;
        }

        @FindBy(xpath = "//input[@id='postal-code']")
        private WebElement portalCodeField;
        public WebElement getPortalCodeField(){
            return portalCodeField;
        }

        @FindBy(xpath = "//input[@id='continue']")
        private WebElement continueButton;
        public WebElement getContinueButton(){
            return continueButton;
        }

        @FindBy(xpath = "//button[@id='finish']")
        private WebElement finishButton;
        public WebElement getFinishButton(){
            return finishButton;
        }

        @FindBy(xpath = "//div[@class='summary_subtotal_label']")
        private WebElement itemTotal;
        public double numberItemTotal(){
        String text = itemTotal.getText();
        String number = text.replaceAll("[^.0-9]", "");
        float numbers = Float.parseFloat(number);
        return Double.parseDouble(new DecimalFormat("##.##").format(numbers));
        }

        public double setNominalTax(){
        String text = itemTotal.getText();
        String number = text.replaceAll("[^.0-9]", "");
        float numbers = Float.parseFloat(number);
        double x = numbers * 0.08;
        return Double.parseDouble(new DecimalFormat("##.##").format(x));
        }

        @FindBy(xpath = "//div[@class='summary_tax_label']")
        private WebElement taxLabel;
        public double numberSTaxLabel(){
        String text = taxLabel.getText();
        String number = text.replaceAll("[^.0-9]", "");
        float numbers = Float.parseFloat(number);
        return Double.parseDouble(new DecimalFormat("##.##").format(numbers));
        }

        @FindBy(xpath = "//div[@class='summary_total_label']")
        private WebElement total;
        public double nominalTotal(){
        String text = total.getText();
        String number = text.replaceAll("[^.0-9]", "");
        float numbers = Float.parseFloat(number);
        return Double.parseDouble(new DecimalFormat("##.##").format(numbers));
        }

        @FindBy(xpath = "//h2[@class='complete-header']")
        private WebElement finishProses;
        public WebElement getFinishProses(){
            return finishProses;
        }

        @FindBy(xpath = "//h3[.='Error: First Name is required']")
        private WebElement fistNameBlankInformation;
        public WebElement getFistNameBlankInformation(){
            return fistNameBlankInformation;
        }

        @FindBy(xpath = "//h3[.='Error: Last Name is required']")
        private WebElement lastNameBlankInformation;
        public WebElement getLastNameBlankInformation(){
            return lastNameBlankInformation;
        }

        @FindBy(xpath = "//h3[.='Error: Postal Code is required']")
        private WebElement portalCodeBlankInformation;
        public WebElement getPortalCodeBlankInformation(){
            return portalCodeBlankInformation;
        }

        @FindBy(xpath = "//h3[.='Error: Please Input valid Data']")
        private WebElement invalidDataInformation;
        public WebElement getInvalidDataInformation(){
            return invalidDataInformation;
        }

        @FindBy(xpath = "//h3[.='Error: Your Input very Long']")
        private WebElement longDataInformation;
        public WebElement getLongDataInformation(){
            return longDataInformation;
        }


        @FindBy(xpath = "//h3[.='Error: Your Input very Short']")
        private WebElement shortDataInformation;
        public WebElement getShortDataInformation(){
            return shortDataInformation;
        }

}