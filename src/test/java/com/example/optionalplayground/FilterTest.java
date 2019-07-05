package com.example.optionalplayground;

import java.util.Optional;

import org.junit.Test;

public class FilterTest extends BaseTest {

	@Test
	public void notNullAndFulfillCondition() {
		endWith4(str(2));
		endWith4(str(4));
		endWith4(strNull());
	}

	private void endWith4(String str) {
		logger.debug("begin endWith4()");
		if (str != null && str.endsWith("4")) {
			logger.debug("yay! it ends with 4 = {}", str);
		}
	}

	@Test
	public void filterTest() {
		filter(strOpt(2));
		filter(strOpt(4));
		filter(strOptEmpty());
	}

	private void filter(Optional<String> strOpt) {
		logger.debug("begin filter()");
		strOpt.filter(str -> str.endsWith("4")).ifPresent(str -> logger.debug("yay! it ends with 4 = {}", str));
	}

}
