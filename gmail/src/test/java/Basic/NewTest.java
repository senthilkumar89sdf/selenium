package Basic;

import java.util.ArrayList;

import org.testng.TestNG;
import org.testng.annotations.Test;

public class NewTest {
 public static void main(String[] args) {
	
	 TestNG t1=new TestNG();
	 
     ArrayList<String> a1=new ArrayList<String>();
     
     a1.add(".\\test-output\\testng-failed.xml");
     
	 t1.setTestSuites(a1);
	 t1.run();
	 
	 
}
}

















