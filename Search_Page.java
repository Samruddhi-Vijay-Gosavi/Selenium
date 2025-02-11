package Test_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Search_Page {
	
public static void main(String[] args) throws InterruptedException {
		
        System.setProperty("driver.chrome.driver", "C:\\Users\\samru\\Desktop\\\\Selenium\\chrome-win64_new\\chrome-win64\\chrome.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://paschachocolate.com/");
		
		Thread.sleep(3000);
		
        WebElement sp = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div[1]/form/input[1]"));
        
        Actions a = new Actions(driver);
        
        a.moveToElement(sp).sendKeys("Dark Chocolate" + Keys.ENTER).perform();
        
		Thread.sleep(4000);
		
		driver.quit();
		
		
		
		

}


}