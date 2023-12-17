package bloodBankToday;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateBackAndForward {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver", "C:\\Users\\likhi\\OneDrive\\Desktop\\Automation testing\\Browser extension\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//URL
		driver.get("https://bloodbanktoday.com/");
		
		driver.findElement(By.linkText("MORE")).click();
		Thread.sleep(3000);
		
		
		driver.findElement(By.linkText("Donations")).click();
		Thread.sleep(7000);
		
		driver.navigate().back();
		//driver.navigate().forward()
		
		
		
	
		
		
	}

}