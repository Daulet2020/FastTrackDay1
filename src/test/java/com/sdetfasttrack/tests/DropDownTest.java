package com.sdetfasttrack.tests;

import com.sdetfasttrack.pages.DropDownPage;
import com.sdetfasttrack.utilities.Driver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DropDownTest {
    DropDownPage dropDownPage = new DropDownPage();

    @Test
    public void dropDownTest() {

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

    @Test
    public void dropDownTest2(){

        //TC#2
        // Select "December 1st, 1950" and verify it is selected
        //1. Go to http://practice.cydeo.com/dropdown
        Driver.getDriver().get("http://practice.cydeo.com/dropdown");

        //2. Select Year --> select by visible text
        Select selectYear = new Select(dropDownPage.yearSelector);
        selectYear.selectByVisibleText("1950");
        String expected = "1950";
        String actual = selectYear.getFirstSelectedOption().getText();
        Assert.assertEquals(actual, expected, "Year is not correct");

        //3. Select Month --> select by value
        Select selectMonth = new Select(dropDownPage.monthSelector);
        selectMonth.selectByValue("11");
        String expectedMonth = "December";
        String actualMonth = selectMonth.getFirstSelectedOption().getText();
        Assert.assertEquals(actualMonth, expectedMonth, "Month not selected correct");

        //4. Select Day --> select by index
        Select selectDay = new Select(dropDownPage.daySelector);
        selectDay.selectByIndex(0);
        String expectedDay = "1";
        String actualDay = selectDay.getFirstSelectedOption().getText();
        Assert.assertEquals(actualDay, expectedDay, "Day not correct");

        //5. Verify final selected option is "December 1st, 1950"




    }



}
