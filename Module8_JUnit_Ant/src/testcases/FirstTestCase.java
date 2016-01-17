package testcases;

import org.junit.Ignore;
import org.junit.Test;

public class FirstTestCase {

	@Test //test case
	public void loginTest(){
		System.out.println("Login in user");
	}
	
	@Ignore //escape the test case.
	@Test
	public void registerTest(){
		System.out.println("Registering a user");
	}
	
	@Test
	public void dataBaseTest(){
		System.out.println("testing database");
	}
}