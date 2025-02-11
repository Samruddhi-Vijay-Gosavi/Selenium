package Test_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkout_Page {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("driver.chrome.driver", "C:\\Users\\samru\\Desktop\\\\Selenium\\chrome-win64_new\\chrome-win64\\chrome.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://paschachocolate.com/");
		
		Thread.sleep(4000);
		
		driver.get("https://paschachocolate.com/collections/dark-chocolate-chips");
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//*[@id=\"product-31810109702189\"]/div[1]/div[2]")).click();
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//*[@id=\"product_form_4478546870317\"]/div[4]/div[1]/button")).click();
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//*[@id=\"ajaxCheckoutBtn\"]")).click();
		
		Thread.sleep(4000);
		
		driver.quit();
		

}

}

