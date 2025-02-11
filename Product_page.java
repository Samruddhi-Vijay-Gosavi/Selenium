
package Test_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Product_page {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("driver.chrome.driver", "C:\\Users\\samru\\Desktop\\\\Selenium\\chrome-win64_new\\chrome-win64\\chrome.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://paschachocolate.com/");
		
		Thread.sleep(5000);
		
		driver.get("https://paschachocolate.com/collections/dark-chocolate-bars");
		
		Thread.sleep(5000);
		
		driver.get("https://paschachocolate.com/collections/dark-chocolate-bars/products/55-cacao-organic-dark-chocolate-2-8-oz-bar?variant=19020770934841");
		
		Thread.sleep(5000);
		
		driver.quit();
		
	}
}



		
		
	
	


