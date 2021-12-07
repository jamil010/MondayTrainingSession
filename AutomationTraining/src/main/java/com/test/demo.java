package com.test;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class demo {
	static WebDriver driver = null;
	
	public static void main(String[] args) throws InterruptedException {
		
	
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		List<WebElement> totaltag= driver.findElements(By.tagName("a"));
		System.out.println(totaltag.size());
		WebElement footer = driver.findElement(By.id("pageFooter"));
		System.out.println(footer.findElements(By.tagName("a")).size());
		WebElement footer1 = driver.findElement(By.id("pageFooterChildren"));
		System.out.println(footer1.findElements(By.tagName("a")).size());
		
  	  //Thread.sleep(2000);

	      for(int i= 1; i<footer1.findElements(By.tagName("a")).size(); i++) {
	    	  String clickAll = Keys.chord(Keys.CONTROL,Keys.ENTER);
	    	  footer1.findElements(By.tagName("a")).get(i).sendKeys(clickAll);
	    	  Thread.sleep(2000);
	      }
	    	Set<String> handles  = driver.getWindowHandles();
	    	 Iterator<String> it =    handles.iterator();
	    	 while(it.hasNext()) {
	    		 driver.switchTo().window(it.next());
	    		 System.out.println(driver.getTitle());
	   
          
          
          
         
	    	 }}	}
		  	
	
	
		
		
		
		
		
		
		
		
		


