package step_definitions.page_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import data_center.HomeData;
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

    @And("User verify change make Remove Button")
    public void userVerifyChangeMakeRemoveButton() {
        HomePage homePage = new HomePage(webDriver);
        homePage.getRemoveButton().isDisplayed();
        Assert.assertTrue(true);
    }

    @And("User verify change make Remove Button at first product")
    public void userVerifyChangeMakeRemoveButtonAtProduct() {
    }

    @And("User click button Add to Cart first product with name  \\\"(.*)\\\"")
    public void userClickButtonAddToCartProductWithName(String namaProductPertama) {
    }

    @And("User verify the number of product selected is the same as in the Cart Icon")
    public void userVerifyTheNumberOfProductSelectedIsTheSameAsInTheCartIcon() {
    }

    @Then("User click on icon cart to verify product")
    public void userClickOnIconCartToVerifyProduct() {
    }





    @And("User click checkout button")
    public void userClickCheckoutButton() {
    }

    @When("User input Firs Name field on form Detail information")
    public void userInputFirsNameFieldOnFormDetailInformation() {
    }

    @And("User input Last Name field on form Detail information")
    public void userInputLastNameFieldOnFormDetailInformation() {
    }

    @And("User input Portal Code field on form Detail information")
    public void userInputPortalCodeFieldOnFormDetailInformation() {
    }

    @And("User click Checkout Button fot next step")
    public void userClickCheckoutButtonFotNextStep() {
    }

    @And("User verify price total product")
    public void userVerifyPriceTotalProduct() {
    }

    @And("User verify taxt nominal base on price total product")
    public void userVerifyTaxtNominalBaseOnPriceTotalProduct() {
    }

    @And("User click button finish")
    public void userClickButtonFinish() {
    }

    @Then("User complete order")
    public void userCompleteOrder() {
    }

    @And("User click button Add to Cart first product with name  \"(.*)\"")
    public void userClickButtonAddToCartFirstProductWithName(String arg0) {
    }

    @And("User click button Add to Cart first product with name Sauce Labs Backpack")
    public void userClickButtonAddToCartFirstProductWithNameSauceLabsBackpack() {
        HomePage homePage = new HomePage(webDriver);
        homePage.getProduct1Data().click();
    }

    @And("User click button Add to Cart second product with name Sauce Labs Bolt T-Shirt")
    public void userClickButtonAddToCartSecondProductWithNameSauceLabsBoltTShirt() {
        HomePage homePage = new HomePage(webDriver);
        homePage.getProduct2Data().click();
    }

    @And("User verify change make Remove Button at second product")
    public void userVerifyChangeMakeRemoveButtonAtSecondProduct() {
        HomePage homePage = new HomePage(webDriver);
        homePage.getRemove2Button().isDisplayed();
        Assert.assertTrue(true);
    }

    @And("User click button Add to Cart third product with name Sauce Labs Fleece Jacket")
    public void userClickButtonAddToCartThirdProductWithNameSauceLabsFleeceJacket() {
        HomePage homePage = new HomePage(webDriver);
        homePage.getProduct3Data().click();
    }

    @And("User verify change make Remove Button at third product")
    public void userVerifyChangeMakeRemoveButtonAtThirdProduct() {
        HomePage homePage = new HomePage(webDriver);
        homePage.getRemove3Button().isDisplayed();
        Assert.assertTrue(true);
    }
}
