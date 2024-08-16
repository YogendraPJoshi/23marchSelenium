package testNGStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyClass {
  @Test
  public void f() {
	  System.out.println("Good Morning");
	  Reporter.log("This is reporter");
	  Reporter.log("This is new report", true);
	  Reporter.log("This is new report1", false);
  }
  
  @Test
  public void f1()
  {
	  System.out.println("Hi");
  
  }
  
  @Test
  public void f2()
  {
	  System.out.println("Hello");
  }
  
  @Test
  public void f3()  //@Test -->1TC-->1Test Method
  {
	  System.out.println("Hello");
  }
  
}
