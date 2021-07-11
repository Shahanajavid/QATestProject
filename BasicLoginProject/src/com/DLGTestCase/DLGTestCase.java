package com.DLGTestCase;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class DLGTestCase {

	public WebDriver driver = null;
	public String baseURL = "https://login.dev.qa-experience.com";
	final String UserNameValues = "//input[@name=\"loginUsername\"]";
	final String PaswordValue = "//input[@name=\"loginPassword\"]";
	final String LoginButton = "//button[@routerlink=\"/logged-in\"]";

	@Test(groups = { "bonding", "strong_ties", })
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\shaha\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get(baseURL);

	}

	@Test

	public void navigateQALoginPage() {

		String expectedLink = "https://login.dev.qa-experience.com/login";
		String actualLink = driver.getCurrentUrl();
		Assert.assertEquals(actualLink, expectedLink);

	}

	@Test(groups = { "bonding", "strong_ties" })
	public void loginWithUsernamePasword() {
		driver.findElement(By.xpath(UserNameValues)).sendKeys("test@qa-experience.com");
		driver.findElement(By.xpath(PaswordValue)).sendKeys("Password1");
		driver.findElement(By.xpath(LoginButton)).click();
	}
	
	
}
