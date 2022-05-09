package com.example.demotestdependency;

import org.testng.annotations.Test;

public class TestGroupDependencyTest {
  @Test(groups= {"smokes"})
  public void test1() {
	  int a=5/0;
	  System.out.println("smoke 1");
  }
  
  
  @Test(groups= {"smokes"})
  public void test2() {
	  System.out.println("smoke 2");
  }
  
  @Test(groups= {"smokes"})
  public void test3() {
 System.out.println("smoke 3");
	 // System.out.println(5/0);
  }
  
  @Test(groups= {"san"})
  public void test4() {
	  System.out.println("san 4");
  }
  
  @Test(groups= {"san"})
  public void test5() {
	  System.out.println("san 5");
	  
  }
  
  @Test(groups= {"sun"})
  public void test6() {
	  System.out.println("sun 6");
  }
  
  @Test(groups= {"sun"})
  public void test7() {
	  System.out.println("sun 7");
	  
  }
  
//  @Test
//  @Test(dependsOnGroups = {"smokes","san","sun"},alwaysRun=true,ignoreMissingDependencies = true)
//  public void test0() {
//	  System.out.println("main tests");
//  }
}
