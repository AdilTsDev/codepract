package com.expedia.steps;

import com.expedia.pages.FlightResultPage;
import com.expedia.pages.HomePage;
import com.expedia.utils.Common;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class SmokeTestSteps {

    // website loading
    @When("home page is loaded")
    public void homePageIsLoaded() throws InterruptedException {
        HomePage homePage = new HomePage();
        Assert.assertTrue(homePage.siteIsLoaded());
    }
    @Then("verify that all the tabs are loaded")
    public void verifyThatAllTheTabsAreLoaded() {
        HomePage homePage = new HomePage();
        Assert.assertTrue(homePage.mainTabsAreDisp());
    }

    //round trip search steps
    @And("click the flights at main tabs")
    public void clickTheFlightsAtMainTabs() throws InterruptedException {
        HomePage homePage = new HomePage();
        homePage.clickFlightsButton();
    }

    @And("set up the locations")
    public void setUpTheLocations() throws InterruptedException {
        HomePage homePage = new HomePage();
        homePage.setUptheLocations();
    }

    @And("click search button")
    public void clickSearchButton() {
        HomePage homePage = new HomePage();
        homePage.getSearchBUtton().click();
    }

    @Then("verify that available results are displayed")
    public void verifyThatAvailableResultsAreDisplayed() {
        FlightResultPage flightResultPage = new FlightResultPage();
        Common.waitUntilVisible(flightResultPage.getMainResultSection());
        Assert.assertTrue(flightResultPage.getMainResultSection().isDisplayed());
    }


    //one way trip steps
    @And("click one-way trip")
    public void clickOneWayTrip() {
        HomePage homePage = new HomePage();
        homePage.clickOneWayTrip();
    }

    @And("check flight for date {string}")
    public void checkFlightForDate(String date) {
        HomePage homePage = new HomePage();
        homePage.getDepartingDateButton().click();
        Common.waitUntilVisible(homePage.getDeparDatePickerTable());
        homePage.datePickerSelect(date);
        homePage.getDatePickDoneButton().click();


    }

}
