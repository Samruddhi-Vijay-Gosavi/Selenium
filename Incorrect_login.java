package Test_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Incorrect_login {
	
public static void main(String[] args) throws InterruptedException {
		
        System.setProperty("driver.chrome.driver", "C:\\Users\\samru\\Desktop\\Selenium\\chrome-win64_new\\chrome-win64\\chrome.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://paschachocolate.com/account/login?return_url=%2Faccount");
		
		driver.findElement(By.name("customer[email]")).sendKeys("gosavisamu007@gmail.com");
		
		driver.findElement(By.id("customer_password")).sendKeys("1234");
		
		driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[4]/input")).click();
		
		Thread.sleep(3000);
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		//Thread.sleep(5000);
		
		//driver.quit();


}
}

