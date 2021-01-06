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

public class ValidateTitleTest extends base {
	public WebDriver driver;
	private static Logger log = LogManager.getLogger(ValidateTitleTest.class.getName());
	LandingPage lp;

	@BeforeTest
	public void initialize() throws IOException {
		driver = initializerDriver();
		log.info("Diver is initialized");
		driver.get(prop.getProperty("url"));
		lp = new LandingPage(driver);
	}

	@Test
	public void ValidateTitle() {
		String text = lp.getcoursesTitle().getText();
		Assert.assertEquals(text, "FEATURED COURSES123");
		log.info("Successfully validated Text message");
	}

	@Test
	public void ValidateHeader() {
		String text = lp.getHeader().getText();
		Assert.assertEquals(text, "AN ACADEMY TO LEARN EVERYTHING ABOUT TESTING");
		log.info("Successfully validated Text message");
	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}

}
