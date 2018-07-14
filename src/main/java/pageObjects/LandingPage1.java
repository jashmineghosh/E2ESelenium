package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage1 {
public WebDriver driver;
	
	
	By title = By.xpath("//a[@title='Women']");
	By navbar = By.xpath("//div[@id='block_top_menu']");
	
	
	public LandingPage1(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public WebElement getTitle()
	{
		return driver.findElement(title);
	}

	public WebElement getNav()
	{
		return driver.findElement(navbar);
	}
}
