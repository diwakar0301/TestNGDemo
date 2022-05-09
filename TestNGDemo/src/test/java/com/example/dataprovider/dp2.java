package com.example.dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dp2 {
//	@DataProvider(name="dp2",indices= {0,2}) //indices are used mainly for debug/close observation to find bugs
//	public String[] dataProvider2() {
//		String[] dp=new String[3];
//		dp[0]="a";
//		dp[1]="b";
//		dp[2]="c";
//		return dp;
//	}
//	
//	
	@Test(dataProvider="dp2",dataProviderClass =DataSupplier.class)
	public void t2(String a) {
		System.out.println(a);
	}
}
