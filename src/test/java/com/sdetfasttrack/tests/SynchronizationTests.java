package com.sdetfasttrack.tests;

import com.sdetfasttrack.pages.SynchronizationPage;
import com.sdetfasttrack.utilities.Driver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class SynchronizationTests {

    SynchronizationPage synchronizationPage = new SynchronizationPage(); //Object of the page

    @Test
    public void SynchronizationTest1(){
        //TC#1
        //1. Go to http://practice.cydeo.com/dynamic_loading/1
        Driver.getDriver().get("http://practice.cydeo.com/dynamic_loading/1");

        //2. Click to start
        synchronizationPage.startBtn.click();

        //3. Wait until loading bar disappears
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOf(synchronizationPage.username)); //explicit wait

        //4. Assert username inputbox is displayed
        //5. Enter username: tomsmith
        //6. Enter password: incorrectpassword
        //7. Click to Submit button
        //8. Assert “Your password is invalid!” text is displayed.


    }
}
