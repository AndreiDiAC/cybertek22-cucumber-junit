package com.cybertek.step_definitions.Homeworks;

import com.cybertek.pages.Homeworks.smartBear1Page;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.PriorityQueue;
import java.util.Queue;

public class SmartBear2_stepDef {

    smartBear1Page smartBear = new smartBear1Page();

    @Given("User is logged into SmartBear Tester account and on Order page")
    public void user_is_logged_into_smart_bear_tester_account_and_on_order_page() {

        smartBear.setLogin();
        smartBear.orderFeature.click();

        Queue<String> asd = new PriorityQueue<>();
    }




    @Given("User selects {string} from product dropdown.")
    public void user_selects_from_product_dropdown(String string) {
        smartBear.product.sendKeys(string);
    }
    @Given("User enters {string} to quantity.")
    public void user_enters_to_quantity(String string) {
        smartBear.quantity.sendKeys(string);
    }
    @Given("User enters {string} to costumer name.")
    public void user_enters_to_costumer_name(String string) {
        smartBear.customerName.sendKeys(string);
    }
    @Given("User enters {string} to street.")
    public void user_enters_to_street(String string) {
        smartBear.streetName.sendKeys(string);
    }
    @Given("User enters {string} to city.")
    public void user_enters_to_city(String string) {
        smartBear.city.sendKeys(string);
    }
    @Given("User enters {string} to state.")
    public void user_enters_to_state(String string) {
        smartBear.state.sendKeys(string);
    }
    @Given("User enters {string}.")
    public void user_enters(String string) {
        smartBear.zipCode.sendKeys(string);
    }
    @Given("User selects {string} as card type.")
    public void user_selects_as_card_type(String string) {
        smartBear.visa.click();
    }
    @Given("User enters {string} to card number.")
    public void user_enters_to_card_number(String string) {
        smartBear.cardNumber.sendKeys(string);
    }
    @Given("User enters {string} to expiration date.")
    public void user_enters_to_expiration_date(String string) {
        smartBear.expirationDate.sendKeys(string);
    }
    @Given("User clicks process button.")
    public void user_clicks_process_button() {
        smartBear.processButton.click();
    }
    @Given("User verifies {string} is in the list.")
    public void user_verifies_is_in_the_list(String string) {
        smartBear.viewOrder.click();
        boolean result = false;


        for(WebElement each: smartBear.table){
            if (each.getText().contains(string)){
                result = true;
            }
        }

        Assert.assertTrue(result);
    }


}
