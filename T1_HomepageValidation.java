package testCases;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utilities.baseline;
import utilities.logCollection;
import utilities.testData;

public class T1_HomepageValidation {
	
	public static WebDriver driver;
	
	
	@BeforeMethod
	
	public static void openBrowser()
	
	{
		driver = baseline.browserconfig();
		
		logCollection.debug("Firefox browser opened successfully");
	}

	
	@Test
	
	public static void homepageValidation()
	
	{
		driver.get(testData.homeURL);
		
		logCollection.debug("home page URL opened successfully");
		
		
	}


	@AfterMethod
	
	public static void closeBrowser()
	
	{
		driver.close();
	}

}



