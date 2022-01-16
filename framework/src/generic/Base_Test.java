package generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_Test implements frame_constants {
	public WebDriver driver;
	@BeforeMethod
	public void openappln()
	{
		
		System.setProperty(chrome_key,chrome_value);
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(base_url);
	}
	
	@AfterMethod
	
	public void closeappln()
	{
		driver.quit();
		
	}

}
