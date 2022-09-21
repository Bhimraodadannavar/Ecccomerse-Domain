package Generic_Script;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_Test implements Frame_Constants
{
	 public WebDriver driver;
	@BeforeMethod
	public void openAppln()
	{
		System.setProperty(chrome_key,chrome_value);
	    driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(base_url);		
	}
	@AfterMethod
	public void closeAppln() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.close();
	}

}
