package com.cybertek.utilities;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class BrowserUtils {
    /*
    Method that will accept int
    Wait for given second duration
     */

    //1sec = 1000 milli seconds
    //1 * 1000 = 1000


    public static void sleep(int second)  {
        second *= 1000;

        try {
            Thread.sleep(second);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static List<String> getElementText(List<WebElement> webElementsList){
        List<String> actualAsString = new ArrayList<>();

        for (WebElement element : webElementsList) {
            actualAsString.add(element.getText());
        }

        return actualAsString;

    }


    public void assertTitle(String expectedTitle){
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(expectedTitle,actualTitle);
    }

}
