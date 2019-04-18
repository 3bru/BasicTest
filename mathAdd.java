package mathCal;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class mathAdd {

	@Test
	void test() {
		//arrange 
		final int expected = 8;
		//act
		final int actual = mathBase.add(8, 0);
		//assert
		Assert.assertEquals(expected, actual);
	}

}
