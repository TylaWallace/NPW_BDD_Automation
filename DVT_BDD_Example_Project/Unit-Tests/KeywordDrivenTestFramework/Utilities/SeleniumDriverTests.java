/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Utilities;

import KeywordDrivenTestFramework.Entities.Enums;
import org.junit.Test;

/**
 *
 * @author fnell
 */
public class SeleniumDriverTests 
{
    @Test
    public void testEventListner() throws InterruptedException
    {
        
        ApplicationConfig appConfig = new ApplicationConfig();
        
        SeleniumDriverUtility seleniumDriver = new SeleniumDriverUtility(Enums.BrowserType.Chrome);
        
        seleniumDriver.testCaseId = "MyScreenshotsTest";
        
        seleniumDriver.startDriver();
        //seleniumDriver.setAsListeningDevice();
        
        
        seleniumDriver.navigateTo("http://www.google.com");
        
        seleniumDriver.clickElementbyXpath("//input[@name='btnK']");
        
        seleniumDriver.takeScreenShot("TestingMyCode", true);
        
        //seleniumDriver.Driver.wait(8000);
        
        seleniumDriver.shutDown();
        
        
        
        
    }
}
