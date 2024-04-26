package JenkinsgitLearn.JenkinsgitLearn;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class OpenbrowserGit {
	
	@Test
	public void login() throws InterruptedException
	{
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		Thread.sleep(3000);
		driver.findElement(By.id("username")).sendKeys("student");
		Thread.sleep(3000);
		String  paramValue = System.getProperty("choice");
		System.out.println(paramValue);
		driver.findElement(By.id("password")).sendKeys(paramValue);
		Thread.sleep(5000);
		driver.findElement(By.id("submit")).click();
	
	}
	
  
}
