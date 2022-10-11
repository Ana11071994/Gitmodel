package org.sample;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
// 7
public class CrossBrowser extends Baseclass {
public WebDriver driver;
@Parameters({"browser"})
@Test
private void browsers(String browserName) {
	if (browserName.contains("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	else if (browserName.contains("ff")) {
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
	}
	
	else {
		WebDriverManager.edgedriver().setup();
		driver=new FirefoxDriver();
	}
	
	driver.get("https://www.flipkart.com/account/login");
	
	
}
	@Test
	private void credentials() {
		WebElement user = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		fillbox(user, "ana@123");
		WebElement passwd = driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']"));
		fillbox(passwd, "anand");
		WebElement log =driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		log.click();

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
