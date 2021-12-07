package com.test;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver;
 import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class test {
	WebDriver driver = null;

	@BeforeMethod
	public void LanchBrowser() {
		 System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\ChromeDriver\\chromedriver.exe");
		  driver = new ChromeDriver();	
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	}
	@Test(priority = 1 ,groups = "ist")
	public void login() {
   driver.findElement(By.id("email")).sendKeys("hkhj");
   driver.findElement(By.id("pass")).click();
   driver.findElement(By.id("pass")).sendKeys("jhgjhg");
   driver.findElement(By.xpath("//*[@name='login']")).click();
		
	} 
	@Test(priority= 2 ,groups = "2nd")
	public void GetTittle() {
System.out.println(driver.findElements(By.tagName("a")).size());
		
	}
	@Test(priority = 3 ,groups = "3rd")
	public void isDisplayed() {
		 driver.findElement(By.id("email")).isDisplayed();
	}
	@Test()
	public void IsSelected() {
		 driver.findElement(By.id("email")).isSelected();
		
	}
	
  @AfterMethod
  public void teardown() {
	  driver.close();
	 
  }
	
	}
	

