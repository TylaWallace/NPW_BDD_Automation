/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing;

import static KeywordDrivenTestFramework.Core.BaseClass.DataBaseInstance;
import KeywordDrivenTestFramework.Entities.DataColumn;
import KeywordDrivenTestFramework.Entities.DataRow;
import KeywordDrivenTestFramework.Entities.Enums;
import KeywordDrivenTestFramework.Reporting.ReportGenerator;
import KeywordDrivenTestFramework.Utilities.DataBaseUtility;
import java.sql.ResultSet;
import java.util.LinkedList;
import org.junit.Test;

/**
 *
 * @author sbeck
 */
public class SQLTest
{
    static TestMarshall instance;
    
    
    @Test
    public void SQL()
    {
        TestMarshall instance = new TestMarshall("DBTest.xlsx");
        instance.currentDatabase = Enums.Database.Example;
        try{
        DataBaseUtility DataBaseUtil = new DataBaseUtility();
        String sqlStr = "SELECT * FROM CUSTOMER";
        
        
            ResultSet rs = DataBaseUtil.RunQuery(sqlStr);
//            while (rs.next())
//            {
//                String output = rs.getString("NAME");
//                System.out.println("Pulled "+output);
//            }
            DataBaseUtil.closeDB();
            
            LinkedList<DataRow> dataRows = new LinkedList<>();

            dataRows = DataBaseUtil.resultSetToArrayList(rs);
           
            
            for(DataRow row : dataRows)
            {
                for(DataColumn column : row.DataColumns)
                {
                    if(column.columnHeader.equals("CREDIT_LIMIT") && Integer.parseInt(column.columnValue) >= 25000)
                    {
                        column.columnValue += " the Credit Limit is less than 2!!!";
                        column.resultStatus = Enums.ResultStatus.FAIL;

                    }
                    else
                        column.resultStatus = Enums.ResultStatus.PASS;


                }
            }
        
            ReportGenerator excelWriter = new ReportGenerator();
            excelWriter.GenerateExcelDataSheetReport(dataRows, "DBValidations.xlsx"); 
             
             
        }
        catch(Exception e)
        {
            System.out.println("Error - "+e.getMessage());
        }
    }

}
