package Test;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day2 {
	@AfterTest
	public void lastTest() {
		System.out.println("I will execute at last");
	}
@Test(groups="smoke")
public void ploan() {
	System.out.println("Good!");
}
@BeforeTest
public void prerequiste() {
	
	System.out.println("This will execute before all the classes from Test folder");
}
}
