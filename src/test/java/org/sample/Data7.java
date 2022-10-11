package org.sample;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
// 8
public class Data7 extends Baseclass{
	 SoftAssert s;
	@Test
	private void tc1() {
		chromebrowser();
		geturl(" http://www.greenstechnologys.com/");
		maximize();

	}
	@Test
	private void tc2() {
		s = new SoftAssert();
		String title = driver.getTitle();
		s.assertTrue(title.contains("Greens Technologys"),"checktitle");
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
	} 
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
