package listenerDemo;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;



public class MyFirstTestCase 
{
    
	@Test
	public void GoogleTitleVerify()
	{
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		driver.quit();
	}
	
	@Test
	public void TitleMatch()
	{
		System.out.println("Test 2 Dummy");
		Assert.assertTrue(false);
	}
	
	
	
}
