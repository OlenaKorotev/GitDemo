package AutomationProject.End2End;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import resources.base;



public class ValidateNavigationBarTest extends base{
	public WebDriver driver;
	private static Logger log = LogManager.getLogger(ValidateNavigationBarTest.class.getName());
	@BeforeTest
	public void initialize() throws IOException {
		driver = initializerDriver();
		log.info("Diver is initialized");
		driver.get(prop.getProperty("url"));
	}

	@Test
	public void ValidateTitle () {
		LandingPage lp= new LandingPage(driver);
	    Assert.assertTrue(lp.getNavigationBar().isDisplayed());
	    log.info("Successfully validated Navagation Bar");
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();	}

}
