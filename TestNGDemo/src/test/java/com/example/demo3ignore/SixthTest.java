package com.example.demo3ignore;

import org.testng.annotations.Test;

public class SixthTest {
  @Test(enabled=false)
  public void asixth() {
	  System.out.println("a sixth");
  }
  
  @Test
  public void bsixth() {
	  System.out.println("b sixth");
  }
  
  @Test
  public void csixth() {
	  System.out.println("c sixth");
  }


}
