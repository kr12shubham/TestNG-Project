package Test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterising {

	@Test
	public void Office() {
		System.out.println("IT");
	}

	@Test
	public void HR() {
		System.out.println("Onboarding Procees");
	}

	// @Parameters({"URL"})
	@Test
	// public void Finance(String abc)
	public void Finance() {
		System.out.println("Accounts");
		// System.out.println(abc);
	}

	@AfterSuite
	public void AfSuite() {
		System.out.println("I'm the last one");
	}
}
