package bloodBankToday;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.google.common.io.Files;

public class Blogs
{

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver", "C:\\Users\\likhi\\OneDrive\\Desktop\\Automation testing\\Browser extension\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//URL
		driver.get("https://bloodbanktoday.com/");
		
		driver.findElement(By.linkText("BLOGS")).click();
		Thread.sleep(5000);
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Thread.sleep(3000);
		
		js.executeScript("window.scrollBy(0,700)");
         Thread.sleep(3000);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		
	File s=	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(s, new File("C:\\Users\\likhi\\OneDrive\\Desktop\\Automation testing\\Screenshots\\blogs.jpg"));		
				
				
		
	}

}