package com.example.demo;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class SecondTest {
	@Test
	public void cTest() {
		//assertEquals("hello method a".trim(),c2c.a().trim());
		assertFalse(5 > 41);
		
	}
	
	@Test
	public void dTest()  {
		
		assertTrue(5 < 41);
	}
	@Test
	public void eTest() {
		//assertEquals("hello method a".trim(),c2c.a().trim());
		assertFalse(5 > 41);
		
	}
	
	
}
