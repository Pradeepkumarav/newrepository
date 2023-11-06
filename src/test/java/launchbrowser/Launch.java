package launchbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
		            "D:\\Java related project\\chromedriver_win32 (1)\\chromedriver.exe");
		        // Instantiate a ChromeDriver class.
		
		  WebDriver driver = new ChromeDriver();
		  
		  driver.get("https://demo.guru99.com/test/newtours/register.php");
		  driver.findElement(By.id("userName")).sendKeys("pradeep");
		  driver.findElement(By.name("firstName")).sendKeys("kumara");
		  driver.findElement(By.linkText("REGISTER")).sendKeys("kumara");
		  
		  

	}

}
