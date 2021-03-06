package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import edu.emory.mathcs.backport.java.util.concurrent.TimeUnit;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class loginStepDefinition {
	
	WebDriver driver;
	
	@Given("^User is already on login page$")
	public void user_already_on_login_page() {
		String chromedriverPath = "/usr/local/bin/chromedriver";
		System.setProperty("webdriver.chrome.driver", chromedriverPath);
		
		//ChromeOptions
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
		options.addArguments("--no-sandbox");
		options.addArguments("--disable-setuid-sandbox");
		options.addArguments("--headless");
		options.addArguments("--disable-extensions");
		//options.addArguments("start-maximized"); // open Browser in maximized mode
		//options.addArguments("disable-infobars"); // disabling infobars
		//options.addArguments("--disable-extensions"); // disabling extensions
		//options.addArguments("--disable-gpu"); // applicable to windows os only
		
		driver = new ChromeDriver(options);
		driver.get("https://ui.freecrm.com/");
	}
	
	@When("^Title of login page is Free CRM$")
	public void title_of_login_page_is_Free_CRM() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Cogmento CRM", title);
	}
	
	@Then("^User enters username and password$")
	public void User_enters_username_and_password() {
	    driver.findElement(By.name("email")).sendKeys("ambaganmtfd@yahoo.com");
	    driver.findElement(By.name("password")).sendKeys("Failproof1!2@");
	}
	
	@Then("^User clicks on login button$")
	public void User_clicks_on_login_button() {
		WebElement loginBtn = driver.findElement(By.xpath("//div[contains(@class, 'ui fluid large blue submit button')]"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", loginBtn);
	}
	
	@Then("^User is on home page$")
	public void User_is_on_home_page() {
		String homePageTitle = driver.getTitle();
		System.out.println("Home Page: " + homePageTitle);
		System.out.println("You have successfully logged into this website through automation framework");
		Assert.assertEquals("Cogmento CRM", homePageTitle);
	}
	
	@Then("^Close the browser$")
	public void Close_the_browser() throws InterruptedException {
		System.out.println("Executed all scenarios");
		System.out.println("Closing the browser now...");
		//TimeUnit.SECONDS.sleep(5);
		//driver.quit();
	}
}
