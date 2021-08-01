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
	
	
	@Test
	
	public void VerifyFBLogin()
	{
		startbrowser("https://www.fb.com/");
		driver.close();
	}	

}
