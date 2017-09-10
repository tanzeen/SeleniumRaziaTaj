package sits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class homework1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//step1: open Firefox web browser
		System.setProperty("webdriver.gecko.driver", "C:\\sits\\selenium3.0\\geckodriver.exe");
		
		WebDriver driver; 
	
		driver= new FirefoxDriver();
		
		//step2: open newtours.demout.com
		
		driver.get("http://newtours.demoaut.com/");
		Thread.sleep(3000);
	    String title;
		title = driver.getTitle();
		System.out.println("The title is :"+driver.getTitle());
		
		//step3: click on register
		
		driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a")).click();
		
		driver.findElement(By.name("firstName")).sendKeys("Raz");
		
		driver.findElement(By.name("lastName")).sendKeys("Zmn");
		
		driver.findElement(By.name("phone")).sendKeys("1239082754");
		
		driver.findElement(By.name("userName")).sendKeys("fcps@yahoo.co");
		
		driver.findElement(By.name("address1")).sendKeys("2242 astoria cir");
		
		driver.findElement(By.name("city")).sendKeys("herndon");
		
		driver.findElement(By.name("state")).sendKeys("virginia");
		
		driver.findElement(By.name("postalCode")).sendKeys("20170");
		
		driver.findElement(By.name("email")).sendKeys("rzmn");
		
		driver.findElement(By.name("password")).sendKeys("666666");
		
		driver.findElement(By.name("confirmPassword")).sendKeys("666666");
		
		driver.findElement(By.name("register")).click();
		Thread.sleep(5000);
		if(driver.getPageSource().contains("Thank you for registering"))
		{
			
			System.out.println("Test case passed");
		}
			else	
			{
				System.out.println("Test case Failed");
				
			}
		
		
	driver.close();	
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
		
		
		
	}

}
