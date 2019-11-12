
package KeywordDrivenTestFramework.Testing;

import KeywordDrivenTestFramework.Entities.Enums;
import KeywordDrivenTestFramework.Reporting.Narrator;
import java.io.FileNotFoundException;
import org.junit.Test;

/**
 *
 * @author fnell
 */
public class TestMarshallTest {

    static TestMarshall instance;

    public TestMarshallTest() {
        
    }

    @Test
    public void testRunKeywordDrivenTests() throws FileNotFoundException
    {
        Narrator.logDebug("runKeywordDrivenTests");
        instance = new TestMarshall("TestPacks\\GMAIL TEST PACK.xlsx", Enums.BrowserType.Chrome);
        instance.currentEnvironment = Enums.Environment.QA;
        instance.runKeywordDrivenTests();
    }
}

