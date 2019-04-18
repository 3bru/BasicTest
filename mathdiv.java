package mathCal;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class mathdiv {

	@Test
	void test() {
		//arrange
		final int expecteds = 2;
		//act
		final int actuals = mathBase.divide(18, 9);
		//assert
		Assert.assertEquals(expecteds, actuals);
	}

}
