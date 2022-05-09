package com.example.demo2;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class ThirdTest {
	
	@Test(priority=1)
	public void lTest()  {
		System.out.println("ltest");
		assertTrue(5 < 41);
	}
	@Test(priority=2)
	public void mTest() {
		//assertEquals("hello method a".trim(),c2c.a().trim());
		System.out.println("mtest");
		assertFalse(5 > 41);
		
	}
	
	@Test(priority=3)
	public void kTest() {
		//assertEquals("hello method a".trim(),c2c.a().trim());
		System.out.println("ktest");
		assertFalse(5 > 41);
		
	}
	
}
