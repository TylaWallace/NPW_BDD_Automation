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
    Keyword = "Sign In To Gmail Account",
    createNewBrowserInstance = true
)
public class GmailSignInTest extends BaseClass
{

    public TestEntity testData;
    String error = "";
    Narrator narrator;

    public GmailSignInTest(TestEntity testData)
    {
        this.testData = testData;
        narrator = new Narrator(testData);

    }

    public TestResult executeTest()
    {
        // This step will Launch the browser and navigate to the GMail URL
        if (!NavigateToGmailSignInPage())
        {
            return narrator.testFailed("Failed to navigate to Metropolitan Health Group contact us tab page");
        }

        // This step will sign into the specified gmail account with the provided credentials
        if (!SignInToGmailAccount())
        {
            return narrator.testFailed("Failed to navigate to Metropolitan Health Group contact us tab page");
        }

        return narrator.finalizeTest("Successfully Navigated through Metropolitan Health Group contact us tab page");
    }

    public boolean NavigateToGmailSignInPage()
    {

        if (!SeleniumDriverInstance.navigateTo(GmailPageObject.GmailURL()))
        {
            error = "Failed to navigate to gmail.";
            return false;
        }

        return true;
    }

    public boolean SignInToGmailAccount()
    {

        if (!SeleniumDriverInstance.enterTextByXpath(GmailPageObject.emailTextBoxXpath(), testData.getData("Email Address")))
        {
            error = "Failed to enter text into email text field.";
            return false;
        }

        if (!SeleniumDriverInstance.clickElementbyXpath(GmailPageObject.nextButtonXpath()))
        {
            error = "Failed to click next button.";
            return false;
        }

        if (!SeleniumDriverInstance.enterTextByXpath(GmailPageObject.passwordTextBoxXpath(), testData.getData("Password")))
        {
            error = "Failed to enter password into password field.";
            return false;
        }

        if (!SeleniumDriverInstance.clickElementbyXpath(GmailPageObject.signInButtonXpath()))
        {
            error = "Failed to click sign in button.";
            return false;
        }

        // Must ensure that the compose button appears!
        if (!SeleniumDriverInstance.waitForElementByXpath(GmailPageObject.composeButtonXpath()))
        {
            error = "Failed to load the compose button";
            return false;
        }

        return true;

    }

}
