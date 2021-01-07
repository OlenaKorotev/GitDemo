package AutomationProject.End2End;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//hello
public class ForgotPasswordPage {
	
	WebDriver driver;
	
	public ForgotPasswordPage(WebDriver driver) {
		this.driver = driver;
	}

	private By emailAddressTextBox = By.id("user_email");
	private By sendMeInstructionButton = By.name("commit");
	
	public WebElement getEmailAddressTextBox() {
		return driver.findElement(emailAddressTextBox);
	}
	
	public WebElement getsendMeInstructionButton()
	{
		return driver.findElement(sendMeInstructionButton);
	}
}

