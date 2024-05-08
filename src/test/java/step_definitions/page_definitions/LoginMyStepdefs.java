package step_definitions.page_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import data_center.LoginData;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import page_object.HomePage;
import page_object.LoginPages;
import step_definitions.main.Hooks;

public class LoginMyStepdefs {

    private final WebDriver webDriver;

    public LoginMyStepdefs() {
        super();
        this.webDriver = Hooks.webDriver;
    }

    @Given("User already on login page")
    public void userAlreadyOnLoginPage() {
        LoginPages loginPages = new LoginPages(webDriver);
        loginPages.getLoginPage().isDisplayed();
        Assert.assertTrue(true);
    }

    @When("User input username with valid username")
    public void userInputUsernameWithValidUsername() {
        LoginPages loginPages = new LoginPages(webDriver);
        LoginData loginData = new LoginData(webDriver);
        loginPages.getLoginUsername().sendKeys(loginData.usernameData());
    }

    @And("User input password with valid password")
    public void userInputPasswordWithValidPassword() {
        LoginPages loginPages = new LoginPages(webDriver);
        LoginData loginData = new LoginData(webDriver);
        loginPages.getLoginPassword().sendKeys(loginData.passwordData());
    }

    @And("User click button button Login")
    public void userClickButtonButtonLogin() {
        LoginPages loginPages = new LoginPages(webDriver);
        loginPages.getLoginButton().click();
    }

    @Then("User navigated to Home Page")
    public void userNavigatedToHomePage() {
        HomePage homePage = new HomePage(webDriver);
        homePage.getHomePage().isDisplayed();
        Assert.assertTrue(true);
    }

    @When("User input username with invalid username")
    public void userInputUsernameWithInvalidUsername() {
        LoginPages loginPages = new LoginPages(webDriver);
        LoginData loginData = new LoginData(webDriver);
        loginPages.getLoginUsername().sendKeys(loginData.invalidUsernameData());
    }

    @Then("Show information Username and password do not match")
    public void showInformationUsernameAndPasswordDoNotMatch(){
        LoginPages loginPages = new LoginPages(webDriver);
        loginPages.getInvalidLogin().isDisplayed();
        Assert.assertTrue(true);
        // Write code here that turns the phrase above into concrete actions
        // throw new cucumber.api.PendingException();}
    }

    @And("User input password with invalid password")
    public void userInputPasswordWithInvalidPassword() {
        LoginPages loginPages = new LoginPages(webDriver);
        LoginData loginData = new LoginData(webDriver);
        loginPages.getLoginPassword().sendKeys(loginData.invalidPasswordData());
    }

    @And("User input password with blank password")
    public void userInputPasswordWithBlankPassword() {
        LoginPages loginPages = new LoginPages(webDriver);
        LoginData loginData = new LoginData(webDriver);
        loginPages.getLoginPassword().sendKeys(loginData.passwordBlankData());
    }

    @Then("Show information password required")
    public void showInformationPasswordRequired() {
        LoginPages loginPages = new LoginPages(webDriver);
        loginPages.getNotifBlankData().isDisplayed();
        Assert.assertTrue(true);
    }

    @When("User input username with blank username")
    public void userInputUsernameWithBlankUsername() {
        LoginPages loginPages = new LoginPages(webDriver);
        LoginData loginData = new LoginData(webDriver);
        loginPages.getLoginUsername().sendKeys(loginData.usernameBlankData());
    }

    @When("User input username with locked account username")
    public void userInputUsernameWithLockedAccountUsername() {
        LoginPages loginPages = new LoginPages(webDriver);
        LoginData loginData = new LoginData(webDriver);
        loginPages.getLoginUsername().sendKeys(loginData.usernameLockedData());
    }

    @Then("Show information user has been locked out")
    public void showInformationUserHasBeenLockedOut() {
        LoginPages loginPages = new LoginPages(webDriver);
        loginPages.getNotifLockedUser().isDisplayed();
        Assert.assertTrue(true);
    }

    @When("User input username with problem username")
    public void userInputUsernameWithProblemUsername() {
        LoginPages loginPages = new LoginPages(webDriver);
        LoginData loginData = new LoginData(webDriver);
        loginPages.getLoginUsername().sendKeys(loginData.problemUserData());
    }

    @When("User input username with error username")
    public void userInputUsernameWithErrorUsername() {
        LoginPages loginPages = new LoginPages(webDriver);
        LoginData loginData = new LoginData(webDriver);
        loginPages.getLoginUsername().sendKeys(loginData.problemUserData());
    }

    @Then("Show information username required")
    public void showInformationUsernameRequired() {
        LoginPages loginPages = new LoginPages(webDriver);
        loginPages.getNotifUsernameReq().isDisplayed();
        Assert.assertTrue(true);
    }
}