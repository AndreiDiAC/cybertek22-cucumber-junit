package com.cybertek.step_definitions;

import com.cybertek.utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    //Import from io.cucumber.java not from junit
    @Before (value = "@wip", order = 1)
    public void setupScenario(){
        System.out.println("--Setting up browser with further details...");

    }




    @After()
    public void tearDownScenario(Scenario scenario){

        //if my scenario fails, take a screenshot
        // if scenario fails : return true
        if(scenario.isFailed()){
            byte [] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png",scenario.getName());
        }


        System.out.println("--Teardown steps are being applied...");
        Driver.closeDriver();

    }






    @BeforeStep (value = "@wip", order = 1)
    public void setupStep(){
        System.out.println("--setup applying for each step");
    }

    @AfterStep (value = "@wip", order = 1)
    public void afterStep(){
        System.out.println("--teardown applying for each step");
    }
}
