package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
//1
public class Data extends Baseclass {
	SoftAssert s;
	@BeforeClass
	private void bef() {
	chromebrowser();
	geturl(" https://www.facebook.com/");
	maximize();
}
	@Test(priority=0,enabled=false)
	private void t1() {
		System.out.println("case");
	}
	@Test
	private void t2() {
		s=new SoftAssert();
		String title = driver.getTitle();
		s.assertTrue(title.contains("Facebook"), "check title");
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		s.assertAll();

	}
	@Test(priority=-5,invocationCount=3)
	private void t3() {
		System.out.println("case1");

	}
	@Test(priority=-20)
	private void t4() {
		System.out.println("case2");

	}
	@Test
	private void t5() {
		s= new SoftAssert();
		WebElement user = driver.findElement(By.id("email"));
		fillbox(user, "ana@123");
		s.assertEquals(user.getAttribute("value"), "ana@123");
		WebElement passwd = driver.findElement(By.id("pass"));
		fillbox(passwd, "123456");
		s.assertEquals(passwd.getAttribute("value"), "123456");
		WebElement log = driver.findElement(By.name("login"));
		log.click();
		s.assertAll();
		

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
