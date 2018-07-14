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

public class ValidateNavBar  extends Base {
	public static Logger log = LogManager.getLogger(ValidateNavBar.class.getName());
@BeforeTest
public void begin() throws IOException
{
	driver = initializeDriver();
	driver.get("http://automationpractice.com/index.php"); // here we are using inheritance concept
	//driver.get(prop.getProperty("url")); // no hard coding of url
log.info("driver is initialized");
}

	@Test
	public  void Navigationbar() throws IOException 
	{
		// TODO Auto-generated method stub

LandingPage1 lp1 = new LandingPage1(driver); // here we are creating object of that class and invoking method

Assert.assertTrue(lp1.getNav().isDisplayed());
log.debug("checking logs");
	}
@AfterTest
public void teardown()
{
	driver.close();
	driver=null;
}
}
