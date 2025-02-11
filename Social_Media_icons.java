package Test_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Social_Media_icons {
	
public static void main(String[] args) throws InterruptedException  {
		
		System.setProperty("driver.chrome.driver", "C:\\Users\\samru\\Desktop\\Selenium\\chrome-win64_new\\chrome-win64\\chrome.exe");
				
				WebDriver driver = new ChromeDriver();
				
				driver.manage().window().maximize();
				
				driver.get("https://paschachocolate.com/");
				
				JavascriptExecutor sm = (JavascriptExecutor) driver;
				sm.executeScript("window.scrollTo(0, document.body.scrollHeight)");
				
                 driver.get("https://www.instagram.com/pascha.chocolate/");
                 
                 Thread.sleep(3000);
                 
                 driver.get("https://www.youtube.com/c/PaschaChocolateOrganic");
				
                 Thread.sleep(3000);
                 
				//Thread.sleep(5000);
				
				driver.quit();

}

}

