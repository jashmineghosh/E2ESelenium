package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.Landingpage;
import resources.Base;

public class HomePagelogin  extends Base {
	public static Logger log = LogManager.getLogger(HomePage.class.getName());
	@BeforeTest
	public void begin() throws IOException
	{
		driver = initializeDriver();
		driver.get("http://automationpractice.com/index.php"); // here we are using inheritance concept, since parameterizing the test here, this might give error
		//hence put this line in the test method if this happens, as url has to be invoked everytime for many different types of data.
		//driver.get(prop.getProperty("url")); // no hard coding of url

	}
	
	@Test(dataProvider = "getData")
	public  void loginpagenavigation (String Username, String Password, String text) throws IOException {
		// TODO Auto-generated method stub

Landingpage lp = new Landingpage(driver); // here we are creating object of that class and invoking method
lp.getSignin().click();
lp.getemail().sendKeys(Username);
lp.getpasswordn().sendKeys(Password);
lp.getsubmit().click();
System.out.println(text);
	}
@DataProvider
public Object[][] getData()
{
	//row stands for how many diff types of data, col sanbds for how many values for each type of data are we passing
	Object[][] data =new Object[2][3];
	data[0][0] = "123@.c";
	data[0][1] = "456";
	data[0][2] = "first";
	
	data[1][0] = "123as@.c";
	data[1][1] = "456dfg";
	data[1][2] = "second";
	return data;
}
@AfterTest
public void teardown()
{
	driver.close();
	driver=null;
}
}
