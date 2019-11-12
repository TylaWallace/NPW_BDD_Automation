/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Utilities;

import org.junit.Test;

/**
 *
 * @author Ferdinand
 */
public class SpeedTestUtilityTests 
{
    @Test
    public void runTest()
    {
        SpeedTestUtility spdTester = new SpeedTestUtility();

        spdTester.runDLTest();
    }
    
}