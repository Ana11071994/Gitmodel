package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
// 14
public class Data14 extends Baseclass {
	@BeforeClass
	private void bef() {
	chromebrowser();
	geturl("https://mail.google.com/");
	maximize();

	}
	@Test
	private void test1() {
		String title = driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);
	}
	@Parameters({"Username","Password"})
	@Test
	private void test2(String user, String pass) {
		
		WebElement userid = driver.findElement(By.id("identifierId"));
		fillbox(userid, user);
		
		WebElement nextbtn = driver.findElement(By.xpath("(//span[@jsname='V67aGc'])[2]"));
		nextbtn.click();
		
		WebElement passwd = driver.findElement(By.xpath("//input[@type='password']"));
		fillbox(passwd, pass);
		
		
		
		
		
		

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
