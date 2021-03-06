package com.lamtech.luma.stepDefinition;

import com.lamtech.luma.pageObject.CreateAccountPagePO;
import com.lamtech.luma.pageObject.HomePagePO;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AccountManagementSteps {
    WebDriver driver;

    @Given("I am on create an account page")
    public void iAmOnCreateAnAccountPage() {
        //Define Browser
        WebDriverManager.chromedriver().setup();
        //Open Browser
        driver = new ChromeDriver();
        //Maximize Browser Window
        driver.manage().window().maximize();
        //Launch Application
        driver.get("https://demo-m2.bird.eu/");
        //Click On Create An Account
        //driver.findElement(By.linkText("Create an Account")).click();
        HomePagePO homePagePO = new HomePagePO(driver);
        homePagePO.clickCreateAccountLink();

    }

    @When("I enter {string} {string} {string} {string} {string}")
    public void iEnter(String FirstName, String LastName, String Email, String Password, String ConfirmPassword) {
        //driver.findElement(By.id("firstname")).sendKeys(FirstName);
        CreateAccountPagePO createAccountPagePO = new CreateAccountPagePO(driver);
        createAccountPagePO.enterFirstName(FirstName);


       // driver.findElement(By.id("lastname")).sendKeys(LastName);
        createAccountPagePO.enterLastName(LastName);
        driver.findElement(By.name("email")).sendKeys(Email);
        driver.findElement(By.name("password")).sendKeys(Password);
        driver.findElement(By.id("password-confirmation")).sendKeys(ConfirmPassword);
    }

    @And("I click on create an account")
    public void iClickOnCreateAnAccount() {
        driver.findElement(By.cssSelector("#form-validate > div > div.primary > button > span")).click();

    }

    @Then("my account page is displayed")
    public void myAccountPageIsDisplayed() {
        String expectedPageTitle = "My Account";
        String actualPageTitle = driver.getTitle();
        Assert.assertEquals(expectedPageTitle,actualPageTitle);

    }

    @Given("I am on customer login page")
    public void iAmOnCustomerLoginPage() {
        //Define Browser
        WebDriverManager.chromedriver().setup();
        //Open Browser
        driver = new ChromeDriver();
        //Maximize Browser Window
        driver.manage().window().maximize();
        //Launch Application
        driver.get("https://magento2-demo.magebit.com/");
        //Click On Sign In
        driver.findElement(By.linkText("Sign In")).click();

    }

    @When("I enter {string} {string}")
    public void iEnter(String Email, String Password) {
        driver.findElement(By.id("email")).sendKeys(Email);
        driver.findElement(By.name("login[password]")).sendKeys(Password);
    }

    @And("I click on login")
    public void iClickOnLogin() {
        driver.findElement(By.cssSelector("#send2 > span")).click();
    }

    @Then("Account page is displayed")
    public void accountPageIsDisplayed() {
    }


    @Then("An error message should be displayed that email is already in use")
    public void anErrorMessageShouldBeDisplayedThatEmailIsAlreadyInUse() {
        String expectedAccountError = "There is already an account with this email address. If you are sure that it is your email address, click here to get your password and access your account.";
        //String actualAccountError = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div[2]/div/div/div")).getText();
        //Assert.assertEquals(expectedAccountError,actualAccountError);
    }

    @Then("An error message should be displayed that account sign in is incorrect")
    public void anErrorMessageShouldBeDisplayedThatAccountSignInIsIncorrect() {
    }
}
