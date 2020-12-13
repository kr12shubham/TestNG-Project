package Test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Part2 {
	@AfterTest
	public void luck()
	{
		System.out.println("Thank You");
	}
	@Test
	public void Demo()
	{
		System.out.println("Welcome");
	}
	
	@Test
	public void Demo1()
	{
		System.out.println("I'm Happy");
	}
	

}
