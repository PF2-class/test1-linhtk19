package Challenge1;

public class Area {
	public static double getCircleArea(double r) {
		return Math.PI*r*r;
	}
	public static double getRectangleArea(double length, double width) {
		return length*width;
	}
	public static double getCylinderArea(double r, double h) {
		return r*r*Math.PI*h;
	}
}
