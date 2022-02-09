package com.expedia.pages;


import com.expedia.utils.Common;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static com.expedia.base.Hooks.driver;

public class HomePage {

    //main tabs
    @FindBy(xpath = "//*[@id=\"wizardMainRegionV2\"]/div/div/div/div/ul")
    private List<WebElement> mainTabs;

    //flights elements
    @FindBy(xpath = "//*[@id=\"wizardMainRegionV2\"]/div/div/div/div/ul/li[2]/a/span")
    private WebElement flightsButton;

    @FindBy(xpath = "//*[@id=\"uitk-tabs-button-container\"]/div[1]/li[2]/a")
    private WebElement oneWayTripButton;

    @FindBy(xpath = "//*[@id=\"location-field-leg1-origin\"]")
    private WebElement leavingLocation;

    @FindBy(xpath = "//*[@id=\"location-field-leg1-origin-menu\"]/div[1]/button")
    private WebElement leavingButton;

    @FindBy(xpath = "//*[@id=\"location-field-leg1-destination\"]")
    private WebElement goingLocation;

    @FindBy(xpath = "//*[@id=\"location-field-leg1-destination-menu\"]/div[1]/button")
    private WebElement goingButton;

    //date picker
    @FindBy(css = "button[data-stid='open-date-picker']")
    private WebElement departingDateButton;

    @FindBy(css = "div.uitk-date-picker-menu-months-container")
    private WebElement deparDatePickerTable;

    @FindBy(css = "button[data-stid='apply-date-picker']")
    private WebElement datePickDoneButton;

    //search button
    @FindBy(xpath = "//*[@id=\"wizard-flight-pwa-1\"]/div[3]/div[2]/button")
    private WebElement searchBUtton;


    //constructor
    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    //getters
    public List<WebElement> getMainTabs() {
        return mainTabs;
    }

    public WebElement getFlightsButton() {
        return flightsButton;
    }

    public WebElement getOneWayTripButton() {
        return oneWayTripButton;
    }

    public WebElement getSearchBUtton() {
        return searchBUtton;
    }

    public WebElement getLeavingLocation() {
        return leavingLocation;
    }

    public WebElement getGoingLocation() {
        return goingLocation;
    }

    public WebElement getLeavingButton() {
        return leavingButton;
    }

    public WebElement getGoingButton() {
        return goingButton;
    }

    public WebElement getDepartingDateButton() {
        return departingDateButton;
    }

    public WebElement getDeparDatePickerTable() {
        return deparDatePickerTable;
    }

    public WebElement getDatePickDoneButton() {
        return datePickDoneButton;
    }

    //functions
    public boolean siteIsLoaded() throws InterruptedException {
        Thread.sleep(1000);
        return (driver.getTitle().equals("Expedia Travel: Vacation Homes, Hotels, Car Rentals, Flights & More"));
    }

    //main tabs are all displayed
    public boolean mainTabsAreDisp(){
        for (WebElement el : getMainTabs()){
            return el.isDisplayed();
        }
        return false;
    }

    //clicks
    public void clickFlightsButton(){
        getFlightsButton().click();
        Common.waitUntilVisible(getLeavingButton());
    }
    public void clickSearchButton(){
        getSearchBUtton().click();
    }

    public void clickOneWayTrip(){
        getOneWayTripButton().click();
        Common.waitUntilVisible(getLeavingButton());
    }


    //Set Leaving And Going Location and search
    public void setUptheLocations() throws InterruptedException {
        getLeavingButton().click();
        Common.waitUntilVisible(getLeavingLocation());
        getLeavingLocation().sendKeys("SNA");
        getLeavingLocation().sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        getGoingButton().click();
        Common.waitUntilVisible(getGoingLocation());
        getGoingLocation().sendKeys("Chicago");
        getGoingLocation().sendKeys(Keys.ENTER);

    }

    // find the input date in table
    public void datePickerSelect(String date){
        List<WebElement> columns = getDeparDatePickerTable().findElements(By.tagName("button"));
        for (WebElement target : columns){
            String attribute = target.getAttribute("aria-label");
            if (attribute.equals(date)){
                target.click();
            }

        }

    }
}



