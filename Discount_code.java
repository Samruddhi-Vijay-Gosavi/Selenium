package Test_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Discount_code {
	
public static void main(String[] args) throws InterruptedException {
		
        System.setProperty("driver.chrome.driver", "C:\\Users\\samru\\Desktop\\Selenium\\chrome-win64_new\\chrome-win64\\chrome.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
        driver.get("https://paschachocolate.com/checkouts/cn/Z2NwLWFzaWEtc291dGhlYXN0MTowMUpFUUhFNkVQQ1o4MkZLQVA4RTA4VFpKUQ");
		
        driver.findElement(By.name("reductions")).sendKeys("SAVE10");
		
        driver.findElement(By.xpath("//*[@id=\"Form0\"]/div[1]/div/button")).click();
        
		Thread.sleep(4000);
		
		driver.quit();
		
		

}

}
