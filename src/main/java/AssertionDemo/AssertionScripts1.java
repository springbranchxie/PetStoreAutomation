package AssertionDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionScripts1 {
	
	
	@Test
	public void test1()
	{
		String mystr="Mukesh Otwani";
		Assert.assertTrue(mystr.contains("shirely"));
	}

	@Test
	public void test2()
	{
		Assert.assertTrue(false);
	}
	
	
	
	
}
