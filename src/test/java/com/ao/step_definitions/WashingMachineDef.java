package com.ao.step_definitions;

import com.ao.pages.BasePage;
import com.ao.pages.BoschMachinesPage;
import com.ao.pages.SilverBoschMachinesPage;
import com.ao.pages.WashingMachinesPage;
import com.ao.utilities.ConfigurationReader;
import com.ao.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

public class WashingMachineDef {

    BasePage basePage = new BasePage();
    JavascriptExecutor js = (JavascriptExecutor) Driver.get();
    WashingMachinesPage washingMachinesPage = new WashingMachinesPage();
    BoschMachinesPage boschPage = new BoschMachinesPage();
    SilverBoschMachinesPage silverBoschMachinesPage = new SilverBoschMachinesPage();

    @Given("As a user navigates to the web page.")
    public void as_a_user_navigates_to_the_web_page() throws InterruptedException {

        //Navigates to https://ao.com/
        Driver.get().get(ConfigurationReader.get("url"));

        //We need Thread.sleep() to overcome the cookies. The other waiting methods doesn't work.
        Thread.sleep(2000);

        // There are two types of cookies we have to deal. Each time a different one is appearing.
        if (basePage.acceptClose.isDisplayed()) {
            //Clicking 'Accept & close' on the top of the page to accept cookies policisies.
            basePage.acceptClose.click();
        } else {
            //Clicking 'Accept All' on the bottom of the page to accept cookies policy.
            basePage.acceptAll.click();
        }
    }

    @When("Searches for Washing Machines.")
    public void searches_for_washing_machines() {

        //Searches for “Washing Machines”
        basePage.searchBox.sendKeys("Washing Machines" + Keys.ENTER);

    }

    @When("Click on Bosch brand.")
    public void click_On_Bosch_Brand() {

        //Scroll down to Bosh brand.
        js.executeScript("arguments[0].scrollIntoView();", washingMachinesPage.Bosch);

        // Selects Bosh brand to be navigated to a lister page
        washingMachinesPage.Bosch.click();
    }


    @When("Selects colour of silver.")
    public void selects_colour_of_silver() {

        //Scroll down to to click on 'Silver' colour.
        js.executeScript("window.scrollBy(0,250)");

        //Selects “Colour” of “Silver”
        boschPage.colourSilver.click();

    }


    @Then("Verify the results are successfully filtered silver colour Bosch Washing Machines.")
    public void verify_the_results_are_successfully_filtered_silver_colour_Bosch_Washing_Machines() {

        //Getting actual result of the listed machine from web page.
        String actualResult = silverBoschMachinesPage.silverText.getText();

        // Expected result.
        String expectedResult = "osch Serie 6 WAT2840SGB 9Kg Washing Machine with 1400 rpm - Silver - A+++ Rated";

        //Verify the results are successfully filtered based on your selection criteria
        Assert.assertEquals("Expected to list Silver colour Bosch Washing Machines but not successful.", expectedResult, actualResult);

    }

}
