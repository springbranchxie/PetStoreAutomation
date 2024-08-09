package AssertionDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionScripts {
	
	
	@Test
	public void test1()
	{
		Assert.assertEquals(12, 13);
	}

	@Test
	public void test12()
	{
		System.out.println("Test case 2 Strated");
		Assert.assertEquals(12, 13,"Dropdown count does not match please check with developer");
		System.out.println("Test case 2 complete");
	}
	
	@Test
	public void test13()
	{
		System.out.println("Test case 3 Strated");
		Assert.assertEquals("Hello","Hello","Words does not match please rasie a bug");
		System.out.println("Test case 3 complete");
	}
	
	
}
