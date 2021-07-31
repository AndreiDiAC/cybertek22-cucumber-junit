package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DropdownPage {

    public DropdownPage(){
        PageFactory.initElements(Driver.getDriver(),this);  //initialize our driver with our object
    }

    @FindBy (id = "month")
    public WebElement month;



}
