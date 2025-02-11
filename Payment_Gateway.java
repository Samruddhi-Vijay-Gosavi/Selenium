package Test_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Payment_Gateway {
	
public static void main(String[] args) throws InterruptedException {
		
        System.setProperty("driver.chrome.driver", "C:\\Users\\samru\\Desktop\\\\Selenium\\chrome-win64_new\\chrome-win64\\chrome.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://paschachocolate.com/checkouts/cn/Z2NwLXVzLWNlbnRyYWwxOjAxSkc2N0U0OEVXM1YyMEZYMjBCTjVXMjRN");
		
		driver.findElement(By.xpath("//*[@id=\"number\"]")).sendKeys("1234 5678 9112");
		
		driver.findElement(By.xpath("//*[@id=\"expiry\"]")).sendKeys("12/24");
		
		driver.findElement(By.xpath("//*[@id=\"checkout-pay-button\"]")).click();
		
		Thread.sleep(3000);
		
		driver.quit();
		

}

}
