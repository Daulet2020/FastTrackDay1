package com.sdetfasttrack.pages;

import com.sdetfasttrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SynchronizationPage {
    //TC#1
    //1. Go to http://practice.cydeo.com/dynamic_loading/1
    //2. Click to start
    //3. Wait until loading bar disappears
    //4. Assert username inputbox is displayed
    //5. Enter username: tomsmith
    //6. Enter password: incorrectpassword
    //7. Click to Submit button
    //8. Assert “Your password is invalid!” text is displayed.


    //TC#2
    //1. Go to http://practice.cydeo.com/dynamic_loading/7
    //2. Wait until title is “Dynamic title”
    //3. Assert : Message “Done” is displayed.
    //4. Assert : Image is displayed.

    public SynchronizationPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[.= 'Start']")
    public WebElement startBtn;

    @FindBy(xpath = "//*[@type='username']")
    public WebElement username;

    @FindBy(xpath = "//*[@type='password']")
    public WebElement password;

    @FindBy(xpath = "//*[@type='submit']")
    public WebElement submitBtn;

    @FindBy(id = "flash")
    public WebElement message;

    @FindBy(xpath = "//strong[.='Done!']")
    public WebElement doneMsg;

    @FindBy(xpath = "//*[@alt='square pants']")
    public WebElement image;




}


