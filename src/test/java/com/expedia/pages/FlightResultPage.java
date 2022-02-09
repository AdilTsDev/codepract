package com.expedia.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static com.expedia.base.Hooks.driver;

public class FlightResultPage {
    //main search results container
    @FindBy(xpath = "//*[@id=\"app-layer-base\"]/div[2]/div[3]/div[1]/section/main")
    private WebElement mainResultSection;

    public FlightResultPage(){
        PageFactory.initElements(driver, this);
    }


    public WebElement getMainResultSection() {
        return mainResultSection;
    }

}
