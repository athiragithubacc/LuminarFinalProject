package basepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	public static WebDriver driver;
	
	String pageUrl="https://testautomationpractice.blogspot.com/"; 
	
	@BeforeTest
	public void SetUp()
	{
		
		driver = new ChromeDriver();
		driver.get(pageUrl); 
		driver.manage().window().maximize();
       
	}
	@AfterTest
	public void AfterTesting()
	{
		driver.quit();
	}
}
