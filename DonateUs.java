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

public class DonateUs {

	public static void main(String[] args) throws InterruptedException, IOException {
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
		
		driver.findElement(By.linkText("DONATE NOW")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtAmount")).sendKeys("1000");
		Thread.sleep(2000);
		
		
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtName")).sendKeys("likhitha");
		Thread.sleep(2000);
		
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtEmail")).sendKeys("likhitha@gmail.com");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtMobile")).sendKeys("6300199859");
		Thread.sleep(2000);
		
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtCountry")).sendKeys("India");
		Thread.sleep(2000);
		
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtState")).sendKeys("Andhra pradesh");
		Thread.sleep(3000);
		
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtCity")).sendKeys("chirala");
		Thread.sleep(2000);
		
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtPinCode")).sendKeys("523157");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_txtAddress\"]")).sendKeys("chirala");
		Thread.sleep(2000);
		
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_cboDisplayType-button")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("ui-id-2")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_btnSave")).click();
		Thread.sleep(4000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Thread.sleep(3000);
		
		js.executeScript("window.scrollBy(0,700)");
         Thread.sleep(3000);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		
	File s=	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(s, new File("C:\\Users\\likhi\\OneDrive\\Desktop\\Automation testing\\Screenshots\\donate us.jpg"));		
				
		
		
	}

}