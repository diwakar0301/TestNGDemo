package com.example.dataprovider;

import org.testng.annotations.DataProvider;
/*
 * we can store multiple dataproviders in the single dataprovider class
 * we can have multiple dataprovider classes in a project
 * 
 */
public class DataSupplier {
	@DataProvider(name="dp2") 
	public String[] dataProvider2() {
		String[] dp=new String[3];
		dp[0]="ds a";
		dp[1]="ds b";
		dp[2]="ds c";
		return dp;
	}

}
