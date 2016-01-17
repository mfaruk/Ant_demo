package testcases;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SecondTestCase {
	public static boolean checkLogin(){
		return false;
	}
	
	@BeforeClass  //have to static method
	public static void begining(){
		System.out.println("******************begining****************");
//		Assume.assumeTrue(false); // ignoring the test cases in this file
//		Assume.assumeTrue(checkLogin());
	}
	
	//browser open
	@Before
	public void openBrowser(){
		System.out.println("opening the browser");
	}
	
	
	@Test //test case
	public void sendEmailTest(){
		System.out.println("Sending Email");
	}
	
	@Test //test case
	public void sendMessageTest(){
		System.out.println("Sending message");
	}
	
	//browser close
	@After
	public void closeBrowser(){
		System.out.println("closing the browser");
	}
	
	@AfterClass //have to static method
	public static void ending(){
		System.out.println("******************ending****************");
	}
}
