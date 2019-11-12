/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.TestClasses;

import KeywordDrivenTestFramework.Core.BaseClass;
import static KeywordDrivenTestFramework.Core.BaseClass.SeleniumDriverInstance;
import static KeywordDrivenTestFramework.Core.BaseClass.SikuliDriverInstance;
import KeywordDrivenTestFramework.Entities.Enums;
import static KeywordDrivenTestFramework.Entities.Enums.Environment.QA;
import KeywordDrivenTestFramework.Entities.TestEntity;
import KeywordDrivenTestFramework.Reporting.Narrator;
import KeywordDrivenTestFramework.Testing.PageObjects.BDDPageObjects;
import KeywordDrivenTestFramework.Testing.PageObjects.NPW_EasiPlus_PageObjects;
import KeywordDrivenTestFramework.Utilities.SikuliDriverUtility;
import cucumber.api.Scenario;
import java.io.IOException;
import java.util.HashMap;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.script.Key;

/**
 *
 * @author fnell
 */
public class NPW_EasiPlus_QuoteTest_PreDEV extends BaseClass
{

    public TestEntity testData;
    String error = "";
    Narrator narrator;
    String keyword;
    
    public HashMap <String, String> responseValues = new HashMap<>();
    
    boolean reponseFlag = false;

    public NPW_EasiPlus_QuoteTest_PreDEV(TestEntity testData, String keyword)
    {
        this.testData = testData;
        this.keyword = keyword;
        narrator = new Narrator(testData);
    }
    
    public NPW_EasiPlus_QuoteTest_PreDEV()
    {    
        narrator = new Narrator();
        //SikuliDriverInstance = new SikuliDriverUtility(System.getProperty("user.dir")+"\\Unit-Tests\\SikuliImages\\");
    }
    
    //BDD EXAMPLE METHODS------------------------------------------------------------------------------------------
    public String GivenIHaveNavigatedToEaiPlusQuotePreDEV()
    {                     
        if (!SeleniumDriverInstance.navigateTo(NPW_EasiPlus_PageObjects.EasiPlusURL()))
        {
            return "Failed to navigate to url: " + NPW_EasiPlus_PageObjects.EasiPlusURL();
        }
        
        if (!SeleniumDriverInstance.waitForElementByXpath(NPW_EasiPlus_PageObjects.EPQ_SelectCover_Button()))
        {
            return "Failed to wait for Select Cover Button 'Me & My Direct Family";
        }
        
        narrator.stepPassedWithScreenShot("Successfully Navigated to EasiPlus Quote.");
        return null;
    }
    
    public String WhenEasiPlusQuotePageLoadsPreDEV()
    {
        
        if (!SeleniumDriverInstance.waitForElementByXpath(NPW_EasiPlus_PageObjects.EPQ_SelectCover_Button()))
        {
            return "Failed to wait for Select Cover Button 'Me & My Direct Family";
        }
    
        narrator.stepPassedWithScreenShot("Successfully validated EasiPlus Quote PreDEV Landing Page");
        
        return null;
    }
    
    public String ThenClickSelectCoverMeAndMyDirectFamily()
    {
        if (!SeleniumDriverInstance.waitForElementByXpath(NPW_EasiPlus_PageObjects.EPQ_SelectCover_Button()))
        {
            return "Failed to wait for Select Cover Button 'Me & My Direct Family";
        }
        
        if (!SeleniumDriverInstance.clickElementbyXpath(NPW_EasiPlus_PageObjects.EPQ_SelectCover_Button()))
        {
            return "Failed to click Select Cover Button 'Me & My Direct Family";
        }
        
        if (!SeleniumDriverInstance.waitForElementByXpath(NPW_EasiPlus_PageObjects.EPQ_WhoDoYouWantToCover_Header()))
        {
            return "Failed to wait for EPQ 'Who do you want to cover?' Header.";
        }
    
        narrator.stepPassedWithScreenShot("Successfully clicked Select Cover 'Me & My Direct Family'");
        
        return null;
    }
    
    public String WhenWhoDoYouWantToCoverHeaderLoads()
    {   
        if (!SeleniumDriverInstance.waitForElementByXpath(NPW_EasiPlus_PageObjects.EPQ_WhoDoYouWantToCover_Header()))
        {
            return "Failed to wait for EPQ 'Who do you want to cover?' Header.";
        }
    
        narrator.stepPassedWithScreenShot("Successfully Validated 'Who Do You Want To Cover' Header.");
        
        return null;
    }
    
