package com.cybertek.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static java.lang.Thread.sleep;

public class BrowserUtilities {

    public static void wait(int seconds){

        try{
            Thread.sleep(1000 * seconds);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public static WebElement waitForVisibility(WebElement element, int seconds){

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), seconds);

        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static WebElement waitForClickability(WebElement element, int seconds){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), seconds);

        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }
}
