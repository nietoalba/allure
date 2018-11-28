package pruebaA2.pruebaA2;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */

@Epic("Login Tests Epic")
@Feature("Invalid Login Features")
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    /*public void testApp()
    {
        assertTrue( true );
    }
    
*/


	 
	//@Test
    @Story("User tries to login the system with invalid username and invalid password.")
    @Description("Invalid Login Test with Invalid Username and Invalid Password.")
    public void test1 () {

    	assertTrue(true);
    }

}