    public String ThenSelect_Myself_from_the_Select_Who_You_Want_to_Cover_dropdown()
    {
        if (!SeleniumDriverInstance.waitForElementByXpath(NPW_EasiPlus_PageObjects.EPQ_WhoDoYouWantToCover_DropDown()))
        {
            return "Failed to wait for Who Do You Want To Cover DropDown.";
        }
        
        if (!SeleniumDriverInstance.clickElementbyXpath(NPW_EasiPlus_PageObjects.EPQ_WhoDoYouWantToCover_DropDown()))
        {
            return "Failed to click Who Do You Want To Cover DropDown.";
        }
        
        if (!SeleniumDriverInstance.waitForElementByXpath(NPW_EasiPlus_PageObjects.EPQ_WhoDoYouWantToCover_DropDown_Myself()))
        {
            return "Failed to wait for Who Do You Want To Cover Myself DropDown Option.";
        }
        
        if (!SeleniumDriverInstance.clickElementbyXpath(NPW_EasiPlus_PageObjects.EPQ_WhoDoYouWantToCover_DropDown_Myself()))
        {
            return "Failed to click Who Do You Want To Cover Myself DropDown Option.";
        }
    
        narrator.stepPassedWithScreenShot("Successfully Selected Myself From DropDown");
        
        return null;
    }
    
    public String WhenEnteringAnInvalidAge(String arg1)
    {   
        
        if (SeleniumDriverInstance.scrollToElement(NPW_EasiPlus_PageObjects.EPQ_Clear_Button()))
        {
            return "Failed to scroll to Clear Button.";
        }
        
        if (!SeleniumDriverInstance.waitForElementByXpath(NPW_EasiPlus_PageObjects.EPQ_Age_Input()))
        {
            return "Failed to wait for EPQ Age Input.";
        }
        
        if (!SeleniumDriverInstance.enterTextByXpathUsingActions(NPW_EasiPlus_PageObjects.EPQ_Age_Input(),arg1))
        {
            return "Failed to enter text at EPQ Age Input.";
        }
    
        narrator.stepPassedWithScreenShot("Successfully Entered Invalid Age.");
        
        return null;
    }
    
    public String ThenThe_Premium_amount_remains_and_an_Error_message_is_displayed(String arg1)
    {
        if (!SeleniumDriverInstance.waitForElementByXpath(NPW_EasiPlus_PageObjects.EPQ_Premium_Amount()))
        {
            return "Failed to wait for Who Do You Want To Cover DropDown.";
        }
        
        String Premium = SeleniumDriverInstance.retrieveTextByXpath(NPW_EasiPlus_PageObjects.EPQ_Premium_Amount());
        if(!Premium.contains(arg1))
        {
            return "Failed to Validate Premium Amount: "+arg1;
        }
    
        narrator.stepPassedWithScreenShot("Successfully Validated Premium Amount.");
        
        return null;
    }
    
    public String WhenEntering_a_and_selecting_the_from_the_slider(String arg1, String arg2)
    {   
        
        if (SeleniumDriverInstance.scrollToElement(NPW_EasiPlus_PageObjects.EPQ_Clear_Button()))
        {
            return "Failed to scroll to Clear Button.";
        }
        
        if (!SeleniumDriverInstance.waitForElementByXpath(NPW_EasiPlus_PageObjects.EPQ_Age_Input()))
        {
            return "Failed to wait for EPQ Age Input.";
        }
        
        if (!SeleniumDriverInstance.enterTextByXpathUsingActions(NPW_EasiPlus_PageObjects.EPQ_Age_Input(),arg1))
        {
            return "Failed to enter text at EPQ Age Input.";
        }
        
        if (!SeleniumDriverInstance.waitForElementByXpath(NPW_EasiPlus_PageObjects.EPQ_Cover_Slider()))
        {
            return "Failed to wait for EPQ Cover Slider.";
        }
        
//        if (!SeleniumDriverInstance.clickElementbyXpathUsingActionsOffset(NPW_EasiPlus_PageObjects.EPQ_Cover_Slider()))
//        {
//            return "Failed to click EPQ Cover Slider.";
//        }
//        
//        
        if (!SeleniumDriverInstance.clickElementbyXpathUsingActions(NPW_EasiPlus_PageObjects.EPQ_Cover_Slider()))
        {
            return "Failed to click EPQ Cover Slider.";
        }
    
        narrator.stepPassedWithScreenShot("Successfully Entered Age and Selected Cover Slider.");
        
        return null;
    }
    
