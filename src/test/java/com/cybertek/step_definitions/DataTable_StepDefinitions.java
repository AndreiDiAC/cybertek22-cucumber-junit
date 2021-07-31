package com.cybertek.step_definitions;


import com.cybertek.pages.DropdownPage;
import com.cybertek.pages.LibraryLoginPage;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Map;

public class DataTable_StepDefinitions {

    LibraryLoginPage loginPage = new LibraryLoginPage();
    DropdownPage dropdownPage = new DropdownPage();

    @Then("user should see below words displayed")
    public void user_should_see_below_words_displayed(List<String> listOfFruits) {
        System.out.println("listOfFruits.size() = " + listOfFruits.size());
        System.out.println(listOfFruits);
    }



    @Given("user is on the login page of library app")
    public void user_is_on_the_login_page_of_library_app() {
        String url = ConfigurationReader.getProperty("libraryUrl");
        Driver.getDriver().get(url);
    }

    @When("user enter username and password as below")
    public void user_enter_username_and_password_as_below(Map<String, String> loginInfo) {

        loginPage.emailInput.sendKeys(loginInfo.get("username"));
        loginPage.passwordInput.sendKeys(loginInfo.get("password"));

        loginPage.signIn.click();

    }


    @Then("user should see title is something")
    public void userShouldSeeTitleIsSomething() {

        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Library";

        Assert.assertTrue(actualTitle.contains(expectedTitle));
    }


    @Given("User is on the dropdowns page of practice tool")
    public void user_is_on_the_dropdowns_page_of_practice_tool() {
        Driver.getDriver().get("http://practice.cybertekschool.com/dropdown");
    }
    @Then("User should see below info in month dropdown")
    public void user_should_see_below_info_in_month_dropdown( List<String> expectedMonths) {

        Select select = new Select(dropdownPage.month);

        List<WebElement> actualMonthsAsWebElements = select.getOptions();

        Assert.assertEquals(expectedMonths, BrowserUtils.getElementText(actualMonthsAsWebElements));



//        List<String> actualMonthString = new ArrayList<>();
//
//        List<WebElement> actualMonths = select.getOptions();
//
//        for(WebElement each : actualMonths ){
//            actualMonthString.add(each.getText());
//        }
//
//        Assert.assertEquals(expectedMonths,actualMonthString);

    }



}


