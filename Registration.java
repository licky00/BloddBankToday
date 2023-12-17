package bloodBankToday;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Registration{
	public static void main(String[] args) throws InterruptedException 
	{
		Select s;                            
		System.setProperty("webdriver", "C:\\Users\\likhi\\OneDrive\\Desktop\\Automation testing\\Browser extension\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//URL
		driver.get("https://bloodbanktoday.com/");
		Thread.sleep(2000);
		
		//Registration Button
		driver.findElement(By.linkText("REGISTER")).click();
		Thread.sleep(2000);
		
		//First Name
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtName")).sendKeys("ganesh");
		Thread.sleep(2000);
		
		//Email
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtEmail")).sendKeys("ganesh@gmail.com");
		Thread.sleep(2000);
		
		//Mobile Number
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtMobile")).sendKeys("6309583751");
		Thread.sleep(2000);
		
		//Create PassWord
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtLoginPassword")).sendKeys("345678");
		Thread.sleep(2000);
		
		//BloodGroup
		driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_cboBloodGroup-button\"]/span[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("ui-id-5")).click();
		Thread.sleep(3000);
			
		//Gender as Male
		driver.findElement(By.xpath("//span[@id=\"ctl00_ContentPlaceHolder1_cboGender-button\"]")).click();
		driver.findElement(By.xpath("//div[@id=\"ui-id-10\"]")).click();
		Thread.sleep(2000);
		
		//BirthDate as 12
		s=new Select(driver.findElement(By.xpath("//select[@id=\"ctl00_ContentPlaceHolder1_cboDobDay\"]")));
		s.selectByIndex(11); 
		Thread.sleep(2000);
		
		
		//BirthMonth as September
		s=new Select(driver.findElement(By.xpath("//select[@id=\"ctl00_ContentPlaceHolder1_cboDobMonth\"]")));
		s.selectByIndex(3); 
		Thread.sleep(2000);
		 
		//BirthYear as 1997  
		s=new Select(driver.findElement(By.xpath("//select[@id=\"ctl00_ContentPlaceHolder1_cboDobYear\"]")));
		s.selectByIndex(4); 
		Thread.sleep(2000);
		 
		//Weight as 66
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtWeight")).sendKeys("66"); 
		Thread.sleep(2000);
		
	    //Donation Date >> Day 
		s=new Select((driver.findElement(By.xpath("//select[@id=\"ctl00_ContentPlaceHolder1_cboLastDay\"]"))));
		s.selectByIndex(5); Thread.sleep(2000);
		
		//Donation Date >> Month 
		s=new Select((driver.findElement(By.xpath("//select[@id=\"ctl00_ContentPlaceHolder1_cboLastMonth\"]"))));
		s.selectByIndex(7); 
		Thread.sleep(2000);
		 
		//Donation Date >> Year 
		s=new Select((driver.findElement(By.xpath("//select[@id=\"ctl00_ContentPlaceHolder1_cboLastYear\"]"))));
		s.selectByIndex(2);
		Thread.sleep(2000);
		
		
		//PinCode
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtPinCode")).sendKeys("535525");
		Thread.sleep(2000);
		
		//Select State as andhrapradesh
		s=new Select((driver.findElement(By.xpath("//select[@id=\"ctl00_ContentPlaceHolder1_cboState\"]"))));
		s.selectByVisibleText("Andhra Pradesh");
		Thread.sleep(2000);
		
		
		//Select District as viskhapatnam
		s=new Select((driver.findElement(By.xpath("//select[@id=\"ctl00_ContentPlaceHolder1_cboCity\"]"))));
		s.selectByVisibleText("Visakhapatnam");
		Thread.sleep(2000);
		
		//Select Tehsil as gajuwaka
		s=new Select((driver.findElement(By.xpath("//select[@id=\"ctl00_ContentPlaceHolder1_cboTeh\"]"))));
		s.selectByVisibleText("Gajuwaka");
		Thread.sleep(2000);
		
		//Enter City  
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtAddress")).sendKeys("viskhapathanam");
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_chkTerms']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
}
