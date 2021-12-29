package com.sdetfasttrack.tests;

import com.sdetfasttrack.pages.WindowHandlePage;
import com.sdetfasttrack.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Set;

public class WindowHandleTest {

    WindowHandlePage windowHandlePage = new WindowHandlePage();

    @Test
    public void windowHandleTest() {


        //TC#4
        //1. Go to http://practice.cydeo.com/windows
        Driver.getDriver().get("http://practice.cydeo.com/windows");

        //2. Assert: Title is "Practice"
        String expTitle = "Practice";
        String actTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expTitle, actTitle, "Title did not match");

        //3. Click to: "Click Here" text
        windowHandlePage.clickHereBtn.click();

        String mainHandle = Driver.getDriver().getWindowHandle(); //define as a main window
        //System.out.println("main"+mainHandle);

        Set<String> windHandles = Driver.getDriver().getWindowHandles();

        //4. Switch to new Window
        for (String eachTab:windHandles){
            Driver.getDriver().switchTo().window(eachTab); // jump to new window
            String title = Driver.getDriver().getTitle();  //getting title of new window
            //System.out.println(eachTab);
            if (title.contains("New Window")){
                break;
            }
        }
        //5 Assert: Title is "New Window"
        expTitle = "New Window";
        actTitle=Driver.getDriver().getTitle();
        Assert.assertEquals(actTitle,expTitle,"Title not match");

        //6 Switch back to main handle
        Driver.getDriver().switchTo().window(mainHandle);

        Driver.getDriver().quit();

    }
}
