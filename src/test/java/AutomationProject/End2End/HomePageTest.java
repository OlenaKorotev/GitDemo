package AutomationProject.End2End;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import resources.base;


public class HomePageTest extends base {
	public WebDriver driver;
	private static Logger log = LogManager.getLogger(HomePageTest.class.getName());
	@BeforeMethod
	public void initialize() throws IOException {
		driver = initializerDriver();
		log.info("Diver is initialized");
	
	}
    
    @Test(dataProvider="getData")
    public void basePageNavigation(String userName, String password)
    {
        driver.get(prop.getProperty("url"));
       LandingPage lp= new LandingPage(driver);
       LoginPage loginPage = lp.userClicksLoginLink();
       loginPage.getEmailTextBox().sendKeys(userName);
       loginPage.getPasswordTextBox().sendKeys(password);
       loginPage.getloginButton().click();
       ForgotPasswordPage forgotPasswordPage = loginPage.userCklicksForgotPasswordLink();
       forgotPasswordPage.getEmailAddressTextBox().sendKeys("xxx");
       forgotPasswordPage.getsendMeInstructionButton().click();
    }
    
    @DataProvider
    public Object[][] getData() {
    	//Row stands for how many different data types test should run
    	//Column stands for many values per each test
    	Object[][] data = new Object[2][2];
    	data[0][0] = "nonrestricteduser@qw.com";
    	data[0][1] = "123456";
    	data[1][0] = "restricteduser@qw.com";
    	data[1][1] = "45678";
    	
    	return data;
    }
    
    @AfterMethod
	public void tearDown() {
		driver.close();	}
}
