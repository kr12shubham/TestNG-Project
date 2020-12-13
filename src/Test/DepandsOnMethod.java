package Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DepandsOnMethod {

	@Test
	public void Demo() {
		System.out.println("1");
	}


	@Test
	public void name() {
		System.out.println("2");
	}
	@Test
	public void beforeeverymethod() {
		System.out.println("I'm the starter");
	}

@Test(dependsOnMethods={"beforeeverymethod"})
	public void a1() {
		System.out.println("3");
	}
}
