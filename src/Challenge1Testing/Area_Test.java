package Challenge1Testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Challenge1.Area;

class Area_Test {

	@Test
	void test_CircleArea() {
		double circle  = Area.getCircleArea(15);
		assertEquals(706.5,circle,0.5);
	}
	void test_RectangleArea() {
		double rectangle = Area.getRectangleArea(20, 5);
		assertEquals(100.0,rectangle);
	}
	public void test_CylinderArea() {
		double cylinder = Area.getCylinderArea(15, 20);	
		assertEquals(14130, cylinder);
	}

}
