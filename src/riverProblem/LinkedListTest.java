package riverProblem;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LinkedListTest {

	@Test
	void test() {
		LinkedList <Integer> ls=new LinkedList<Integer>();
		ls.add(5);
		ls.add(10);
		ls.add(20);
		assertEquals(5, Integer.parseInt(ls.get(0).toString()));
		assertEquals(10, Integer.parseInt(ls.get(1).toString()));
		assertEquals(20, Integer.parseInt(ls.get(2).toString()));
		assertEquals(ls.size(), 3);
		assertEquals(true,ls.remove(5));
		assertEquals(ls.size(), 2);
	}

}
