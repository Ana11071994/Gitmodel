package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
// 15
public class Data15 extends Baseclass {
@BeforeClass
private void bef() {
chromebrowser();
driver.get(" https://mail.google.com/");
maximize();
}
@Test(dataProvider="Authentication")
private void test(String user, String pass) {
	WebElement userid = driver.findElement(By.id("identifierId"));
	fillbox(userid, user);
	
	WebElement nextbtn = driver.findElement(By.xpath("(//span[@jsname='V67aGc'])[2]"));
	nextbtn.click();
	
	WebElement passwd = driver.findElement(By.xpath("//input[@type='password']"));
	fillbox(passwd, pass);

}
@DataProvider(name="Authentication")
private Object[][] credentials() {
	return new Object[][] {
		{"ana@123","ana"},
		{"anand@123","anand"}
		
		
		
		
	};
	

}

	
	

}
