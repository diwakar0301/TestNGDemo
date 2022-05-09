package com.example.dataprovider;

import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
/*
 * jagged array column count varies from row to row
 * 
 * 
 */
public class dp1 {
//  @Test
//  public void TestLogin() throws Exception{
//	  
//	  WebDriverManager.chromedriver().setup();
//
//	  WebDriver driver=new ChromeDriver();
//	driver.manage().window().maximize();
//		
//		driver.get("https://opensource-demo.orangehrmlive.com/");
//		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
//		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
//		driver.findElement(By.id("btnLogin")).click();
//		Assert.assertTrue(driver.findElement(By.id("welcome")).isDisplayed());
//		Thread.sleep(5000);
//		driver.quit();	
//  }
	
//	@Test(dataProvider="dp1")
//	//@Test(dataProvider="dataProvider")
//	public void t1(String a,String b) {
//		System.out.println(a+"  and "+b);
//	}
//	
//	@Test(dataProvider="dp2")
//	public void t2(String a) {
//		System.out.println(a);
//	}
//	
//	@Test(dataProvider="dp3")
//	//@Test(dataProvider="dataProvider")
//	public void t1(String[] a)//use single dimensional array as paramter in the situation like more parameters or in jagged array
//	{
//		System.out.println(a[0]+"  ands "+a[1]);
//	}
//	@DataProvider
//	(name="dp1")
//	public Object[][] dataProvider() {
//		Object[][] dp=new Object[2][2];
//		dp[0][0]="a1";
//		dp[0][1]="a2";
//		dp[1][0]="b1";
//		dp[1][1]="b2";
//		return dp;
//	}
//	
//	@DataProvider(name="dp2")
//	public String[] dataProvider2() {
//		String[] dp=new String[3];
//		dp[0]="a";
//		dp[1]="b";
//		dp[2]="c";
//		return dp;
//	}
//	
//	@DataProvider
//	(name="dp3")
//	public String[][] dataProvider3() {
//		String[][] dp=new String[2][2];
//		dp[0][0]="a1";
//		dp[0][1]="a2";
//		dp[1][0]="b1";
//		dp[1][1]="b2";
//		return dp;
//	}
//	
//	@DataProvider(name="it1")
//	public Iterator<Object> dataProviderIt1(){
//		List dp=new ArrayList<>();
//		dp.add(1);
//		dp.add("a");
//		return dp.iterator();
//	}
//	
//	@Test(dataProvider="it1")
//	public void t2(Object a) {
//		System.out.println(a);
//	}
	
	
//	@DataProvider(name="it2")
//	public Iterator<Object[]> dpit2(){
//		List<Object[]> dp=new ArrayList<>();
//		dp.add(new Object[] {11,"aa"});
//		dp.add(new Object[] {22,"bb"});
//		return dp.iterator();
//	}
//	
//	
//	@Test(dataProvider="it2")
//	public void t2it(Object a[]) {
//		System.out.println(a[0]+" & "+a[1]);
//	}
	
}
