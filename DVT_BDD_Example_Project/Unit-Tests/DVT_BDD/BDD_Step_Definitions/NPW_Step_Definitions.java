/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DVT_BDD.BDD_Step_Definitions;

import KeywordDrivenTestFramework.Core.BaseClass;
import KeywordDrivenTestFramework.Entities.Enums;
import KeywordDrivenTestFramework.Reporting.Narrator;
import KeywordDrivenTestFramework.Testing.TestClasses.BDDExampleTest;
import KeywordDrivenTestFramework.Testing.TestMarshall;
import KeywordDrivenTestFramework.Utilities.AppiumDriverUtility;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.runtime.java.StepDefAnnotation;
import DVT_BDD.RunBDDScripts;
import KeywordDrivenTestFramework.Testing.TestClasses.NPW_EasiPlus_QuoteTest;
import KeywordDrivenTestFramework.Testing.TestClasses.NPW_EasiPlus_QuoteTest_PreDEV;
import java.io.IOException;
import static org.junit.Assert.fail;
/**
 *
 * @author twallace
 */
@StepDefAnnotation
public class NPW_Step_Definitions extends BaseClass 
{
    
    NPW_EasiPlus_QuoteTest NPW_EasiPlus_MethodClass;
    NPW_EasiPlus_QuoteTest_PreDEV NPW_EasiPlus_MethodClass_PreDEV;

    public NPW_Step_Definitions()
    {
        //add test classes to be used in scenario
        NPW_EasiPlus_MethodClass = new NPW_EasiPlus_QuoteTest();
        NPW_EasiPlus_MethodClass_PreDEV = new NPW_EasiPlus_QuoteTest_PreDEV();
        
    }
    
    @Before
    public void before(Scenario scenario)
    {
        try 
        {
            
            narrator = new Narrator();
            
            //start driver
            if(!SeleniumDriverInstance._isDriverRunning)
                SeleniumDriverInstance.startDriver();
            
            
            String scenarioName = narrator.formatMessage(scenario.getName());

            testCaseId =  scenarioName + "_" + scenarioCount++;
            
        } 
        catch (Exception ioe) 
        {
            System.err.println("[ERROR] - Failed to read/write scenario count setup file - " + ioe.getMessage());
        }
    }
    

    //BDD EXAMPLE STEPS--------------------------------------
    

//    @Then("^enter \"([^\"]*)\" and (\\d+)$")
//    public void enter_and(String arg1, int arg2)
//    {
//        this.checkTestResult(BDDMethodClass.ThenEnterAnd(arg1, arg2));
//    }
    //NPW PRE DEV STEPS--------------------------------------
    
    @Given("^I have navigated to EasiPlus Quote PreDEV$")
    public void i_have_navigated_to_EasiPlus_Quote_PreDEV()
    {
        this.checkTestResult(NPW_EasiPlus_MethodClass_PreDEV.GivenIHaveNavigatedToEaiPlusQuotePreDEV());
    }

    @When("^EasiPlus Quote PreDEV Page loads$")
    public void easiplus_Quote_PreDEV_Page_loads()
    {
        this.checkTestResult(NPW_EasiPlus_MethodClass_PreDEV.WhenEasiPlusQuotePageLoadsPreDEV());
    }

    @Then("^click Select Cover Me and My Direct Family$")
    public void click_Select_Cover_Me_and_My_Direct_Family()
    {
        this.checkTestResult(NPW_EasiPlus_MethodClass_PreDEV.ThenClickSelectCoverMeAndMyDirectFamily());
    }

    @When("^Who do you want to cover Header Loads$")
    public void who_do_you_want_to_cover_Header_Loads()
    {
        this.checkTestResult(NPW_EasiPlus_MethodClass_PreDEV.WhenWhoDoYouWantToCoverHeaderLoads());
    }

    @Then("^select Myself from the Select Who You Want to Cover dropdown$")
    public void select_Myself_from_the_Select_Who_You_Want_to_Cover_dropdown()
    {
        this.checkTestResult(NPW_EasiPlus_MethodClass_PreDEV.ThenSelect_Myself_from_the_Select_Who_You_Want_to_Cover_dropdown());
    }

    @When("^entering an \"([^\"]*)\"$")
    public void entering_an(String arg1)
    {
        this.checkTestResult(NPW_EasiPlus_MethodClass_PreDEV.WhenEnteringAnInvalidAge(arg1));
    }

    @Then("^the Premium amount remains \"([^\"]*)\" and an Error message is displayed$")
    public void the_Premium_amount_remains_and_an_Error_message_is_displayed(String arg1)
    {
        this.checkTestResult(NPW_EasiPlus_MethodClass_PreDEV.ThenThe_Premium_amount_remains_and_an_Error_message_is_displayed(arg1));
    }

    @When("^entering a \"([^\"]*)\" and  selecting the \"([^\"]*)\" from the slider$")
    public void entering_a_and_selecting_the_from_the_slider(String arg1, String arg2)
    {
        this.checkTestResult(NPW_EasiPlus_MethodClass_PreDEV.WhenEntering_a_and_selecting_the_from_the_slider(arg1,arg2));
    }

    @Then("^\"([^\"]*)\" amount is calculated$")
    public void amount_is_calculated(String arg1)
    {
        this.checkTestResult(NPW_EasiPlus_MethodClass_PreDEV.ThenAmount_is_calculated(arg1));
    }

    @When("^clicking Add To Cover$")
    public void clicking_Add_To_Cover()
    {
        this.checkTestResult(NPW_EasiPlus_MethodClass_PreDEV.WhenClicking_Add_To_Cover());
    }

    @Then("^\"([^\"]*)\" is added to Quote Summary$")
    public void is_added_to_Quote_Summary(String arg1)
    {
        this.checkTestResult(NPW_EasiPlus_MethodClass_PreDEV.ThenIs_added_to_Quote_Summary(arg1));
    }

    @When("^clicking the Dropdown icon$")
    public void clicking_the_Dropdown_icon()
    {
        this.checkTestResult(NPW_EasiPlus_MethodClass_PreDEV.WhenClicking_the_Dropdown_icon());
    }

    @Then("^the Quote Summary is minimized or maximized$")
    public void the_Quote_Summary_is_minimized_or_maximized()
    {
        // Write code here that turns the phrase above into concrete actions
    }
    
    //-------------------------------------------------------
    
    @Given("^I have navigated to EasiPlus Quote$")
    public void i_have_navigated_to_EasiPlus_Quote()
    {
        this.checkTestResult(NPW_EasiPlus_MethodClass.GivenIHaveNavigatedToEaiPlusQuote());
    }

    @When("^EasiPlus Quote Page loads$")
    public void easiplus_Quote_Page_loads()
    {
        this.checkTestResult(NPW_EasiPlus_MethodClass.WhenEasiPlusQuotePageLoads());
    }

    @Then("^click Get Quote$")
    public void click_Get_Quote()
    {
        this.checkTestResult(NPW_EasiPlus_MethodClass.ThenClickGetQuote());
    }
    
    //------------------------------------------------------

    @After
    public void After()
    {
        SeleniumDriverInstance.shutDown();
    }
    
    public void checkTestResult(String result)
    {
        if(result != null) //failed
        {   //take screenshot, add to report
            narrator.testFailedCucumber(result);
            fail(result);
        }
    }
    
}
