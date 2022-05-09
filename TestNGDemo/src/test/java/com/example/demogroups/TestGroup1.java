package com.example.demogroups;

import org.testng.annotations.Test;

/*
 * smoke tests, functional tests, regression tests, daily build, weekly build, ....
 */

public class TestGroup1 {
  @Test(groups= {"smoke"})
  public void f() {
	  System.out.println("f test");
  }
  
  @Test
  public void f1() {
	  System.out.println("f1 test");
  }
}
