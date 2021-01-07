package stepdef;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.Fallers;
import pages.Overview;
import pages.Risers;

public class FtseTest {
	
	private static WebDriver driver;
	
	@Before
	public void init() {
		System.setProperty("webdriver.chrome.driver", 
				"src/test/resources/drivers/chromedriver.exe");
		ChromeOptions cOptions = new ChromeOptions();
		cOptions.setHeadless(false);
		driver = new ChromeDriver(cOptions);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}
	
	@After
	public void cleanup() {
		driver.quit();
	}
	
	@Given("^The correct address$")
	public void the_correct_address() {
		driver.get(Overview.URL);
		assertEquals(Overview.URL, driver.getCurrentUrl());
	}

	@When("^I navigate to the risers page$")
	public void i_navigate_to_the_risers_page() {
		Overview mOverview = PageFactory.initElements(driver, Overview.class);
		mOverview.acceptCooke();
		mOverview.navRisers();
		assertEquals(Risers.URL, driver.getCurrentUrl());
	}

	@Then("^I can view the top riser$")
	public void i_can_view_the_top_riser() {
		Risers risers = PageFactory.initElements(driver, Risers.class);
		System.out.println(risers.getTopRiser());
	}

	@When("^I navigate to the falers page$")
	public void i_navigate_to_the_falers_page() {
		Overview mOverview = PageFactory.initElements(driver, Overview.class);
		mOverview.acceptCooke();
		mOverview.navFallers();
		assertEquals(Fallers.URL, driver.getCurrentUrl());
	}

	@Then("^I can view the top faller$")
	public void i_can_view_the_top_faller() {
		Fallers fallers = PageFactory.initElements(driver, Fallers.class);
		System.out.println(fallers.getTopFaller());
	}
}
