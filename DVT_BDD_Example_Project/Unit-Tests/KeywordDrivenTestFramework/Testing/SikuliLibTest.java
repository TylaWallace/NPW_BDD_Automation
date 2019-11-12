/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing;

import KeywordDrivenTestFramework.Utilities.SikuliDriverUtility;
import org.junit.Test;

/**
 *
 * @author sbeck
 */
public class SikuliLibTest
{

    @Test
    public void SikuliTest()
    {
        SikuliDriverUtility sikuliDriver = new SikuliDriverUtility("SikuliImages\\SikuliUnitTest\\");
        
        sikuliDriver.MouseDoubleClickElement("chrome.png");
    }
}
