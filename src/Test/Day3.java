package Test;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Day3 {
	@Test(groups="smoke")
	public void webLogin() {
		System.out.println("WebLogin");
	}
	@BeforeSuite
	public void beforeSuit() {
		System.out.println("I am first");
	}
	@Test
	public void apiLogin() {
		System.out.println("APILogin");
	}
	@Test
	public void mobileLogin() {
		System.out.println("mobileLogin");
	}
	

}
