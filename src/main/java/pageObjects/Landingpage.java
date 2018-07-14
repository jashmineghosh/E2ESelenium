package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Landingpage {
public WebDriver driver;
	
	
	By signin = By.className("login");
	By email = By.id("email");
	By password = By.id("passwd");
	By submit = By.xpath("(//button[@type='submit'])[3]");
	public Landingpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public WebElement getSignin()
	{
		return driver.findElement(signin);
	}

	public WebElement getemail()
	{
		return driver.findElement(email);
	}
	public WebElement getpasswordn()
	{
		return driver.findElement(password);
	}

public WebElement getsubmit()
{
	return driver.findElement(submit);
}
}
