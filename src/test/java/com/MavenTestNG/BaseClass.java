package com.MavenTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BaseClass {

	WebDriver driver;
	@Test
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.quit();
		
	}
	@Test
	public void startup() {
		
		
		Assert.assertEquals(12,12);
	}
}
