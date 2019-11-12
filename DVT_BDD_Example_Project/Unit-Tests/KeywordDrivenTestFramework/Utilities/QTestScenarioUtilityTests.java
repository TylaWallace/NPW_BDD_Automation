/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Utilities;

import KeywordDrivenTestFramework.Entities.Enums;
import KeywordDrivenTestFramework.Entities.QTest_DAO.Execution;
import KeywordDrivenTestFramework.Reporting.QTestScenarioReporter;
import com.google.common.io.Files;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.junit.Test;

/**
 *
 * @author fnell
 */
public class QTestScenarioUtilityTests 
{

    
    
     @Test
    public void updatePulseResults() throws IOException
    {
        QTestScenarioReporter qtestReporter = new QTestScenarioReporter();

        qtestReporter.PushJSONReportToJira("target\\cucumber.json", 805679, 59623);
    }
    
    
    
    
}
