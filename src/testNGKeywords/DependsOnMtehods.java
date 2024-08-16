package testNGKeywords;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMtehods {
	@Test(dependsOnMethods = { "b", "c" })
	public void a() {
		Reporter.log("A is running", true);
	}

	@Test
	public void b() {

		Reporter.log("B is running", true);
	}

	@Test
	public void c() {
		Reporter.log("C is running", true);
	}
}
