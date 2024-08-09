package ExampleDemo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandleDemo {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException{
		
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
//		WebDriverManager.chromedriver().setup();
//		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		String firstWindow=driver.getWindowHandle();
		System.out.println("firstWindow id is:"+firstWindow);
		driver.findElement(By.linkText("Open a popup window")).click();
		Thread.sleep(3000);
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> itr=windows.iterator();
		while(itr.hasNext()) {
			String window=itr.next();
			int size=window.length();
			System.out.println("the size is:"+size);
			driver.switchTo().window(window);
			String title=driver.getTitle();
			System.out.println("the tiltle is:"+title);
			if(driver.getTitle().equals("New Window")) {
				
				driver.close();
			}
		}

	DesiredCapabilities desiredCapability=DesiredCapabilities.edge();
	String Version=desiredCapability.getVersion();
	boolean JsEnable=desiredCapability.isJavascriptEnabled();
	System.out.println("Javascript is :"+JsEnable);
	System.out.println("Version is :"+Version);
}
}