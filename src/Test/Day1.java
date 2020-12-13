package Test;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day1 {

	@Test
	public void Demo() {
		System.out.println("Hello World..!!");
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
