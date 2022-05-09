
package com.example.demo3ignore;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

@Ignore
public class SeventhTest {
	@Ignore //more priority than enabled
  @Test(enabled=true)
  public void aseventh() {
System.out.println("a seventh");
  }
  
  @Test
  public void bseventh() {
System.out.println("b seventh");
  }
  @Test
  public void cseventh() {
System.out.println("c seventh");
  }
  
  
  
}
