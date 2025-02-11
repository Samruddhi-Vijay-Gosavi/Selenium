package Test_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class News_Subscription {
		
		public static void main(String[] args) throws InterruptedException  {
			
			System.setProperty("driver.chrome.driver", "C:\\Users\\samru\\Desktop\\Selenium\\chrome-win64_new\\chrome-win64\\chrome.exe");
					
					WebDriver driver = new ChromeDriver();
					
					driver.manage().window().maximize();
					
					driver.get("https://paschachocolate.com/");
					
					driver.findElement(By.xpath("//*[@id=\"email_inputindex-newsletter\"]")).sendKeys("samruddhi.vgosavi@gmail.com");
					
				WebElement join_button = driver.findElement(By.xpath("//input[@id=\"subscribeindex-newsletter\"]"));
				
				//join_button.click();
				
				    Thread.sleep(2000);
				
				    driver.quit();
				
	}

}
