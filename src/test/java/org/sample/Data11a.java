package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Data11a extends Baseclass {
	
	@Test(groups="Chennai")
	public void t11() {
		WebElement log = driver.findElement(By.name("login"));
		log.click();

	}
	@Test(groups="coimbatore")
	public void t22() {
		System.out.println("case22");
		
	}

	
	
	
	
	
	
	

}
