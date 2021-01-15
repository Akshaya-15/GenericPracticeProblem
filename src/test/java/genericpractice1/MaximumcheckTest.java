package genericpractice1;

import org.junit.Assert;
import org.junit.Test;

public class MaximumcheckTest {

	// test to check if maximum value is at first position.
	@Test
	public void MaximumValueAtFirstPosition() {
		Maximumcheck maximumCheck = new Maximumcheck();
		int maximum = maximumCheck.maximumValue(70, 10, 40);
		Assert.assertEquals(70, maximum);
	}

	// test to check if maximum value is at second position.
	@Test
	public void MaximumValueAtSecondPosition() {
		Maximumcheck maximumCheck = new Maximumcheck();
		int maximum = maximumCheck.maximumValue(10, 70, 40);
		Assert.assertEquals(70, maximum);
	}

	// test to check if maximum value is at third position.
	@Test
	public void MaximumValueAtThirdPosition() {
		Maximumcheck maximumCheck = new Maximumcheck();
		int maximum = maximumCheck.maximumValue(40, 10, 70);
		Assert.assertEquals(70, maximum);
	}
}

