package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.internal.GroupsHelper;
// 11
public class Data11 extends Baseclass {
	
	@Test(groups="coimbatore")
	public void t1() {
		chromebrowser();
		geturl("https://www.facebook.com/");
		maximize();
		
	}
	@Test(groups="Chennai")
	public void t2() {
		WebElement user = driver.findElement(By.xpath("//input[@type='text']"));
		fillbox(user, "ana@123");
	}
	@Test(groups="trichy")
	public void t3() {
		WebElement passwd = driver.findElement(By.xpath("//input[@type='password']"));
		fillbox(passwd, "123456");
		
		

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
