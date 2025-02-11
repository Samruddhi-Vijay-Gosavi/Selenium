package Test_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Item_Cart_page {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("driver.chrome.driver", "C:\\Users\\samru\\Desktop\\\\Selenium\\chrome-win64_new\\chrome-win64\\chrome.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		// Open the url
		driver.get("https://paschachocolate.com/");
		
		Thread.sleep(4000);
		
		// Navigate to the Dark Chocolate Chips collection page
		driver.get("https://paschachocolate.com/collections/dark-chocolate-chips");
		
		Thread.sleep(4000);
		
		// Locate and click on the product
		driver.findElement(By.xpath("//*[@id=\"product-8208116416569\"]/div[1]/div[2]")).click();
		
		Thread.sleep(4000);
		
		// Locate and click the "+" button to increase quantity
		WebElement plusButton = driver.findElement(By.xpath("//*[@id=\"product_form_798018273337\"]/div[3]/span[2]/svg"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();",plusButton);
		
		Thread.sleep(4000);
		
		// Click the "Add to Cart" button
		driver.findElement(By.xpath("//*[@id=\"product_form_798018273337\"]/div[4]/div[1]/button")).click();
	    Thread.sleep(4000);
	    
	    // Close the browser
	    driver.quit();
		
		
	}

}
