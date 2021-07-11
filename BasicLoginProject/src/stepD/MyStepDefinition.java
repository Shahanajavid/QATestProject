package stepD;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;

import java.util.concurrent.TimeUnit;

import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Cucumber.class)
public class MyStepDefinition {

	WebDriver driver;

	@Given("^user open crome browser and  navigate to the website QA experience page$")
	public void user_open_crome_browser_and_navigate_to_the_website_qa_experience_page() throws Throwable {
	

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shaha\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://login.dev.qa-experience.com");

		System.out.println("user open crome browser and  navigate to the website QA experience page");
	}

	@When("^user logs in through Login link by using username and password$")
	public void user_logs_in_through_login_link_by_using_username_and_password() throws Throwable {

		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//input[@name=\"loginUsername\"]")).sendKeys("test@qa-experience.com");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@name=\"loginPassword\"]")).sendKeys("Password1");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		System.out.println("user logs in through Login link by using username and password");
	}

	@Then("^login must be successful$")
	public void login_must_be_successful() throws Throwable {
	
		driver.findElement(By.xpath("//button[@routerlink=\"/logged-in\"]")).click();
		System.out.println("login must be successful by clicking submit Button");
	}

}