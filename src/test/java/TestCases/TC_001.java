package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_001 {
	
	static WebDriver driver;
	
	
	public void startbrowser(String url)
		{
			System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(url);
		}
	
	// this is the first testcase
	@Test(groups= {"Regression", "Sanity", "Smoke"})
	
	public void VerifyFBLogin()
	{
		startbrowser("https://www.fb.com/");
		driver.close();
	}	
	
	@Test(groups= {"Regression", "Sanity"})
	public void VerifyFBLogin1()
	{
		startbrowser("https://www.fb.com/");
		driver.close();
	}
	
	// Test

}
