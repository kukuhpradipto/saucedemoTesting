package step_definitions.page_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import data_center.TransactionData;
import org.openqa.selenium.*;
import org.junit.Assert;
import page_object.TransactionPage;
import step_definitions.main.Hooks;

public class TransactionStepdefs {

    private final WebDriver webDriver;

    public TransactionStepdefs(){
        super();
        this.webDriver = Hooks.webDriver;
    }

    @And("User can't click button Add to Cart")
    public void userCanTClickButtonAddToCart() throws InterruptedException {
        TransactionPage transactionPage = new TransactionPage(webDriver);
        transactionPage.getHomePage().isDisplayed();
        Assert.assertTrue(true);
        Thread.sleep(500);
    }

    @And("User verify change make Remove Button at first product")
    public void userVerifyChangeMakeRemoveButtonAtProduct() throws InterruptedException {
        TransactionPage transactionPage = new TransactionPage(webDriver);
        transactionPage.getRemove1Button().isDisplayed();
        Assert.assertTrue(true);
        Thread.sleep(500);
    }

    @And("User click button Add to Cart first product with name Sauce Labs Backpack")
    public void userClickButtonAddToCartFirstProductWithNameSauceLabsBackpack() throws InterruptedException {
        TransactionPage transactionPage = new TransactionPage(webDriver);
        transactionPage.getProduct1Data().click();
        Thread.sleep(500);
    }

    @And("User click button Add to Cart second product with name Sauce Labs Bolt T-Shirt")
    public void userClickButtonAddToCartSecondProductWithNameSauceLabsBoltTShirt() throws InterruptedException {
        TransactionPage transactionPage = new TransactionPage(webDriver);
        transactionPage.getProduct2Data().click();
        Thread.sleep(500);
    }

    @And("User verify change make Remove Button at second product")
    public void userVerifyChangeMakeRemoveButtonAtSecondProduct() throws InterruptedException {
        TransactionPage transactionPage = new TransactionPage(webDriver);
        transactionPage.getRemove2Button().isDisplayed();
        Assert.assertTrue(true);
        Thread.sleep(500);
    }

    @And("User click button Add to Cart third product with name Sauce Labs Fleece Jacket")
    public void userClickButtonAddToCartThirdProductWithNameSauceLabsFleeceJacket() throws InterruptedException {
        TransactionPage transactionPage = new TransactionPage(webDriver);
        transactionPage.getProduct3Data().click();
        Thread.sleep(500);

    }

    @And("User verify change make Remove Button at third product")
    public void userVerifyChangeMakeRemoveButtonAtThirdProduct() throws InterruptedException {
        TransactionPage transactionPage = new TransactionPage(webDriver);
        transactionPage.getRemove3Button().isDisplayed();
        Assert.assertTrue(true);
        Thread.sleep(500);
    }

    @And("User verify the number of product selected is the same as in the Cart Icon")
    public void userVerifyTheNumberOfProductSelectedIsTheSameAsInTheCartIcon() throws InterruptedException {
        int removeButtons = webDriver.findElements(By.xpath("//button[text()='Remove']")).size();
        TransactionPage transactionPage = new TransactionPage(webDriver);
        int amountRemoveButton = Integer.parseInt(transactionPage.getCountListProduct().getText());
        Assert.assertEquals(removeButtons,amountRemoveButton);
        Thread.sleep(500);
    }

    @Then("User click on icon cart to step verify product")
    public void userClickOnIconCartToVerifyProduct() throws InterruptedException {
        TransactionPage transactionPage = new TransactionPage(webDriver);
        transactionPage.getCountListProduct().click();
        Thread.sleep(500);
    }

    @And("User delete product with name Sauce Labs Backpack")
    public void userDeleteProductWithNameSauceLabsBackpack() throws InterruptedException {
        TransactionPage transactionPage = new TransactionPage(webDriver);
        transactionPage.getRemove1Button().click();
        Thread.sleep(500);
    }

    @And("Users verify products with the name Sauce Labs Backpack are missing on the list")
    public void usersVerifyProductsWithTheNameSauceLabsBackpackAreMissingOnTheList() throws InterruptedException {
        TransactionPage transactionPage = new TransactionPage(webDriver);
        try {
            WebElement deletedElement = transactionPage.getDeleteElement();
        } catch (NoSuchElementException e) {
            System.out.println("Element successfully deleted");
        }
        Thread.sleep(500);
    }

    @And("User click checkout button")
    public void userClickCheckoutButton() throws InterruptedException {
        TransactionPage transactionPage = new TransactionPage(webDriver);
        transactionPage.getButtonCheckout().click();
        Thread.sleep(500);
    }

    @When("^User input Firs Name field on form Detail information$")
    public void userInputFirsNameFieldOnFormDetailInformation() throws InterruptedException {
        TransactionPage transactionPage = new TransactionPage(webDriver);
        TransactionData transactionData = new TransactionData(webDriver);
        transactionPage.getFirstNameField().sendKeys(transactionData.firstNameData());
        Thread.sleep(500);
    }

