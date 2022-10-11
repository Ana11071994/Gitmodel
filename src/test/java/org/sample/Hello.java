package org.sample;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Hello {
	@Test
	public void tc1() {
		System.out.println("tc1");

	}
	@Test
	public void tc2() {
		System.out.println("tc2");
		Assert.assertTrue(false);

	}

}
