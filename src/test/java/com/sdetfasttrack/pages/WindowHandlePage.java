package com.sdetfasttrack.pages;

import com.sdetfasttrack.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class WindowHandlePage {

    public  WindowHandlePage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

//TC#4
    //1. Go to http://practice.cydeo.com/windows
    //2. Assert: Title is "Practice"
    //3. Click to: "Click Here" text
    //4. Switch to new Window
    //5 Assert: Title is "New Window"
    //6 Switch back to main handle



}
