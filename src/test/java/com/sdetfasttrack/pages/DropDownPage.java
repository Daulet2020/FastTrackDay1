package com.sdetfasttrack.pages;

import com.sdetfasttrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DropDownPage {

    public DropDownPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    //TC#1
    //1. Go to http://practice.cydeo.com/dropdown
    //2. Select Illinois --> select by visible text
    //3. Select Virginia --> select by value
    //4. Select California --> select by index
    //5. Verify final selected option is California

    @FindBy(id = "state")
    public WebElement stateSelector;

    //TC#2
    // Select "December 1st, 1950" and verify it is selected
    //1. Go to http://practice.cydeo.com/dropdown
    //2. Select Year --> select by visible text
    //3. Select Month --> select by value
    //4. Select Day --> select by index
    //5. Verify final selected option is "December 1st, 1950"
    @FindBy(id = "year")
    public WebElement yearSelector;

    @FindBy(id = "month")
    public WebElement monthSelector;

    @FindBy(id = "day")
    public WebElement daySelector;

    //TC#3
    //1. Go to http://practice.cydeo.com/dropdown
    //2. Select all the options from multiple languages select dropdown
    //3. Print out all selected values and verify each is selected
    //4. Deselect all values and verify each is deselected
    @FindBy(name = "Languages")
    public WebElement Language;

}