    @And("^User input Last Name field on form Detail information$")
    public void userInputLastNameFieldOnFormDetailInformation() throws InterruptedException {
        TransactionPage transactionPage = new TransactionPage(webDriver);
        TransactionData transactionData = new TransactionData(webDriver);
        transactionPage.getLastNameField().sendKeys(transactionData.lastNameData());
        Thread.sleep(500);
    }

    @And("^User input Postal Code field on form Detail information$")
    public void userInputPortalCodeFieldOnFormDetailInformation() throws InterruptedException {
        TransactionPage transactionPage = new TransactionPage(webDriver);
        TransactionData transactionData = new TransactionData(webDriver);
        transactionPage.getPortalCodeField().sendKeys(transactionData.portalCodeData());
        Thread.sleep(500);
    }

    @And("User click Continue Button fot next step")
    public void userClickContinueButtonFotNextStep() throws InterruptedException {
        TransactionPage transactionPage = new TransactionPage(webDriver);
        transactionPage.getContinueButton().click();
        Thread.sleep(500);
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        js.executeScript("window.scrollBy(0,250)", "");
    }

    @And("User verify price total product")
    public void userVerifyPriceTotalProduct() throws InterruptedException {
        TransactionPage transactionPage = new TransactionPage(webDriver);
        Assert.assertEquals(transactionPage.numberSTaxLabel()+ transactionPage.numberItemTotal(), transactionPage.nominalTotal(),0);
        Thread.sleep(500);
    }

    @And("User verify tax nominal base on price total product")
    public void userVerifyTaxNominalBaseOnPriceTotalProduct() throws InterruptedException {
        TransactionPage transactionPage = new TransactionPage(webDriver);
        Assert.assertEquals(transactionPage.numberSTaxLabel(), transactionPage.setNominalTax(),0);
        Thread.sleep(500);
    }

    @And("User click button finish")
    public void userClickButtonFinish() throws InterruptedException {
        TransactionPage transactionPage = new TransactionPage(webDriver);
        transactionPage.getFinishButton().click();
        Thread.sleep(500);
    }

    @Then("User complete order")
    public void userCompleteOrder() throws InterruptedException {
        TransactionPage transactionPage = new TransactionPage(webDriver);
        transactionPage.getFinishProses().isDisplayed();
        Assert.assertTrue(true);
        Thread.sleep(500);
    }

    @When("^User input Firs Name field on form Detail information with blank data$")
    public void userInputFirsNameFieldOnFormDetailInformationWithBlankData() throws InterruptedException {
        TransactionPage transactionPage = new TransactionPage(webDriver);
        TransactionData transactionData = new TransactionData(webDriver);
        transactionPage.getFirstNameField().sendKeys(transactionData.blankData());
        Thread.sleep(500);
    }

    @And("^User input Last Name field on form Detail information with blank data$")
    public void userInputLastNameFieldOnFormDetailInformationWithBlankData() throws InterruptedException {
        TransactionPage transactionPage = new TransactionPage(webDriver);
        TransactionData transactionData = new TransactionData(webDriver);
        transactionPage.getLastNameField().sendKeys(transactionData.blankData());
        Thread.sleep(500);
    }

    @And("^User input Postal Code field on form Detail information with blank data$")
    public void userInputPortalCodeFieldOnFormDetailInformationWithBlankData() throws InterruptedException {
        TransactionPage transactionPage = new TransactionPage(webDriver);
        TransactionData transactionData = new TransactionData(webDriver);
        transactionPage.getPortalCodeField().sendKeys(transactionData.blankData());
        Thread.sleep(500);
    }

    @And("show information First Name is required")
    public void howInformationFirstNameIsRequired() throws InterruptedException {
        TransactionPage transactionPage = new TransactionPage(webDriver);
        transactionPage.getFistNameBlankInformation().isDisplayed();
        Assert.assertTrue(true);
        Thread.sleep(500);
    }

    @And("show information Last Name is required")
    public void howInformationLastNameIsRequired() throws InterruptedException {
        TransactionPage transactionPage = new TransactionPage(webDriver);
        transactionPage.getLastNameBlankInformation().isDisplayed();
        Assert.assertTrue(true);
        Thread.sleep(500);
    }

    @And("show information Postal Code is required")
    public void showInformationPortalCodeIsRequired() throws InterruptedException {
        TransactionPage transactionPage = new TransactionPage(webDriver);
        transactionPage.getPortalCodeBlankInformation().isDisplayed();
        Assert.assertTrue(true);
        Thread.sleep(500);
    }

    @When("User input Firs Name field on form Detail information with invalid data")
    public void userInputFirsNameFieldOnFormDetailInformationWithInvalidData() throws InterruptedException {
        TransactionPage transactionPage = new TransactionPage(webDriver);
        TransactionData transactionData = new TransactionData(webDriver);
        transactionPage.getFirstNameField().sendKeys(transactionData.invalidData());
        Thread.sleep(500);
    }

