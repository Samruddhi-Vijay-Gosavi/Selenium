package Test_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guest_Checkout_Page {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("driver.chrome.driver", "C:\\Users\\samru\\Desktop\\\\Selenium\\chrome-win64_new\\chrome-win64\\chrome.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		// Copy the url
		driver.get("https://paschachocolate.com/");
		
		Thread.sleep(4000);
		
		// Copy the url of the Product page
		driver.get("https://paschachocolate.com/collections/dark-chocolate-bars");
		
		Thread.sleep(4000);
		
		//Click on the specific product
		driver.findElement(By.xpath("//*[@id=\"product-30175309627449\"]/div[1]/div[2]")).click();
		
		Thread.sleep(4000);
		
		//Click on the Add to Cart button
		driver.findElement(By.xpath("//*[@id=\"product_form_4102541901881\"]/div[4]/div[1]/button")).click();
		
		Thread.sleep(4000);
		
		//Click on the Checkout pop up button after clicking on the Add to Cart button
		driver.findElement(By.xpath("//*[@id=\"ajaxCheckoutBtn\"]")).click();
		
		Thread.sleep(4000);
		
		//After the Checkout page is opened copy the xpath of 'Log in' option on the Checkout page itself
        driver.get("https://paschachocolate.com/checkouts/cn/Z2NwLWFzaWEtc291dGhlYXN0MTowMUpFUUhFNkVQQ1o4MkZLQVA4RTA4VFpKUQ?_ga=2.21922098.804089623.1734449132-1787619712.1733808719");
        
        driver.findElement(By.xpath("//*[@id=\"Form1\"]/div[1]/div[1]/section/div[3]/div[1]/div/div/div[1]/a")).click();
        
		Thread.sleep(4000);
		
		//After clicking on 'Log in' option click on 'Continue as a guest' option
		driver.findElement(By.xpath("//*[@id=\"customer_login_guest\"]/input[3]")).click();
		
		Thread.sleep(4000);
		
		driver.quit();
		
		;
	
	

}

}
