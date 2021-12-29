package com.sdetfasttrack.pages;

import com.sdetfasttrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActionPage {


    //TC#1
    //1. Go to http://practice.cydeo.com/hovers
    //2. Hover over to first image
    //3. Assert: “name: user1” is displayed
    //4. Hover over to second image
    //5. Assert: “name: user2” is displayed
    //6. Hover over to third image
    //7. Assert: “name: user3” is displayed


    //TC#2
    //1. Go	to https://the-internet.herokuapp.com/context_menu
    //2. Right click to the	box.
    //3. Alert will open.
    //4. Accept	alert.

    public ActionPage() { //constructor
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@class='figure'][1]")
    public WebElement image1;

    @FindBy(xpath = "//*[@class='figure'][2]")
    public WebElement image2;

    @FindBy(xpath = "//*[@class='figure'][3]")
    public WebElement image3;

    @FindBy(xpath = "//*[.='name: user1']")
    public WebElement user1;

    @FindBy(xpath = "//*[.='name: user2']")
    public WebElement user2;

    @FindBy(xpath = "//*[.='name: user3']")
    public WebElement user3;

    @FindBy(id = "hot-spot")
    public WebElement rightClick;

    }



