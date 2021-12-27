package com.sdetfasttrack.tests;

import com.sdetfasttrack.pages.AlertClass;
import com.sdetfasttrack.utilities.Driver;
import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertTest {

    AlertClass alertClass = new AlertClass();

   @Test
   public void alertTest() throws InterruptedException {

       //TC#3
       //1. Go to http://practice.cydeo.com/javascript_alerts
       Driver.getDriver().get("http://practice.cydeo.com/javascript_alerts");
       //2. Clicking to the button for allert to be displayed
        alertClass.clickJsAlert.click();
        Alert alert1 = Driver.getDriver().switchTo().alert();

       //3. Click to OK button from the alert
       alert1.accept();

       //4. Verify "You successfully clicked an alert" text is displayed
       String expected = "You successfuly clicked an alert";
       String actual = alertClass.result.getText();
       Assert.assertEquals(actual, expected, "Not successful");

///////////////
       alertClass.clickJsConfirm.click();
       Alert alert2 = Driver.getDriver().switchTo().alert();
       alert2.dismiss();
       expected = "You clicked: Cancel";
       actual = alertClass.result.getText();
       Assert.assertEquals(actual, expected, "Not successful");


       alertClass.getClickJsPrompt.click();
       Alert alert3 = Driver.getDriver().switchTo().alert();
       alert3.sendKeys("Hello");
       alert3.accept();
       expected = "You entered: Hello";
       actual = alertClass.result.getText();
       Assert.assertEquals(actual, expected, "Not successful");

    }

}
