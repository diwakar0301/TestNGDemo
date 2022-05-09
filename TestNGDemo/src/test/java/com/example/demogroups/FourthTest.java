package com.example.demogroups;


import org.testng.annotations.Test;
@Test(groups= {"all"})
public class FourthTest {
	

	@Test(groups= {"smoke"})
	public void hTest() {
		System.out.println("h test");
		
		
		
	}
	
	@Test(groups= {"smoke","func"})
	public void iTest()  {
		System.out.println("i test");
		
	}
	@Test(groups= {"func","regr"})
	public void jTest() {
		
		System.out.println("j test");
		
	}
}
