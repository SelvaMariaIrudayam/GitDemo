package Test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day4 {
	@BeforeTest
	public void catTestBeforeTest() {
		System.out.println("I will excute before car loan");
	}
	//beforeMethod is specific to this Day4 class (scope-only for the methods in this class only)
	@BeforeMethod
	public void beforeEveryCarMethod() {
		System.out.println("let's start the testcase");
	}
	@AfterMethod
	public void afterEveryCarMethod() {
		System.out.println("let's finish the testcase");
	}
	@Test(groups="smoke")
	public void carWebLogin() {
		System.out.println("CarWebLogin");
	}
	@Test
	public void carApiLogin() {
		Assert.assertTrue(false);
		System.out.println("CARAPILogin");
	}
	@Test
	public void carMobileLogin() {
		System.out.println("CARmobileLogin");
	}
	@AfterSuite
	public void afterSuit() {
		System.out.println("I will end all the test");
	}
}
