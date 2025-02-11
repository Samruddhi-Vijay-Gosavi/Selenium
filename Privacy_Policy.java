package Test_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Privacy_Policy {
	
public static void main(String[] args) throws InterruptedException  {
		
		System.setProperty("driver.chrome.driver", "C:\\Users\\samru\\Desktop\\Selenium\\chrome-win64_new\\chrome-win64\\chrome.exe");
				
				WebDriver driver = new ChromeDriver();
				
				driver.manage().window().maximize();
				
				// to launch the url
				driver.get("https://paschachocolate.com/");
				
				// to scroll till bottom of the page
				JavascriptExecutor py = (JavascriptExecutor) driver;
				py.executeScript("window.scrollTo(0, document.body.scrollHeight)");
				
				// enter the url of the 'Privacy Policy' page or any other
                driver.get("https://paschachocolate.com/pages/privacy-policy");
				
				Thread.sleep(3000);
				
				driver.close();

}

}
