package login.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FBLogin {

	static WebDriver driver;
	
	@BeforeClass
	public static void browserLaunch() {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\user4\\eclipse-workspace\\TestNG\\Driver\\chromedriver.exe");
	driver = new ChromeDriver();
	
	
}
		
	@Test(priority=-4)
	private void correctUserPass() throws InterruptedException {
		driver.get("https://www.facebook.com/");
		WebElement user = driver.findElement(By.id("email"));
		
		
		
		
		user.sendKeys("rajeshsv.1987@gmail.com");
		
		WebElement pass = driver.findElement(By.id("pass"));
	
		pass.sendKeys("Kutty@5924");
	
		WebElement click = driver.findElement(By.id("u_0_b"));
		
		click.click();
		
		Thread.sleep(5000);
	}
	@Test(priority=-3)
private void correctUser() throws InterruptedException {
		driver.get("https://www.facebook.com/");
		WebElement user = driver.findElement(By.id("email"));
		
		user.sendKeys("rajeshsv.1987@gmail.com");
		
		WebElement pass = driver.findElement(By.id("pass"));
	
		pass.sendKeys("5924");
	
		WebElement click = driver.findElement(By.id("u_0_b"));
		
		click.click();
		Thread.sleep(5000);
	}
	@Test(priority=-2)
private void correctPass() throws InterruptedException {
		driver.get("https://www.facebook.com/");
	WebElement user = driver.findElement(By.id("email"));
	
	user.sendKeys("wronguser");
	
	WebElement pass = driver.findElement(By.id("pass"));

	pass.sendKeys("Kutty@5924");

	WebElement click = driver.findElement(By.id("u_0_b"));
}
	}
