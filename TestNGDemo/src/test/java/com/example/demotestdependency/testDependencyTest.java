package com.example.demotestdependency;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

/*
 * @Ignore dominates enabled
 * dependsOnMethods dominates priority
 * if dependent main method fails it execute skip test
 * if dependent main method fails it won't execute skip test to the corresponding test method if alwaysRun is set to true
 *  if dependent main method is ignored or deleted or removed or skipped it will throw an TestNGException
 * 
 */

public class testDependencyTest {
	
	static Integer id=null;
@Ignore
  @Test
  public void create() {
	  System.out.println(5/0);
	  System.out.println("create");
	  id=1;
  }
  
 // @Test(priority=1)
	
//	@Ignore
  @Test(
		  priority=-1,
		  dependsOnMethods = {"create"},
		  alwaysRun = true,  //if test fails ---> no skip
		  ignoreMissingDependencies = true //ignore/delete/skip/removed
		  )
  public void track() {
	 // System.out.println(5/0);
	  if(id!=null)
	  System.out.println("track");
	  else
		  throw new RuntimeException("invalid id");
  }
  
  
 // @Test(priority=2)
 //@Ignore
  @Test(dependsOnMethods = {"track","create"},
		  ignoreMissingDependencies = true  
  )
  public void cancel() {
	  if(id!=null)
		  System.out.println("cancel");
		  else
			  throw new RuntimeException("invalid id");
  }
  
  
  
}
