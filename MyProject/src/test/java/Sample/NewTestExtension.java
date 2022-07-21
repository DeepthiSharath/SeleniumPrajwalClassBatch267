package Sample;

import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.NewTest;

public class NewTestExtension extends NewTest{
  @Test
  public void f() {
	  Reporter.log("Hi");
  }
}
