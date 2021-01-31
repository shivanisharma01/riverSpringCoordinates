package riverProblem;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RiverTest {

	@Test
	void test() {
		Point p1=new Point(100, 200, 300);
		Point p2=new Point(200, 300, 400);
		LinkedList<Point> p=new LinkedList<Point>();
		p.add(p1);
		p.add(p2);
		River r=new River("test", p);
		assertEquals(r.getRiverName(), "test");
		assertEquals(r.getPoints().get(0).getX(), 100);
		assertEquals(r.getPoints().get(0).getY(), 200);
		assertEquals(r.getPoints().get(0).getZ(), 300);
		assertEquals(r.getPoints().get(1).getX(), 200);
		assertEquals(r.getPoints().get(1).getY(), 300);
		assertEquals(r.getPoints().get(1).getZ(), 400);
		
	}

}
