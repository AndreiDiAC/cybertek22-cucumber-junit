package com.cybertek.pages.Homeworks;

import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class smartBear1Page {

    public smartBear1Page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (name = "ctl00$MainContent$username")
    public WebElement username;

    @FindBy(name = "ctl00$MainContent$password")
    public WebElement password;

    @FindBy(name = "ctl00$MainContent$login_button")
    public WebElement loginButton;

    public void setLogin(){
        Driver.getDriver().get(ConfigurationReader.getProperty("smartBearUrl"));
        username.sendKeys(ConfigurationReader.getProperty("usernameSmartBear"));
        password.sendKeys(ConfigurationReader.getProperty("passwordSmartBear"));
        loginButton.click();
    }

    @FindBy ( xpath = "//a[.='Order']")
    public WebElement orderFeature;

    @FindBy (linkText = "Order")
    public WebElement orderHeader;

    @FindBy (name = "ctl00$MainContent$fmwOrder$ddlProduct")
    public WebElement product;

    @FindBy (name = "ctl00$MainContent$fmwOrder$txtQuantity")
    public WebElement quantity;

    @FindBy (name = "ctl00$MainContent$fmwOrder$txtName")
    public WebElement customerName;

    @FindBy (name = "ctl00$MainContent$fmwOrder$TextBox2")
    public WebElement streetName;

    @FindBy(name = "ctl00$MainContent$fmwOrder$TextBox3")
    public WebElement city;

    @FindBy(name = "ctl00$MainContent$fmwOrder$TextBox4")
    public WebElement state;

    @FindBy(name = "ctl00$MainContent$fmwOrder$TextBox5")
    public WebElement zipCode;

    @FindBy(xpath = "//label[.='MasterCard']")
    public WebElement mastercard;

    @FindBy(xpath = "//label[.='Visa']")
    public WebElement visa;

    @FindBy(xpath = "//label[.='American Express']")
    public WebElement AmericanExpress;

    @FindBy (name = "ctl00$MainContent$fmwOrder$TextBox6")
    public WebElement cardNumber;

    @FindBy (name = "ctl00$MainContent$fmwOrder$TextBox1")
    public WebElement expirationDate;

    @FindBy(id = "ctl00_MainContent_fmwOrder_InsertButton")
    public WebElement processButton;

    @FindBy(xpath = "//a[.='View all orders']")
    public WebElement viewOrder;

    @FindBy(xpath = "//div/table/tbody/tr")
    public List<WebElement> table;




}
