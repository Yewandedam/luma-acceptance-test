package com.lamtech.luma.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePagePO {

    //Element locator
    @FindBy(linkText = "Create an Account")
    public static WebElement createAccountLink;
    @FindBy(linkText = "Sign In")
    public static WebElement signInLink;

    //Initialise Element using selenium webdriver
    public HomePagePO(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    //page specific methods
    public void clickCreateAccountLink(){
        createAccountLink.click();
    }


    public void clickSignInLink(){
        signInLink.click();
    }
}
