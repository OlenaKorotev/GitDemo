package AutomationProject.End2End;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	private By emailTextBox = By.id("user_email");
	private By passwordTextBox = By.id("user_password");
	private By loginButton = By.cssSelector("[class*='login-button']");
	private By forgotPassowrdLink = By.cssSelector(".link-below-button");
	private By errorMessage = By.cssSelector("[class*='alert-danger']");
	
	public WebElement getEmailTextBox()
	{
		return driver.findElement(emailTextBox);
	}
	
	public WebElement getPasswordTextBox()
	{
		return driver.findElement(passwordTextBox);
	}
	
	public WebElement getloginButton()
	{
		return driver.findElement(loginButton);
	}
	
	public WebElement getErrorMessage()
	{
		return driver.findElement(errorMessage);
	}
	
	public ForgotPasswordPage userCklicksForgotPasswordLink() {
		driver.findElement(forgotPassowrdLink).click();
		return new ForgotPasswordPage(driver);
	}
	
	
}

