/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Reporting;

import KeywordDrivenTestFramework.Entities.DataRow;
import KeywordDrivenTestFramework.Entities.TestEntity;
import KeywordDrivenTestFramework.Entities.TestResult;
import KeywordDrivenTestFramework.Utilities.ApplicationConfig;
import KeywordDrivenTestFramework.Utilities.ExcelReaderUtility;
import java.text.SimpleDateFormat;
import org.joda.time.DateTime;
import org.joda.time.Duration;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author fnell
 */
public class TestReportEmailerTest 
{
    static TestReportEmailerUtility generateReport;
    ApplicationConfig config;
    List<TestResult> testResults;
    public TestReportEmailerTest() 
    {
        
    }
   

    @Test
    public void parameterToStringMethodTest() 
    {
            config = new ApplicationConfig();
            testResults = new ArrayList<TestResult>();
            
            Duration testDuration = new Duration(new DateTime(), new DateTime().plusSeconds(20));
            
//            TestEntity test1 = new TestEntity("GSQ1","Google Search Query");
//            
//            TestEntity test2 = new TestEntity("GSR1","Google Search Results");
//            
//            TestEntity test3 = new TestEntity("TT21","Test Test Test");
//            
//            TestEntity test4 = new TestEntity("DTD1","Demo Test Data");

//            TestResult result1 = new TestResult(test1, false, "Failed to locate search button", testDuration.getStandardSeconds());
//            testResults.add(result1);
//            
//            TestResult result2 = new TestResult(test2, true, "Test Passed", testDuration.getStandardSeconds() + 12);
//            testResults.add(result2);
//            
//             TestResult result3 = new TestResult(test2, false, "Failed to locate center of the universe", testDuration.getStandardSeconds());
//            testResults.add(result3);
//            
//            TestResult result4 = new TestResult(test3, true, "Test Passed", testDuration.getStandardSeconds() + 66);
//            testResults.add(result4);
            
            generateReport = new TestReportEmailerUtility(testResults);

            generateReport.SendResultsEmail();

    }
    
    
     @Test
    public void narratorExtentReportsTest() throws InterruptedException 
    {
            config = new ApplicationConfig();
            testResults = new ArrayList<TestResult>();
            
            LinkedHashMap<String, ArrayList<String>> ExtractedParameters = new LinkedHashMap();
            
            ArrayList<String> outputList = new ArrayList<>();
            
            outputList.add("Extracted Value");
            outputList.add("PASS");
            
            ExtractedParameters.put("Test Extraction Parameter", outputList);
            
            
             ArrayList<String> outputList2 = new ArrayList<>();
            
            outputList2.add("Extracted Value 2");
            outputList2.add("FAIL");
            
            ExtractedParameters.put("Test Extraction Parameter 2", outputList2);
            
            Duration testDuration = new Duration(new DateTime(), new DateTime().plusSeconds(20));
            
            TestEntity test1 = new TestEntity("GSQ1","Google Search Query", "This is a test description", ExtractedParameters);
            
//            TestEntity test2 = new TestEntity("GSR1","Google Search Results");
//            
//            TestEntity test3 = new TestEntity("TT21","Test Test Test");
//            
//            TestEntity test4 = new TestEntity("DTD1","Demo Test Data");

//            TestResult result1 = new TestResult(test1, false, "Failed to locate search button", testDuration.getStandardSeconds());
//            testResults.add(result1);
//            
//            TestResult result2 = new TestResult(test2, true, "Test Passed", testDuration.getStandardSeconds() + 12);
//            testResults.add(result2);
//            
//             TestResult result3 = new TestResult(test2, false, "Failed to locate center of the universe", testDuration.getStandardSeconds());
//            testResults.add(result3);
//            
//            TestResult result4 = new TestResult(test3, true, "Test Passed", testDuration.getStandardSeconds() + 66);
//            testResults.add(result4);
            
            
            
            Date dateNow = new Date();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd_hh-mm-ss");

            LinkedList<DataRow> dataRows = new LinkedList<>();
        
            ExcelReaderUtility excelReader = new ExcelReaderUtility();
        
            dataRows = excelReader.retrieveDataRowsFromSheet("DummyTestData.xlsx", "Sheet0");
            
            test1.gridValidationDataRows = dataRows;
            
            TestEntity test2 = new TestEntity("GSQ2","Google Search Query", "This is a test description", ExtractedParameters);
 
            generateReport.reportDirectory = "e:\\ExtentReportsTesting\\" + dateFormat.format(dateNow).toString();
            
            Narrator narratorInstance = new Narrator(test1);
            
            narratorInstance.stepPassed("Step1 Navigation Successful");  

            narratorInstance.finalizeTest("Test 1 FinishedSuccessfully");
             
            Thread.sleep(1000);
             
            narratorInstance = new Narrator(test2);
            
            narratorInstance.stepPassed("Step1 Navigation Successful");  

            narratorInstance.finalizeTest("Test 2 Finished Successfully");

    }
    
    
    
    
}
