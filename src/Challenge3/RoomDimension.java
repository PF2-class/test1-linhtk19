package Challenge3;

public class RoomDimension {
	private double width;
	private double length;

	public double calculateArea() {
		return this.length * this.width;
	}

	public RoomDimension(double length, double width ) {	
		this.length = length;
		this.width = width;
	}

	@Override
	public String toString() {
		return "RoomDimension [length=" + length + ", width=" + width + "]";
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

}
