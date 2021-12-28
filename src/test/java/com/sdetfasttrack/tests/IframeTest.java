package com.sdetfasttrack.tests;

import com.sdetfasttrack.pages.IframePage;
import com.sdetfasttrack.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;


public class IframeTest {
    IframePage iframePage = new IframePage();

    @Test
    public void iFrameTest() {

        //TC#4
        //1. Go to http://practice.cydeo.com/iframe
        Driver.getDriver().get("http://practice.cydeo.com/iframe");

        //2. Locate as WebElement
        Driver.getDriver().switchTo().frame(iframePage.iframe);

        //3. Pass index number
        // Driver.getDriver().switchTo().frame(iframePage.iframeIndex);

        //4. Pass id or name attribute value (If there are any).
        // Driver.getDriver().switchTo().frame(iframePage.iframeId);

        //5 Assert: "Your content goes here." Text is displayed
        assertTrue(iframePage.text.isDisplayed(), "Text did not displayed");


        //6 switch back to default frame
        Driver.getDriver().switchTo().parentFrame();

        assertTrue(iframePage.paragraph.isDisplayed(), "Paragraph did not displayed");
    }
}
