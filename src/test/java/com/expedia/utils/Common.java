package com.expedia.utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static com.expedia.base.Hooks.driver;

public class Common {
    public static void waitUntilVisible(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOf(element));
    }
}
