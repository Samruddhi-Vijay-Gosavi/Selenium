package Test_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Product_Page_Reviews {
	
public static void main(String[] args) throws InterruptedException  {
		
		System.setProperty("driver.chrome.driver", "C:\\Users\\samru\\Desktop\\Selenium\\chrome-win64_new\\chrome-win64\\chrome.exe");
				
				WebDriver driver = new ChromeDriver();
				
				driver.manage().window().maximize();
				
				driver.get("https://paschachocolate.com/");
				
				driver.get("https://paschachocolate.com/collections/dark-chocolate-bars");
				
				driver.findElement(By.xpath("//*[@id=\"product-19020809666617\"]/div[1]/div[2]")).click();
				
				JavascriptExecutor pr = (JavascriptExecutor) driver;
				pr.executeScript("window.scrollBy(0,1000)" );
				
				Thread.sleep(7000);
				
				driver.quit();

}


}