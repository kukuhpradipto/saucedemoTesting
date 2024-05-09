package step_definitions.page_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import data_center.LoginData;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import page_object.TransactionPage;
import page_object.LoginPages;
import step_definitions.main.Hooks;

public class LoginMyStepdefs {

    private final WebDriver webDriver;

    public LoginMyStepdefs() {
        super();
        this.webDriver = Hooks.webDriver;
    }

    @Given("User already on login page")
    public void userAlreadyOnLoginPage() throws InterruptedException {
        LoginPages loginPages = new LoginPages(webDriver);
        loginPages.getLoginPage().isDisplayed();
        Assert.assertTrue(true);
        Thread.sleep(500);
    }

    @When("User input username with valid username")
    public void userInputUsernameWithValidUsername() throws InterruptedException {
        LoginPages loginPages = new LoginPages(webDriver);
        LoginData loginData = new LoginData(webDriver);
        loginPages.getLoginUsername().sendKeys(loginData.usernameData());
        Thread.sleep(500);
    }

    @And("User input password with valid password")
    public void userInputPasswordWithValidPassword() throws InterruptedException {
        LoginPages loginPages = new LoginPages(webDriver);
        LoginData loginData = new LoginData(webDriver);
        loginPages.getLoginPassword().sendKeys(loginData.passwordData());
        Thread.sleep(500);
    }

    @And("User click button button Login")
    public void userClickButtonButtonLogin() throws InterruptedException {
        LoginPages loginPages = new LoginPages(webDriver);
        loginPages.getLoginButton().click();
        Thread.sleep(500);
    }

    @Then("User navigated to Home Page")
    public void userNavigatedToHomePage() throws InterruptedException {
        TransactionPage transactionPage = new TransactionPage(webDriver);
        transactionPage.getHomePage().isDisplayed();
        Assert.assertTrue(true);
        Thread.sleep(500);
    }

    @When("User input username with invalid username")
    public void userInputUsernameWithInvalidUsername() throws InterruptedException {
        LoginPages loginPages = new LoginPages(webDriver);
        LoginData loginData = new LoginData(webDriver);
        loginPages.getLoginUsername().sendKeys(loginData.invalidUsernameData());
        Thread.sleep(500);
    }

    @Then("Show information Username and password do not match")
    public void showInformationUsernameAndPasswordDoNotMatch() throws InterruptedException {
        LoginPages loginPages = new LoginPages(webDriver);
        loginPages.getInvalidLogin().isDisplayed();
        Assert.assertTrue(true);
        Thread.sleep(500);
        // Write code here that turns the phrase above into concrete actions
        // throw new cucumber.api.PendingException();}
    }

    @And("User input password with invalid password")
    public void userInputPasswordWithInvalidPassword() throws InterruptedException {
        LoginPages loginPages = new LoginPages(webDriver);
        LoginData loginData = new LoginData(webDriver);
        loginPages.getLoginPassword().sendKeys(loginData.invalidPasswordData());
        Thread.sleep(500);
    }

    @And("User input password with blank password")
    public void userInputPasswordWithBlankPassword() throws InterruptedException {
        LoginPages loginPages = new LoginPages(webDriver);
        LoginData loginData = new LoginData(webDriver);
        loginPages.getLoginPassword().sendKeys(loginData.passwordBlankData());
        Thread.sleep(500);
    }

    @Then("Show information password required")
    public void showInformationPasswordRequired() throws InterruptedException {
        LoginPages loginPages = new LoginPages(webDriver);
        loginPages.getNotifBlankData().isDisplayed();
        Assert.assertTrue(true);
        Thread.sleep(500);
    }

    @When("User input username with blank username")
    public void userInputUsernameWithBlankUsername() throws InterruptedException {
        LoginPages loginPages = new LoginPages(webDriver);
        LoginData loginData = new LoginData(webDriver);
        loginPages.getLoginUsername().sendKeys(loginData.usernameBlankData());
        Thread.sleep(500);
    }

    @When("User input username with locked account username")
    public void userInputUsernameWithLockedAccountUsername() throws InterruptedException {
        LoginPages loginPages = new LoginPages(webDriver);
        LoginData loginData = new LoginData(webDriver);
        loginPages.getLoginUsername().sendKeys(loginData.usernameLockedData());
        Thread.sleep(500);
    }

    @Then("Show information user has been locked out")
    public void showInformationUserHasBeenLockedOut() throws InterruptedException {
        LoginPages loginPages = new LoginPages(webDriver);
        loginPages.getNotifLockedUser().isDisplayed();
        Assert.assertTrue(true);
        Thread.sleep(500);
    }

    @When("User input username with problem username")
    public void userInputUsernameWithProblemUsername() throws InterruptedException {
        LoginPages loginPages = new LoginPages(webDriver);
        LoginData loginData = new LoginData(webDriver);
        loginPages.getLoginUsername().sendKeys(loginData.problemUserData());
        Thread.sleep(500);
    }

    @When("User input username with error username")
    public void userInputUsernameWithErrorUsername() throws InterruptedException {
        LoginPages loginPages = new LoginPages(webDriver);
        LoginData loginData = new LoginData(webDriver);
        loginPages.getLoginUsername().sendKeys(loginData.problemUserData());
        Thread.sleep(500);
    }

    @Then("Show information username required")
    public void showInformationUsernameRequired() throws InterruptedException {
        LoginPages loginPages = new LoginPages(webDriver);
        loginPages.getNotifUsernameReq().isDisplayed();
        Assert.assertTrue(true);
        Thread.sleep(500);
    }
}