package Test_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_URL {
	
	public static void main(String[] args) {
		
		System.setProperty("driver.chrome.driver", "C:\\Users\\samru\\Desktop\\Selenium\\chrome-win64_new\\chrome-win64\\chrome.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://paschachocolate.com/");
		
		//driver.close();
		
		driver.quit();
	}

}
