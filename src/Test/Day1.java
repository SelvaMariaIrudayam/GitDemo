package Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Day1 {
	@BeforeClass//this is applicable at the class level
	public void beforeThisDay1class()
	{
		System.out.println("I will execute before all day1 testcases");
		
	}
	
	@Test(groups="smoke")
	public void demo() {
		System.out.println("welcome to the testing world");
		
	}
	@Parameters({"URL"})
	@Test
	public void secondTest(String url) {
		System.out.println("Bye...");
		System.out.println("URL "+url);
		
	}
	@AfterClass
	public void afterThisDay1class()
	{
		System.out.println("I will execute after all day1 testcases");
		
	}
}
