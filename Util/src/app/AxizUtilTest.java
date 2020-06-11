package app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AxizUtilTest {

	@Test
	public void isNumber1() {

		boolean str = AxizUtil.isSmallAlphabet("aa");
		boolean expected = true;

		assertEquals(expected, str);
	}

	@Test
	public void isNumber2() {

		boolean str = AxizUtil.isSmallAlphabet("  ");
		boolean expected = false;

		assertEquals(expected, str);
	}

	@Test
	public void isNumber3() {

		boolean str = AxizUtil.isSmallAlphabet(null);
		boolean expected = false;

		assertEquals(expected, str);
	}

	@Test
	public void isNumber4() {

		boolean str = AxizUtil.isSmallAlphabet("");
		boolean expected = false;

		assertEquals(expected, str);
	}
}