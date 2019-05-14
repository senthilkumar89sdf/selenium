package Basic;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test2 {
	 @Test(retryAnalyzer = Test2.class)
	    public void test1() {
	        //Fail Scenario
	      Assert.  assertEquals(2+2,5,"Addition Problem! 2+2 must be 4!\n");
	    }
	 
}
