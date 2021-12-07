package ProTrainingTech.AutomationTraining;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class demo {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\ChromeDriver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.papajohns.com/");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
	  
       
         
         
	   
   
          
             
    
    
			}
	
       
       
       
       
       
       
}



