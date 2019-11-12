/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Reporting;

import KeywordDrivenTestFramework.Entities.Enums;
import KeywordDrivenTestFramework.Entities.Enums.ResultStatus;
import KeywordDrivenTestFramework.Entities.TestEntity;
import KeywordDrivenTestFramework.Entities.TestResult;
import KeywordDrivenTestFramework.Utilities.ApplicationConfig;
import org.joda.time.DateTime;
import org.joda.time.Duration;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


/**
 *
 * @author Ferdi
 */
public class ReportGeneratorTest 
{
    static ReportGenerator generateReport;
    ApplicationConfig config;
    public ReportGeneratorTest() 
    {
        
    }
    
    @Before
    public  void  setupTestParameters()
    {
            config = new ApplicationConfig();
            generateReport = new ReportGenerator("TestPacks\\GMAIL TEST PACK.xlsx",config.ReportFileDirectory());

    }

    @Test
    public void parameterToStringMethodTest() 
    {
            Duration testDuration = new Duration(new DateTime(), new DateTime().plusSeconds(20));
            
            TestEntity test1 = new TestEntity();
            test1.TestCaseId = "GSQ1";
            test1.TestMethod = "Google Search Query";
            test1.TestDescription = "The test description";
            test1.addParameter("Search Query", "Chicken");
            
            TestEntity test2 = new TestEntity();
            test2.TestCaseId = "GSQ2";
            test2.TestMethod = "Google Search Query 2";
            test2.TestDescription = "The test description 2";
            test2.addParameter("Search Query 2", "Chicken 2");

            TestResult result1 = new TestResult(test1, ResultStatus.FAIL, "Failed to locate search button", testDuration.getStandardSeconds());
            generateReport.addResult(result1);
            
            TestResult result2 = new TestResult(test2, ResultStatus.PASS, "Test Passed", testDuration.getStandardSeconds() + 12);
            generateReport.addResult(result2);

            Assert.assertTrue("Generate report failed", generateReport.generateTestReport());

    }
}