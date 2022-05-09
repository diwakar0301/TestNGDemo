package com.example.demogroups;



import org.testng.annotations.Test;

public class ThirdTest {
	
	@Test(groups= {"smoke"})
	public void lTest()  {
		System.out.println("ltest");
		
	}
	@Test(groups= {"smoke","func"})
	public void mTest() {
		
		System.out.println("mtest");
		
		
	}
	
	@Test(groups= {"func","regr"})
	public void kTest() {
		
		System.out.println("ktest");
		
		
	}
	
}
