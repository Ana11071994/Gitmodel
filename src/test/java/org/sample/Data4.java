package org.sample;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
//4
public class Data4 extends Baseclass {
	PojoFlip p;
	SoftAssert s;
	@BeforeClass
	private void bef() {
		chromebrowser();
		geturl(" https://www.flipkart.com/account/login");
		maximize();
		}
	@Test
	private void t3() {
		WebElement log = p.getLog();
		log.click();
	}
	
	
	@Test(priority=-10)
	private void t1() throws IOException {
		p=new PojoFlip();
		WebElement user = p.getUser();
		fillbox(user,readexcelsheet5(0, 1));
		WebElement passwd = p.getPasswd();
		fillbox(passwd,readexcelsheet5(1, 1));
		}
	@Test(priority=-30)
	private void t2() {
		s= new SoftAssert();
		String title = driver.getTitle();
		s.assertTrue(title.contains("Flipkart"),"checktitle");
		String Url = driver.getCurrentUrl();
		System.out.println(Url);

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
