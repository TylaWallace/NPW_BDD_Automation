/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing;

import KeywordDrivenTestFramework.Entities.DataColumn;
import KeywordDrivenTestFramework.Entities.DataRow;
import KeywordDrivenTestFramework.Entities.Enums;
import KeywordDrivenTestFramework.Entities.Enums.ResultStatus;
import KeywordDrivenTestFramework.Entities.TestEntity;
import KeywordDrivenTestFramework.Reporting.ReportGenerator;
import KeywordDrivenTestFramework.Utilities.ApplicationConfig;
import KeywordDrivenTestFramework.Utilities.ExcelReaderUtility;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import static java.lang.System.out;
import java.util.ArrayList;
import java.util.LinkedList;
import org.junit.Test;

import java.util.List;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import static org.junit.Assert.assertNotNull;

/**
 *
 * @author fnell
 */
public class FileInputOutputTest
{

    public FileInputOutputTest()
    {
        ApplicationConfig appConfig;
    }

    @Test
    public void writeDataToExcelFile()
    {
        System.out.println("Writing Data to Excel:");
        String filePath = "WriteThis.xlsx";

        try
        {
            FileOutputStream fos = new FileOutputStream(filePath);
            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet worksheet = workbook.createSheet("My Worksheet");

            //Create ROW-1
            XSSFRow row1 = worksheet.createRow((short) 0);

            //Create COL-A from ROW-1 and set data
            XSSFCell cellA1 = row1.createCell(0);
            cellA1.setCellValue("Test one");

            //Create COL-B from ROW-1 and set data
            XSSFCell cellB1 = row1.createCell(1);
            cellB1.setCellValue("Test one");

            //Create COL-C from ROW-1 and set data
            XSSFCell cellC1 = row1.createCell(2);
            cellC1.setCellValue("Description");

            //Create COL-D from ROW-1 and set data
            XSSFCell cellD1 = row1.createCell(3);
            cellD1.setCellValue("ParameterOne");

            //Create COL-E from ROW-1 and set data
            XSSFCell cellE1 = row1.createCell(4);
            cellE1.setCellValue("ParameterTwo");

            //Create COL-F from ROW-1 and set data
            XSSFCell cellF1 = row1.createCell(5);
            cellF1.setCellValue("ParameterThree");

            //Create ROW-2
            XSSFRow row2 = worksheet.createRow((short) 1);
            //Due to bug empty cells throw NPE, supposed to return "".
            
            //Create COL-A from ROW-2 and set data
            XSSFCell cellA2 = row2.createCell(0);
            cellA2.setCellValue("test");
            
            //Create COL-B from ROW-2 and set data
            XSSFCell cellB2 = row2.createCell(1);
            cellB2.setCellValue("test");
            
            //Create COL-C from ROW-2 and set data 
            XSSFCell cellC2 = row2.createCell(2);
            cellC2.setCellValue("test");
            
            //Create COL-D from ROW-2 and set data
            XSSFCell cellD2 = row2.createCell(3);
            cellD2.setCellValue("Para-One");

            //Create COL-E from ROW-2 and set data
            XSSFCell cellE2 = row2.createCell(4);
            cellE2.setCellValue("Para-Two");

            //Create COL-F from ROW-2 and set data
            XSSFCell cellF2 = row2.createCell(5);
            cellF2.setCellValue("Para-Three");

            //Save workbook
            workbook.write(fos);
            fos.flush();
            fos.close();

        }
        catch (Exception e)
        {
            System.out.println("Error - " + e.getMessage());
        }
    }

    @Test
    public void readExcel()
    {
        System.out.println("Reading Data from Excel:");
        String filePath = "WriteThis.xlsx";
        try
        {
        FileInputStream input = new FileInputStream(filePath);
        XSSFWorkbook workbook = new XSSFWorkbook(input);
        
        XSSFSheet worksheet = workbook.getSheet("My Worksheet");
        
        int rowsCount = worksheet.getLastRowNum() +1;
        for (int i = 0; i < rowsCount; i++)
        {
            Row row = worksheet.getRow(i);
            int colCounts = row.getLastCellNum();
            System.out.println("Total Number of Cols: " + colCounts);
            for (int j = 0; j < colCounts; j++)
            {
                
                Cell cell = row.getCell(j);
                String value = cell.getStringCellValue();
                System.out.println("[" + i + "," + j + "]=" + value);
            }
        }
        }
        catch(Exception e)
        {
            System.out.println("Error - "+e.getMessage());
        }
        
        

    }

    @Test
    public void testGetTestDataFromExcelFile()
    {
        System.out.println("getTestDataFromExcelFile");
//        String filePath = ApplicationConfig.InputFileName();
        String filePath = "WriteThis.xlsx";
        ExcelReaderUtility instance = new ExcelReaderUtility();
        List expResult = null;
        List result = instance.getTestDataFromExcelFile(filePath);

        assertNotNull("The data retrieved from the spreadsheet was null", result);
        TestEntity testData = (TestEntity) result.get(0);
        System.out.println("First Test Retrieved: ");
        System.out.println("Test Method: " + testData.TestMethod);
        System.out.println("Parameters: " + testData.TestParameters.toString());
        System.out.println("End of test: Success");

    }
    
    
    @Test
    public void readSpreadSheetIntoDataRows()
    {
        // Read Spreadsheet into data rows, output information
        
        //DummyTestData.xlsx
        
        LinkedList<DataRow> dataRow = new LinkedList<>();
        
        ExcelReaderUtility excelReader = new ExcelReaderUtility();
        
        dataRow = excelReader.retrieveDataRowsFromSheet("DummyTestData.xlsx", "PR");
        
        out.println("[INFO] Total rows in dataRow collection - " + dataRow.size());
        
        
    }
    
    
    @Test
    public void writeDataRowsToSpreadSheet()
    {
        LinkedList<DataRow> dataRows = new LinkedList<>();
        
        ExcelReaderUtility excelReader = new ExcelReaderUtility();
        
        dataRows = excelReader.retrieveDataRowsFromSheet("DummyTestData.xlsx", "Sheet0");
        
        for(DataRow row : dataRows)
        {
            for(DataColumn column : row.DataColumns)
            {
                if(column.columnHeader.equals("ClaimTypeMajor") && Integer.parseInt(column.columnValue) <= 2)
                {
                    column.columnValue += " the Claim Type Major is less than or equal to 2!!!";
                    column.resultStatus = ResultStatus.FAIL;
                    
                }
                else
                    column.resultStatus = ResultStatus.PASS;
                
                
            }
        }
        
        ReportGenerator excelWriter = new ReportGenerator();
        excelWriter.GenerateExcelDataSheetReport(dataRows, "DummyTestData2.xlsx");
                
        
        
        
        
        
        
    }

}
