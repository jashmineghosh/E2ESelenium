package Academy;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObjects.LandingPage1;
import resources.Base;

public class HomePage  extends Base {
	public static Logger log = LogManager.getLogger(HomePage.class.getName());
	@BeforeTest
	public void begin() throws IOException
	{
		driver = initializeDriver();
		driver.get("http://automationpractice.com/index.php"); // here we are using inheritance concept
		//driver.get(prop.getProperty("url")); // no hard coding of url

	}
	
	@Test
	public  void basePagenavigation() throws IOException 
	{
		// TODO Auto-generated method stub

LandingPage1 lp1 = new LandingPage1(driver); // here we are creating object of that class and invoking method
Assert.assertEquals(lp1.getTitle().getText(), "WOMEN1");
log.error("failed");
log.info("checking failed test");

	}
	@AfterTest
	public void teardown()
	{
		driver.close();
		driver=null;
	}
}
