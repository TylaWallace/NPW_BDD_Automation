/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeywordDrivenTestFramework.Testing;

import KeywordDrivenTestFramework.Entities.Enums;
import KeywordDrivenTestFramework.Utilities.DataBaseUtility;
import KeywordDrivenTestFramework.Utilities.SeleniumDriverUtility;
import java.sql.ResultSet;
import java.util.List;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 *
 * @author sbeck
 */
public class NameGenerator
{

    static TestMarshall instance;

    @Test
    public void Generate()
    {
        int counter = 0;
        TestMarshall instance = new TestMarshall("DBTest.xlsx");
        instance.currentDatabase = Enums.Database.Example;
        DataBaseUtility DataBaseUtil = new DataBaseUtility();
        SeleniumDriverUtility SeleniumDriverInstance = new SeleniumDriverUtility(Enums.BrowserType.Chrome);
        SeleniumDriverInstance.startDriver();
        for (int j = 0; j < 500; j++)
        {

            SeleniumDriverInstance.navigateTo("http://random-name-generator.info/random/?n=10&g=1&st=2");
            SeleniumDriverInstance.waitForElementByXpath("//h2//..//li");
            
            List<WebElement> names;

            try
            {
                String sqlCounter = "SELECT MAX(ID) FROM DVT.\"NAMES\"";
                ResultSet count = DataBaseUtil.RunQuery(sqlCounter);
                
                while(count.next())
                {
                    counter = count.getInt("1");
                    break;
                }
                
                
                names = SeleniumDriverInstance.Driver.findElements(By.xpath("//h2//..//li"));
                for (int i = 0; i < names.size(); i++)
                {

                    String name = names.get(i).getText();
                                       
                    
                    if (counter > 0)
                    {
                        String sqlStr = "SELECT * FROM DVT.\"NAMES\" WHERE NAME='" + name + "'";
                        ResultSet rs = DataBaseUtil.RunQuery(sqlStr);

                        while (!rs.next())
                        {
                            counter++;
                            sqlStr = "INSERT INTO Names (ID , name) VALUES (" + counter + " ,'" + name + "')";
                            DataBaseUtil.RunQuery(sqlStr);
                            break;
                        }

                    }
                    else
                    {
                        counter++;
                        String sqlStr = "INSERT INTO Names (ID , name) VALUES (" + counter + " ,'" + name + "')";
                        DataBaseUtil.RunQuery(sqlStr);
                    }

                    DataBaseUtil.closeDB();

                }

            }
            catch (Exception e)
            {
                System.out.println("Error - " + e.getMessage());
            }
        }
    }

}
