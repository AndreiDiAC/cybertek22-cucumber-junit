package com.cybertek.step_definitions.Homeworks;

import com.cybertek.pages.Homeworks.smartBear1Page;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SmartBear1_stepDef {
    smartBear1Page smartBear1Page = new smartBear1Page();




    @Given("User is on the SmartBearSoftware landing page")
    public void user_is_on_the_smart_bear_software_landing_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("smartBearUrl"));
    }


    @When("User log in into the WebOrder page with name {string} and password {string}")
    public void user_log_in_into_the_web_order_page_with_name_and_password(String string, String string2) {
        smartBear1Page.username.sendKeys(string);
        smartBear1Page.password.sendKeys(string2);
        smartBear1Page.loginButton.click();
    }
    @When("User go to the Order feature")
    public void user_go_to_the_order_feature() {
        smartBear1Page.orderFeature.click();
    }
    @Then("User should see Order header")
    public void user_should_see_order_header() {
        String expectedHeader = "Order";
        String actualHeader = smartBear1Page.orderHeader.getText();
        Assert.assertEquals(expectedHeader,actualHeader);
    }


    @Then("User selects {string} from product dropdown")
    public void user_selects_from_product_dropdown(String string) {
        Select select = new Select(smartBear1Page.product);
        select.selectByVisibleText(string);
    }


    @Then("User enters {int} to quantity")
    public void user_enters_to_quantity(Integer int1) {
        smartBear1Page.quantity.sendKeys(String.valueOf(int1));
    }

    @Then("User enters {string} to costumer name")
    public void user_enters_to_costumer_name(String string) {
        smartBear1Page.customerName.sendKeys(string);
            }

    @Then("User enters {string} to street")
    public void user_enters_to_street(String string) {
        smartBear1Page.streetName.sendKeys(string);
            }
    @Then("User enters {string} to city")
    public void user_enters_to_city(String string) {
        smartBear1Page.city.sendKeys(string);
            }
    @Then("User enters {string} to state")
    public void user_enters_to_state(String string) {
        smartBear1Page.state.sendKeys(string);
            }

    @Then("User enters {int}")
    public void user_enters(Integer int1) {
        smartBear1Page.zipCode.sendKeys(String.valueOf(int1));
            }
    @Then("User selects {string} as card type")
    public void user_selects_as_card_type(String string) {
        if(string.equalsIgnoreCase("Visa")){
            smartBear1Page.visa.click();
        }else if(string.equalsIgnoreCase("American Express")){
            smartBear1Page.AmericanExpress.click();
        }else if(string.equalsIgnoreCase("MasterCard")){
            smartBear1Page.mastercard.click();
        }else {
            System.out.println("Invalid type of card input!");
        }
            }
    @Then("User enters {string} to card number")
    public void user_enters_to_card_number(String string) {
        smartBear1Page.cardNumber.sendKeys(string);
            }
    @Then("User enters {string} to expiration date")
    public void user_enters_to_expiration_date(String string) {
        smartBear1Page.expirationDate.sendKeys(string);
            }
    @Then("User clicks process button")
    public void user_clicks_process_button() {
        smartBear1Page.processButton.click();
            }
    @Then("User verifies {string} is in the list")
    public void user_verifies_is_in_the_list(String string) {
        smartBear1Page.viewOrder.click();
        boolean result = false;

        List<WebElement> list = Driver.getDriver().findElements(By.xpath("//div/table/tbody/tr"));
        for(WebElement each: list){
            if (each.getText().contains(string)){
                result = true;
            }
        }

        Assert.assertTrue(result);
            }

}
