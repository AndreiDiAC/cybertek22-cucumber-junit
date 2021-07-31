package com.cybertek.step_definitions;

import com.cybertek.pages.amazonPage;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import com.cybertek.utilities.OfficeHoursUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonSearchStepDefs {
    amazonPage amazon;
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
    String priceText;
    Select selectQuantity;

    @Given("User is on the Amazon Home Page")
    public void user_is_on_the_amazon_home_page() {

        Driver.getDriver().get("https://www.amazon.com");
        BrowserUtils.sleep(1);
    }


    @When("User search for hats for man")
    public void user_search_for_hats_for_man() {
        amazon = new amazonPage();
        amazon.searchBox.sendKeys("hats for man" + Keys.ENTER);
    }
    @When("User adds the first hat appearing to the cart with quantity two")
    public void user_adds_the_first_hat_appearing_to_the_cart_with_quantity_two() {

        wait.until(ExpectedConditions.elementToBeClickable(amazon.firstHat));
        amazon.firstHat.click();
        double singlePriceforHat = OfficeHoursUtils.priceConverter(priceText);
        selectQuantity = new Select(amazon.quantityDropDown);
        selectQuantity.selectByVisibleText("2");
        amazon.addToCart.click();
    }
    @Then("The total price and quantity should be correct")
    public void the_total_price_and_quantity_should_be_correct() {
        amazon.cart.click();
        Assert.assertTrue(amazon.subTotalText.getText().contains("2 items"));

    }
    @When("User reduce the quantity from two to one")
    public void user_reduce_the_quantity_from_two_to_one() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("total price and quantity has been correctly changed")
    public void total_price_and_quantity_has_been_correctly_changed() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
