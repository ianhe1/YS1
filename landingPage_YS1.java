import junit.framework.Test;
import junit.framework.TestSuite;

public class LandingPage_YS1 {

  public static Test suite() {
    TestSuite suite = new TestSuite();
    suite.addTestSuite(LandingPage_YS1.class);
    suite.addTestSuite(Login.class);
    suite.addTestSuite(LeftNav_YS1.class);
    suite.addTestSuite(Logout.class);
    return suite;
  }

  public static void main(String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}