    public String ThenAmount_is_calculated(String arg1)
    {
        if (!SeleniumDriverInstance.waitForElementByXpath(NPW_EasiPlus_PageObjects.EPQ_Premium_Amount()))
        {
            return "Failed to wait for Who Do You Want To Cover DropDown.";
        }
        
        pause(1000);
        String Premium = SeleniumDriverInstance.retrieveTextByXpath(NPW_EasiPlus_PageObjects.EPQ_Premium_Amount());
        if(!Premium.contains(arg1))
        {
            return "Failed to Validate Premium Amount: "+arg1;
        }
    
        narrator.stepPassedWithScreenShot("Successfully Validated Premium Amount.");
        
        return null;
    }
    
    public String WhenClicking_Add_To_Cover()
    {
        
        if (!SeleniumDriverInstance.waitForElementByXpath(NPW_EasiPlus_PageObjects.EPQ_AddToCover_Button()))
        {
            return "Failed to wait for ADD TO COVER Button.";
        }
        
        if (!SeleniumDriverInstance.clickElementbyXpath(NPW_EasiPlus_PageObjects.EPQ_AddToCover_Button()))
        {
            return "Failed to click ADD TO COVER Button.";
        }
        
        if (!SeleniumDriverInstance.waitForElementByXpath(NPW_EasiPlus_PageObjects.EPQ_AddedCoverMyself()))
        {
            return "Failed to wait for Added To Cover Myself.";
        }
    
        narrator.stepPassedWithScreenShot("Successfully Clicked ADD TO COVER Button.");
        
        return null;
    
    }
    
    public String ThenIs_added_to_Quote_Summary(String arg1)
    {
        if (!SeleniumDriverInstance.waitForElementByXpath(NPW_EasiPlus_PageObjects.EPQ_AddedCoverMyself()))
        {
            return "Failed to wait for Added To Cover Myself.";
        }
        
        if (!SeleniumDriverInstance.waitForElementByXpath(NPW_EasiPlus_PageObjects.EPQ_QuoteSummaryCoverTotal()))
        {
            return "Failed to wait for Quote Summary Cover Total.";
        }
        
        pause(1000);
        String CoverTotal = SeleniumDriverInstance.retrieveTextByXpath(NPW_EasiPlus_PageObjects.EPQ_QuoteSummaryCoverTotal());
        if(!CoverTotal.contains(arg1))
        {
            return "Failed to Validate Quote Summary Cover Total Amount: "+arg1;
        }
        
        
        narrator.stepPassedWithScreenShot("Successfully Validated Quote Summary Cover Total Amount.");
        
        return null;
    }
    
    public String WhenClicking_the_Dropdown_icon()
    {
        
        if (!SeleniumDriverInstance.waitForElementByXpath(NPW_EasiPlus_PageObjects.EPQ_QuoteSummary_DropdownIcon()))
        {
            return "Failed to wait for Quote Summary Dropdown Icon.";
        }
        
        if (!SeleniumDriverInstance.clickElementbyXpath(NPW_EasiPlus_PageObjects.EPQ_QuoteSummary_DropdownIcon()))
        {
            return "Failed to click Quote Summary Dropdown Icon.";
        }
    
        narrator.stepPassedWithScreenShot("Successfully Clicked Quote Aummary Dropdown Icon.");
        
        return null;
    
    }
    
    public String WhenNaviagtedToPackagesSection()
    {
        
        if (!SeleniumDriverInstance.waitForElementByXpath(BDDPageObjects.AmazonAccountEmail()))
        {
            return "Failed to wait for Amazon Email Text Input";
        }
        
        if (!SeleniumDriverInstance.waitForElementByXpath(BDDPageObjects.AmazonAccountPassword()))
        {
            return "Failed to wait for Amazon Password Text Input";
        }
    
        narrator.stepPassedWithScreenShot("Successfully validated Amazon Login Page");
        
        return null;
    
    }
    //-----------------------------------------------------------------------------------------------------------
    
    
    
    
}

