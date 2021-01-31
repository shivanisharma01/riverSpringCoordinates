package riverProblem;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PointTest {

	@Test
	void test() {
		Point p1=new Point(100, 200, 300);
		Point p2=new Point(200, 300, 400);
		
		assertEquals(p1.getX(), 100);
		assertEquals(p1.getY(), 200);
		assertEquals(p1.getZ(), 300);
		
		assertEquals(p2.getX(), 200);
		assertEquals(p2.getY(), 300);
		assertEquals(p2.getZ(), 400);
	}

}
