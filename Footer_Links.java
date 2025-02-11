package Test_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Footer_Links {
	
	public static void main(String[] args) throws InterruptedException  {
		
		System.setProperty("driver.chrome.driver", "C:\\Users\\samru\\Desktop\\Selenium\\chrome-win64_new\\chrome-win64\\chrome.exe");
				
				WebDriver driver = new ChromeDriver();
				
				driver.manage().window().maximize();
				
				driver.get("https://paschachocolate.com/");
				
				JavascriptExecutor fl = (JavascriptExecutor) driver;
				fl.executeScript("window.scrollTo(0, document.body.scrollHeight)");
				
			  driver.get("https://paschachocolate.com/pages/shipping-policy");
			  
			  Thread.sleep(3000);
			  
			  driver.get("https://paschachocolate.com/pages/terms-conditions");
			  
			  Thread.sleep(3000);
			  
			   //Thread.sleep(4000);
			    
				//Thread.sleep(4000);
				
				driver.quit();
}

}
