package BasicTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class countTest {

	@Test
	void test() {
		test1 test = new test1();
		int result = test.countWord("ebruarslan");
		assertEquals(2,result);//
		//assertEquals(5,result);false
		
	}

}
