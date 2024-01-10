package lan.zold;

public class Rombusz {

  public double calculateArea(double sideLength, double alpha) {
    double beta = 180 - alpha;
    double radAlpha = Math.toRadians(alpha);
    double radBeta = Math.toRadians(beta);
    return Math.pow(sideLength, 2) * Math.sin(radAlpha);
  }
}
