package AssertionDemo;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertDemo 
{
    @Test
	public void testSoft()
	{
		SoftAssert assertion=new SoftAssert();
		System.out.println("Test 1 Started");
		assertion.assertEquals(12, 13,"Count doesn't match");
		System.out.println("Test 1 completes");
		assertion.assertAll();
	}
    
    @Test
	public void testHardAssert()
	{
		
		System.out.println("Test 2 Started");
		Assert.assertEquals(12, 13);
		System.out.println("Test 2 completes");
		
	}
	
	
}
