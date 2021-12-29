package com.sdetfasttrack.tests;

import com.sdetfasttrack.pages.ActionPage;
import com.sdetfasttrack.utilities.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.swing.*;

public class ActionClassTest {

    ActionPage actionPage = new ActionPage(); // object of ActionPage

    @Test
    public void actionTest1() {
        //TC#1
        //1. Go to http://practice.cydeo.com/hovers
        Driver.getDriver().get("http://practice.cydeo.com/hovers");

        Actions actions = new Actions(Driver.getDriver()); //creating object of Actions class

        //2. Hover over to first image
        actions.moveToElement(actionPage.image1).build().perform();

        //3. Assert: “name: user1” is displayed
        Assert.assertTrue(actionPage.user1.isDisplayed(), "user1 not displayed");

        //4. Hover over to second image
        actions.moveToElement(actionPage.image2).build().perform();

        //5. Assert: “name: user2” is displayed
        Assert.assertTrue(actionPage.image2.isDisplayed(), "user2 not displayed");

        //6. Hover over to third image
        actions.moveToElement(actionPage.image3).build().perform();

        //7. Assert: “name: user3” is displayed
        Assert.assertTrue(actionPage.image3.isDisplayed(), "user3 not displayed");

        Driver.closeDriver();
   }

   @Test
    public void actionTest2(){

       //TC#2
       //1. Go	to https://the-internet.herokuapp.com/context_menu
       Driver.getDriver().get("https://the-internet.herokuapp.com/context_menu");
       Actions actions = new Actions(Driver.getDriver());

       //2. Right click to the	box.
       actions.moveToElement(actionPage.rightClick).contextClick().perform();

       //3. Alert will open.
       Alert alert = Driver.getDriver().switchTo().alert();
       //4. Accept	alert.
       alert.accept();
   }

}
