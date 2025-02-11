package Test_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCart {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("driver.chrome.driver", "C:\\Users\\samru\\Desktop\\Selenium\\chrome-win64_new\\chrome-win64\\chrome.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://paschachocolate.com/collections/dark-chocolate-bars/products/85-cacao-dark-chocolate-2-8-oz-bar?variant=18834888097849");
		
		Thread.sleep(7000);
		
		driver.findElement(By.xpath("//*[@id=\"product_form_2082608676921\"]/div[4]/div[1]/button")).click();
		
		Thread.sleep(7000);
		
		driver.quit();
		}

}
