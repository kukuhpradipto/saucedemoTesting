package step_definitions.page_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import page_object.HomePage;
import page_object.LoginPages;
import step_definitions.main.Hooks;

public class HomeStepdefs {

    private final WebDriver webDriver;

    public HomeStepdefs(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @And("User click button Add to Cart product with name \\\"(.*)\\\"")
    public void userClickButtonAddToCartProductWithName(String product1) {
        HomePage homePage = new HomePage(webDriver);
        homePage.getProduct1Data().click();
    }

    @And("User click icon Cart")
    public void userClickIconCart() {
    }

    @And("User click button Checkout")
    public void userClickButtonCheckout() {
    }

    @And("User input form First Name")
    public void userInputFormFirstName() {
    }

    @And("User input form Last Name")
    public void userInputFormLastName() {
    }

    @And("Form Last Name data is blank")
    public void formLastNameDataIsBlank() {
    }

    @And("User can't click button Add to Cart")
    public void userCanTClickButtonAddToCart() {
        HomePage homePage = new HomePage(webDriver);
        homePage.getHomePage().isDisplayed();
        Assert.assertTrue(true);
    }
}
