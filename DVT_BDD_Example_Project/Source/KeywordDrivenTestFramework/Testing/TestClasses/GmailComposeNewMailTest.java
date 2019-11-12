/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.TestClasses;

import KeywordDrivenTestFramework.Core.BaseClass;
import static KeywordDrivenTestFramework.Core.BaseClass.SikuliDriverInstance;
import KeywordDrivenTestFramework.Entities.TestEntity;
import KeywordDrivenTestFramework.Entities.TestResult;
import KeywordDrivenTestFramework.Reporting.Narrator;
import KeywordDrivenTestFramework.Entities.KeywordAnnotation;
import KeywordDrivenTestFramework.Testing.PageObjects.GmailPageObject;
import KeywordDrivenTestFramework.Utilities.SikuliDriverUtility;

/**
 *
 * @author fnell
 */

@KeywordAnnotation
(
    Keyword = "Gmail Compose New Mail Test",
    createNewBrowserInstance = false
)
public class GmailComposeNewMailTest extends BaseClass
{

    public TestEntity testData;
    String error = "";
    Narrator narrator;

    public GmailComposeNewMailTest(TestEntity testData)
    {
        this.testData = testData;
        narrator = new Narrator(testData);

    }

    public TestResult executeTest()
    {
        if (!VerifyGmailPageHasLoaded())
        {
            return narrator.testFailed("Failed to navigate to Metropolitan Health Group contact us tab page");
        }

        if (!ComposeAndSendNewEmail())
        {
            return narrator.testFailed("Failed to navigate to Metropolitan Health Group contact us tab page");
        }

        return narrator.finalizeTest("Successfully Navigated through Metropolitan Health Group contact us tab page");
    }

    public boolean VerifyGmailPageHasLoaded()
    {

        if (!SeleniumDriverInstance.waitForElementByXpath(GmailPageObject.composeButtonXpath()))
        {
            error = "Failed to verify page load";
            return false;
        }

        return true;
    }

    public boolean ComposeAndSendNewEmail()
    {

        if (!SeleniumDriverInstance.clickElementbyXpath(GmailPageObject.composeButtonXpath()))
        {
            error = "Failed to click compose button.";
            return false;
        }

        if (!SeleniumDriverInstance.enterTextByXpath(GmailPageObject.recipientsTextBoxXpath(),testData.getData("Recipients")))
        {
            error = "Failed to enter text to recipients field.";
            return false;
        }

        if (!SeleniumDriverInstance.enterTextByXpath(GmailPageObject.subjectTextBoxXpath(),testData.getData("Subject")))
        {
            error ="Failed to enter text to subject field.";
            return false;
        }

        if (!SeleniumDriverInstance.enterTextByXpath(GmailPageObject.messageBodyTextBoxXpath(),testData.getData("Message Body")))
        {
            error = "Failed to enter message into the message body";
            return false;
        }

        if (!SeleniumDriverInstance.clickElementbyXpath(GmailPageObject.sendButtonXpath()))
        {
            error = "Failed to click send button.";
            return false;
        }

        if (!SeleniumDriverInstance.waitForElementByXpath(GmailPageObject.sendConfirmationMessageXpath()))
        {
            error = "Failed to load send confirmation";
            return false;
        }
        
        
        narrator.stepPassedWithScreenShot("Email sent Successfully.");
        return true;
       
    }

}
