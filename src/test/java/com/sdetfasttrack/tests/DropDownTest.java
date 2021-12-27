package com.sdetfasttrack.tests;

import com.sdetfasttrack.pages.DropDownPage;
import com.sdetfasttrack.utilities.Driver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DropDownTest {
    DropDownPage dropDownPage = new DropDownPage();

    @Test
    public void setDropDownPage() {

        //TC#1
        //1. Go to http://practice.cydeo.com/dropdown
        Driver.getDriver().get("http://practice.cydeo.com/dropdown");

        Select select = new Select(dropDownPage.stateSelector);

        //2. Select Illinois --> select by visible text
        select.selectByVisibleText("Illinois");
        String expected = "Illinois";
        String actual = select.getFirstSelectedOption().getText();
        Assert.assertEquals(actual, expected, "Illinois did not selected");

        //3. Select Virginia --> select by value
        select.selectByValue("VA");
        expected = "Virginia";
        actual = select.getFirstSelectedOption().getText();
        Assert.assertEquals(actual, expected, "Virginia did not selected");


        //4. Select California --> select by index
        select.selectByIndex(5);
        expected = "California";
        actual = select.getFirstSelectedOption().getText();
        Assert.assertEquals(actual, expected, "California did not selected");

        //5. Verify final selected option is California

        Driver.closeDriver();



    }
}
