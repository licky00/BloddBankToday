package bloodBankToday;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import com.google.common.io.Files;


public class Home 
{

	public static void main(String[] args) throws InterruptedException, IOException
	{
		
		
		System.setProperty("webdriver", "C:\\Users\\likhi\\OneDrive\\Desktop\\Automation testing\\Browser extension\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//URL
		driver.get("https://bloodbanktoday.com/");
		
		
		driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_cboBlood-button\"]/span[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("ui-id-4")).click();
		Thread.sleep(2000);
		
		Select s;
		s=new Select(driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_cboState\"]")));
		Thread.sleep(3000);
		s.selectByVisibleText("Andhra Pradesh");
		Thread.sleep(2000);
		
		
		s = new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_cboCity")));
		Thread.sleep(3000);
		s.selectByVisibleText("Prakasam");
		Thread.sleep(2000);
		
		s= new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_cboTeh")));
		Thread.sleep(3000);
		s.selectByVisibleText("Chirala");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_btnSave\"]")).click();
		

	     File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	     Files.copy(f, new File("C:\\Users\\likhi\\OneDrive\\Desktop\\Automation testing\\Screenshots\\home.jpg"));

		
		driver.close();
	}

	
	
}
