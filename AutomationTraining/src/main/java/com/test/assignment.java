package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class assignment {
	WebDriver driver = null;

	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		// driver.manage().deleteAllCookies();
	}

	@Test(priority = 1)
	public void FacebookLogin() {

		driver.findElement(By.id("email")).sendKeys("jklhjkhjnj");
		driver.findElement(By.id("pass")).sendKeys("jkhjkhjk");
		driver.findElement(By.name("login")).click();
	}

	@Test(priority = 2)
	public void forgotpassword() {

		driver.findElement(By.linkText("Forgot password?")).click();
		driver.findElement(By.linkText("Cancel")).click();
	}

	@Test(priority = 3)
	public void createAccount() throws InterruptedException {
		driver.findElement(By.linkText("Forgot password?")).click();
		driver.findElement(By.linkText("Cancel")).click();
		driver.findElement(By.linkText("Create new account")).click();
		WebElement firstName = driver.findElement(By.name("firstname"));
		firstName.click();
		firstName.sendKeys("imran");
		WebElement lastName = driver.findElement(By.name("lastname"));
		lastName.click();
		lastName.sendKeys("jamil");
		WebElement mobilNo = driver.findElement(By.name("reg_email__"));
		mobilNo.click();
		mobilNo.sendKeys("123345678");
		WebElement password = driver.findElement(By.id("password_step_input"));
		password.click();
		password.sendKeys("jkjjnljklk");
		WebElement month = driver.findElement(By.id("month"));

		Select select = new Select(month);
		select.selectByVisibleText("Dec");

		WebElement day = driver.findElement(By.id("day"));
		Select selectday = new Select(day);
		selectday.selectByVisibleText("15");

		WebElement year = driver.findElement(By.id("year"));
		Select selectyear = new Select(year);
		selectyear.selectByVisibleText("1990");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//label[@class='_58mt'])[2]")).click();
		driver.findElement(By.linkText("Already have an account?")).click();

	}

	@AfterMethod
	public void teardown() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();

	}

}
