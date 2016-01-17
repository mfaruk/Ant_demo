package testcases;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

public class UnderstandingAssertions {
	@Rule
	public ErrorCollector errCollector = new ErrorCollector();
	
	
	@Test
	public void friendListFacebookTest(){
		int actual_total_friend = 100; // from selenium
		int expected_total_friend = 101; // from xlsx files.
		/*
		if(actual_total_friend == expected_total_friend){
			System.out.println("Pass");
		}else{
			System.out.println("Fail");
			//report the error.
			
		} */
		System.out.println("A");
		try{
			Assert.assertEquals(expected_total_friend, actual_total_friend);	
		}
		catch(Throwable t)
		{
			System.out.println("Error Encountered");
			// java code to report error
			errCollector.addError(t);
		}
		System.out.println("B");
		
		try{
			Assert.assertEquals("A", "B");	
		}
		catch(Throwable t)
		{
			System.out.println("Error Encountered");
			// java code to report error
			errCollector.addError(t);
		}
		
		try{
			Assert.assertEquals("A", "A");	
		}
		catch(Throwable t)
		{
			System.out.println("Error Encountered");
			// java code to report error
			errCollector.addError(t);
		}
	}
}
