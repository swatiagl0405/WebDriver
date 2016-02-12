package webdriverMaven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class loginTest {

	public static WebDriver driver;
	
	
	@BeforeSuite
	public void setUp(){
		
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
		
	}
	
	@Test
	public void doLogin(){
		
		driver.get("http://gmail.com");
		driver.findElement(By.id("Email")).sendKeys("swati.iet@gmail.com");
		driver.findElement(By.id("next")).click();
		driver.findElement(By.id("Passwd")).sendKeys("snaponswat123");
		driver.findElement(By.id("signIn")).click();
	}
	
	@AfterSuite
	public void tearDown(){
		
		driver.quit();
	}
}
