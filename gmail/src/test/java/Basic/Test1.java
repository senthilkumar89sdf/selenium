package Basic;




import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 {
  @Test
  public void f() {
	  Assert.fail();
	  System.out.println("test1");
  }
}
