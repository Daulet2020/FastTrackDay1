package com.sdetfasttrack.tests;

import com.sdetfasttrack.pages.SynchronizationPage;
import com.sdetfasttrack.utilities.Driver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
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
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 15);
        wait.until(ExpectedConditions.visibilityOf(synchronizationPage.username)); //explicit wait

        //4. Assert username inputbox is displayed
        Assert.assertTrue(synchronizationPage.username.isDisplayed(), "User name is not displayed");

        //5. Enter username: tomsmith
        synchronizationPage.username.sendKeys("tomsmith");

        //6. Enter password: incorrectpassword
        synchronizationPage.password.sendKeys("somepass");

        //7. Click to Submit button
        synchronizationPage.submitBtn.click();

        //8. Assert “Your password is invalid!” text is displayed.
        Assert.assertTrue(synchronizationPage.message.isDisplayed(),"Message not displayed");

        Driver.getDriver().quit();

    }

    @Test
    public void SynchronizationTest2() {

        //TC#2
        //1. Go to http://practice.cydeo.com/dynamic_loading/7
        Driver.getDriver().get("http://practice.cydeo.com/dynamic_loading/7");

        //2. Wait until title is “Dynamic title”
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

        //3. Assert : Message “Done” is displayed.
        Assert.assertTrue(synchronizationPage.doneMsg.isDisplayed());


        //4. Assert : Image is displayed.
        Assert.assertTrue(synchronizationPage.image.isDisplayed());

    }
}
