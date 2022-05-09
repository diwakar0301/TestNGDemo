package com.example.demo2;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FourthTest {
	@Parameters({"sl","tl"})
	@Test
	public void hTest(String sl,@Optional("optional default")String tl) {
		System.out.println(sl+" "+tl);
		//assertEquals("hello method a".trim(),c2c.a().trim());
		assertFalse(5 > 41);
		
	}
	
	@Test
	public void iTest()  {
		
		assertTrue(5 < 41);
	}
	@Test
	public void jTest() {
		//assertEquals("hello method a".trim(),c2c.a().trim());
		assertFalse(5 > 41);
		
	}
}
