package lan.zold;

import java.util.InputMismatchException;

public class Rombusz {

  public double calculateArea(double sideLength, double alpha) {
    double beta = 180 - alpha;
    double radAlpha = Math.toRadians(alpha);
    double radBeta = Math.toRadians(beta);
    return Math.pow(sideLength, 2) * Math.sin(radAlpha);
  }

  public double calculatePerimeter(double sideLength) {
    return 4 * sideLength;
  }

  public double calculateArea2(double sideLength, double alpha) {
    if (sideLength <= 0 || alpha <= 0) {
      throw new InputMismatchException();
    }
    return alpha;
  }
}
