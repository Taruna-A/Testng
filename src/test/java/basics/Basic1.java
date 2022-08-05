package basics;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Basic1 {
  @Test(groups={"smoke"})
  public void a() {
	  System.out.println("this is a");
  }
  @Test(groups={"regression"})
  public void z() {
	  System.out.println("this is z");
  }
  @Test(groups={"regression"})
  public void c() {
	  System.out.println("this is c");
  }
  @Test(groups={"smoke"})
  public void e() {
	  System.out.println("this is e");
  }
}
