package Test;

import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class onTestFailure {

	@Test
	public void Demo() {
		System.out.println("Hello World..!!");
		//Assert.assertTrue(false);
	}

	@BeforeTest
	public void name() {
		System.out.println("Welcome to the world of Automation");
	}

	@BeforeSuite
	public void a1() {
		System.out.println("I'm the no. 1");
	}
}
