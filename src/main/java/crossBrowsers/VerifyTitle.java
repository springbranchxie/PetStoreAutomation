package crossBrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyTitle {
	
	WebDriver driver;
	
	@Test
	@Parameters("browser")
	public void verifypageTitle(String browserName)
	{
		if(browserName.equalsIgnoreCase("edge"))
		{
			
			
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		else if(browserName.equalsIgnoreCase("chrome"))
		{
			
			
			System.setProperty("webdriver.chrome.driver", "C:\\chromdriver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			
			driver=new ChromeDriver();
		}
	    driver.manage().window().maximize();
	    driver.get("https://www.google.com");
	    System.out.println(driver.getTitle());
	    System.out.println(driver.getCurrentUrl());
	    driver.quit();
	
	}
	
	
	
	

}
