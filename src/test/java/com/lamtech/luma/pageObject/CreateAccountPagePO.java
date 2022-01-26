package com.lamtech.luma.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccountPagePO {

    //Element locator
    @FindBy(id = "firstname")
    public static WebElement firstnameField;

    @FindBy(id = "lastname")
    public static WebElement lastnameField;

    @FindBy(name = "email")
    public static WebElement emailField;

    @FindBy(name = "password")
    public static WebElement passwordField;

    @FindBy(id = "password-confirmation")
    public static WebElement confirmPasswordField;






    //Initialise Element using selenium webdriver
    public CreateAccountPagePO(WebDriver driver){
        PageFactory.initElements(driver, this);
    }


    //page specific methods
    public void enterFirstName(String FirstName){
        firstnameField.sendKeys(FirstName);
    }

    public void enterLastName(String LastName){
        lastnameField.sendKeys(LastName);
    }














}
