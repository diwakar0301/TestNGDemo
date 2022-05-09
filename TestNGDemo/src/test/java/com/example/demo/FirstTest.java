 package com.example.demo;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
/*
 * 
 * Annotation is a form of metadata that can be added to the java source code
 * 
 * @Test
 * @BeforeSuite
 * @AfterSuite
 * @BeforeTest
 * @AfterTest
 * @BeforeClass
 * @AfterClass
 * @BeforeMethod
 * @AfterMethod
 * @BeforeGroup
 * @AfterGroup
 * 
 * @DataProvider
 * @Parameters
 * @Factory
 * @Listeners
 * @Ignore
 * 
 * 
 * 
 * 
 * 
 * 
 */





public class FirstTest {
	

	@Parameters({"sl","tl"})
	@Test
	public void aTest(String sl,String tl) {
		System.out.println(sl+"  "+tl);
		//assertEquals("hello method a".trim(),c2c.a().trim());
		assertFalse(5 > 41);
		
	}
	
	@Test
	public void bTest()  {
		
		assertTrue(5 < 41);
	}
}