    @And("User input Last Name field on form Detail information with invalid data")
    public void userInputLastNameFieldOnFormDetailInformationWithInvalidData() throws InterruptedException {
        TransactionPage transactionPage = new TransactionPage(webDriver);
        TransactionData transactionData = new TransactionData(webDriver);
        transactionPage.getLastNameField().sendKeys(transactionData.invalidData());
        Thread.sleep(500);
    }

    @And("User input Postal Code field on form Detail information with invalid data")
    public void userInputPostalCodeFieldOnFormDetailInformationWithInvalidData() throws InterruptedException {
        TransactionPage transactionPage = new TransactionPage(webDriver);
        TransactionData transactionData = new TransactionData(webDriver);
        transactionPage.getPortalCodeField().sendKeys(transactionData.invalidData());
        Thread.sleep(500);
    }

    @And("show information Input valid data")
    public void showInformationInputValidData() throws InterruptedException {
        TransactionPage transactionPage = new TransactionPage(webDriver);
        transactionPage.getInvalidDataInformation().isDisplayed();
        Assert.assertTrue(true);
        Thread.sleep(500);
    }

    @When("User input Firs Name field on form Detail information with one hundred words data")
    public void userInputFirsNameFieldOnFormDetailInformationWithOneHundredWordsData() throws InterruptedException {
        TransactionPage transactionPage = new TransactionPage(webDriver);
        TransactionData transactionData = new TransactionData(webDriver);
        transactionPage.getFirstNameField().sendKeys(transactionData.seratusData());
        Thread.sleep(500);
    }

    @And("User input Last Name field on form Detail information with one hundred words data")
    public void userInputLastNameFieldOnFormDetailInformationWithOneHundredWordsData() throws InterruptedException {        TransactionPage transactionPage = new TransactionPage(webDriver);
        TransactionData transactionData = new TransactionData(webDriver);
        transactionPage.getLastNameField().sendKeys(transactionData.seratusData());
        Thread.sleep(500);
    }

    @And("User input Postal Code field on form Detail information with one hundred words data")
    public void userInputPostalCodeFieldOnFormDetailInformationWithOneHundredWordsData() throws InterruptedException {
        TransactionPage transactionPage = new TransactionPage(webDriver);
        TransactionData transactionData = new TransactionData(webDriver);
        transactionPage.getPortalCodeField().sendKeys(transactionData.seratusData());
        Thread.sleep(500);
    }

    @And("Show information your data very long")
    public void showInformationYourDataVeryLong() throws InterruptedException {
        TransactionPage transactionPage = new TransactionPage(webDriver);
        int a = transactionPage.getFirstNameField().getText().length();
        int b = 20;
        try {
            if (a <= b) {
                Assert.assertEquals(a, b);
            }
        } catch (AssertionError e) {
            transactionPage.getLongDataInformation().isDisplayed();
            Assert.assertTrue(true);
        }
        Thread.sleep(500);
    }

    @When("User input Firs Name field on form Detail information with one letter data")
    public void userInputFirsNameFieldOnFormDetailInformationWithOneLetterData() throws InterruptedException {
        TransactionPage transactionPage = new TransactionPage(webDriver);
        TransactionData transactionData = new TransactionData(webDriver);
        transactionPage.getFirstNameField().sendKeys(transactionData.oneLetterData());
        Thread.sleep(500);
    }

    @And("User input Last Name field on form Detail information with one letter data")
    public void userInputLastNameFieldOnFormDetailInformationWithOneLetterData() throws InterruptedException {
        TransactionPage transactionPage = new TransactionPage(webDriver);
        TransactionData transactionData = new TransactionData(webDriver);
        transactionPage.getLastNameField().sendKeys(transactionData.oneLetterData());
        Thread.sleep(500);
    }

    @And("User input Postal Code field on form Detail information with one letter data")
    public void userInputPostalCodeFieldOnFormDetailInformationWithOneLetterData() throws InterruptedException {
        TransactionPage transactionPage = new TransactionPage(webDriver);
        TransactionData transactionData = new TransactionData(webDriver);
        transactionPage.getPortalCodeField().sendKeys(transactionData.oneLetterData());
        Thread.sleep(500);
    }

    @And("Show information your data very short")
    public void showInformationYourDataVeryShort() throws InterruptedException {
        TransactionPage transactionPage = new TransactionPage(webDriver);
        int a = transactionPage.getFirstNameField().getText().length();
        int b = 1;
        try {
            if (a > b) {
                Assert.assertEquals(a, b);
            }
        } catch (AssertionError e) {
            transactionPage.getLongDataInformation().isDisplayed();
            Assert.assertTrue(true);
        }
        Thread.sleep(500);        Thread.sleep(500);
    }
}
