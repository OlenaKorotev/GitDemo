package AutomationProject.End2End;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	public WebDriver driver;
	private By loginLink = By.cssSelector("a[href*='sign_in']");
	private By coursesTitle = By.cssSelector(".text-center>h2");
	private By navigationBar = By.cssSelector("[class*='navbar-right']>li>a");
	private By header =By.cssSelector("[class*='video-banner'] h3");
	private By popup = By.xpath("//button[text() = 'NO THANKS']");

	
	public LandingPage(WebDriver driver)
	{
		this.driver = driver;
	}
	

	public LoginPage userClicksLoginLink()
	{
		driver.findElement(loginLink).click();
		return new LoginPage(driver);

	}
	
	public WebElement getcoursesTitle()
	{
		return driver.findElement(coursesTitle);
	}
	
	public WebElement getNavigationBar()
	{
		return driver.findElement(navigationBar);
	}
	
	public WebElement getHeader()
	{
		return driver.findElement(header);
	}
	
	public int getPopupSize() {
		return driver.findElements(popup).size();
	}
	
	public WebElement getPopup() {
		return driver.findElement(popup);
	}

}
