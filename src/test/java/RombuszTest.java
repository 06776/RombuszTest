import lan.zold.Rombusz;

import java.util.InputMismatchException;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RombuszTest {

  Rombusz rombusz;

  @BeforeTest
  public void setUp() {
    this.rombusz = new Rombusz();
  }

  @Test
  public void testCalculateAreaSuccess() {
    double sideLength = 5.0;
    double alpha = 60.0;
    double expectedArea = Math.pow(sideLength, 2) * Math.sin(Math.toRadians(alpha));
    double actualArea = rombusz.calculateArea(sideLength, alpha);
    Assert.assertEquals(actualArea, expectedArea, 0.1, "Hibas terulet szamitas"
    );
  }

  @Test
  public void testCalculatePerimeterSuccess() {
    double sideLength = 5.0;
    double expectedPerimeter = 4 * sideLength;
    double actualPerimeter = rombusz.calculatePerimeter(sideLength);
    Assert.assertEquals(actualPerimeter,expectedPerimeter, 0.1, "Hibas kerulet szamitas"
    );
  }

  @Test(expectedExceptions = InputMismatchException.class)
  public void testCalculateAreaFailure() {
    double sideLength = 5.0;
    double alpha = 60.0;
    double expectedArea = 0;
    double actualArea = rombusz.calculateArea2(sideLength, alpha);
    Assert.assertEquals(actualArea, expectedArea, 0.0001, "Hibas terulet szamitas");
    }


}
