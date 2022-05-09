package com.example.demo;

//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import io.github.bonigarcia.wdm.WebDriverManager;

import static org.testng.Assert.*; 
/*we don't have control over hard assertion.
 And it will throw exception immediately after the failure of assertion so it won't execute next line of codes
*/

import org.mockito.InjectMocks;
/*we  have control over soft assertion.
So even after the failure of assertion it is possible to execute next line if codes.
The failure will be recorded. So in order to achieve the test we must throw the proper exceptions using assertAll()
*/
import org.springframework.boot.test.context.SpringBootTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.lt.crs.controller.Client2Controller;




@SpringBootTest

class TestNgDemoApplicationTests {
	
	
	private Client2Controller c2c=new Client2Controller();
	
	@InjectMocks
	private Client2Controller c2c2;

//	@Rule
//	public ExpectedException exceptionRule = ExpectedException.none();
	
//	@Test
//	public void TestGoogle() throws Exception {
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.facebook.com/");
//		driver.findElement(By.name("email")).sendKeys("I am from chrome");
//		System.out.println(driver.getTitle());
//		Thread.sleep(5000);
//		System.out.println("I am going to quit");
//		driver.quit();		
//		
//		
//	}


	@Test
	public void fTest() {
//		assertEquals("hello method a".trim(),c2c.a().trim());
		
		assertEquals("hello method a".trim(),c2c2.a().trim());
		
	//	assertFalse(5 > 41);
	//	assertNotEquals("A","a");
		//assertNull(null);
		
//		SoftAssert sa=new SoftAssert();
//		sa.assertEquals("a","a","its not equal"); //soft assertion
//		System.out.println("after assertions");
//		sa.assertTrue(true,"not true");
	//	sa.assertAll();
//		assertNotNull(null,"its null"); //hard assertion
//		System.out.println("after assertions");
	}
	
	@Test
	public void gTest()  {
		
		assertTrue(5 < 41);
	}
	
	@Test(expectedExceptions=NullPointerException.class)
	public void cTest()  {
		
		
		c2c.b();
	}
}
