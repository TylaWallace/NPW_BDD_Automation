/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing.PageObjects;

import KeywordDrivenTestFramework.Core.BaseClass;

/**
 *
 * @author fnell
 */
public class GmailPageObject extends BaseClass
{
    
    public static String GmailURL()
    {
        // Use ENUM
        return currentEnvironment.SiteURL;
    }

    public static String emailTextBoxXpath()
    {
        return "//input[@id='Email']";
    }
    
    public static String emailOrPhoneTextBoxXpath()
    {
        return "//input[@id='identifierId']";
    }
    
    public static String nextButtonXpath()
    {
        return "//input[@id='next']";
    }
    
    public static String newNextButtonXpath()
    {
        return "//span[text()='Next']";
    }
    
    public static String passwordTextBoxXpath()
    {
        return "//input[@id='Passwd']";
    }
    
    public static String newPasswordTextBoxXpath()
    {
        return "//input[@type='password']";
    }
    
    
    public static String signInButtonXpath()
    {
        return "//input[@id='signIn']";
    }
    
    
    public static String composeButtonXpath()
    {
        return "//div[text()='COMPOSE']";
    }
    
    
    public static String recipientsTextBoxXpath()
    {
        return "//textarea[@aria-label='To']";
    }
    
    public static String subjectTextBoxXpath()
    {
        return "//input[@name='subjectbox']";
    }
    
    
    public static String messageBodyTextBoxXpath()
    {
        return "//div[@aria-label='Message Body']";
    }
    
    
    public static String sendButtonXpath()
    {
        return "//div[text()='Send']";
    }

    public static String sendConfirmationMessageXpath()
    {
        return "//div[contains(text(),'Your message has been sent')]";
    }
    
    
    public static String inboxItemSelectCheckboxGenericXpath(String subjectLineText)
    {
        return "//span/b[contains(text(),'" + subjectLineText + "')]/../../../../../..//div[@role='checkbox']";
    }
    
    public static String deleteButtonXpath()
    {
        return "//div[@data-tooltip='Delete']";
    }
    
    
    //
}
