package BasicTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class squareTest {

	@Test
	void test() {
		test1 test = new test1();
		int output = test.square(5);
		assertEquals(25, output);
		//fail("Not yet implemented");
	}

}
