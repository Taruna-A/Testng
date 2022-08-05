package basics;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Basic2 {
 
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("this is beforeMethod");

  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("this is afterMethod");

  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("this is beforeClass");

  }

  @AfterClass
  public void afterClass() {
	  System.out.println("this is afterClass");

  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("this is beforeTest");

  }
@Test
public void test1() {
	  System.out.println("this is test1");

}
@Test
public void test2() {
	  System.out.println("this is test2");

}
  @AfterTest
  public void afterTest() {
	  System.out.println("this is afterTest");

  }

}
