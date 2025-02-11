package Test_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Contact_Us {
	
	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("driver.chrome.driver", "C:\\Users\\samru\\Desktop\\Selenium\\chrome-win64_new\\chrome-win64\\chrome.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://paschachocolate.com/pages/contact-us");
		
		Thread.sleep(3000);
		
		driver.findElement(By.name("contact[full-name]")).sendKeys("Samruddhi Vijay Gosavi");
		
		driver.findElement(By.name("contact[email]")).sendKeys("samruddhi.vgosavi@gmail.com");
		
		driver.findElement(By.name("contact[body]")).sendKeys("Hello PaschaChocolate, I really loved all your chocolates flavour and I am your customer since 5 years. I really appreciate your work for providing such a good quality and healthy chocolates.");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"Form-page-contact-5\"]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"contact-us-page\"]/div[7]/input")).click();
		
		Thread.sleep(3000);
		
		driver.quit();
	}

}
