/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects;

import static KeywordDrivenTestFramework.Core.BaseClass.currentBrowser;
import static KeywordDrivenTestFramework.Core.BaseClass.currentEnvironment;
import KeywordDrivenTestFramework.Entities.Enums;

/**
 *
 * @author mjivan
 */
public class NPW_EasiPlus_PageObjects
{
    
    //BDD EXAMPLE XPATHS--------------------------------------
    public static String EasiPlusURL()
    {
       return currentEnvironment.SiteURL;
    }
    
    public static String EPQ_SelectCover_Button()
    {
        return "//om-button-selector[@value='1']";
//        if(currentBrowser.equals(Enums.BrowserType.IE))
//        {
//            return "//label[@for='1'][contains(text(),'Select cover')]";
//            //return "//input[@id='1']//..";
//            
//        }else
//        {
//            return "//om-button-selector[@value='1']";
//        }
        
        //return "//strong[contains(text(),'Me & My Direct Family')]//..//..//..//..//..//div[@class='om-ez-quote-tab-card-button-wrapper']//span//om-button-selector//span//label[@for='1'][contains(text(),'Select cover')]";
    }
    
    public static String EPQ_WhoDoYouWantToCover_Header()
    {
        return "//strong[contains(text(),'Who')]";
    }
    
    public static String EPQ_WhoDoYouWantToCover_DropDown()
    {
        return "//li//span[contains(text(),'Choose from dropdown')]";
    }
    
    public static String EPQ_WhoDoYouWantToCover_DropDown_Myself()
    {
        return "//li[contains(text(),'Myself')]";
    }
    
    public static String EPQ_Age_Input()
    {
        return "//input[@placeholder='Age']//..//input";
    }
    
    public static String EPQ_Clear_Button()
    {
        return "//button//span[contains(text(),'CLEAR')]";
    }
    
    public static String EPQ_Premium_Amount()
    {
        return "//h2//strong//span[@class='premium']";
    }
    
    public static String EPQ_Cover_Slider()
    {
        return "//div[@class='slider-container']//input";
    }
    
    public static String EPQ_AddToCover_Button()
    {
        return "//button//span[contains(text(),'ADD TO COVER')]";
    }
    
    public static String EPQ_AddedCoverMyself()
    {
        return "//span[contains(text(),'Myself')]";
    }
    
    public static String EPQ_QuoteSummaryCoverTotal()
    {
        return "//p[contains(text(),'Your Funeral Cover could cost')]//..//p//strong";
    }
    
    public static String EPQ_QuoteSummary_DropdownIcon()
    {
        return "//span[@class='button-icon-wrapper']//om-icon";
    }
    
    
    
    public static String EPQ_GetQuote_Button()
    {
       return "//span[contains(text(),'Account & Lists')][1]";
    }
    
    public static String EPQ_FuneralPlan_Header()
    {
       return "//input[@name='email']";
    }
    
    public static String AmazonAccountPassword()
    {
        return "//input[@name='password']";
    }
    //-----------------------------------------------------------





















    
   
    

  
}
