package Test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class Demo1 {

	@Test
	public void Office() {
		System.out.println("IT");
	}

	@Test
	public void HR() {
		System.out.println("Onboarding Procees");
	}

	@Test
	public void Finance() {
		System.out.println("Accounts");
	}

	@AfterSuite
	public void AfSuite() {
		System.out.println("I'm the last one");
	}
}
