package Test_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_function2 {
	

	public static void main(String[] args) throws InterruptedException {
		
        System.setProperty("driver.chrome.driver", "C:\\Users\\samru\\Desktop\\\\Selenium\\chrome-win64_new\\chrome-win64\\chrome.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://paschachocolate.com/");
		
		Thread.sleep(4000);
		
		driver.get("https://paschachocolate.com/account/login?return_url=%2Faccount");
		
		Thread.sleep(4000);
		
		driver.findElement(By.name("customer[email]")).sendKeys("samruddhi.vgosavi@gmail.com");
		
		Thread.sleep(4000);
		
		driver.findElement(By.id("customer_password")).sendKeys("Surekha@25");
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[4]/input")).click();
		
		Thread.sleep(4000);
		
		driver.quit();

}
	
}
