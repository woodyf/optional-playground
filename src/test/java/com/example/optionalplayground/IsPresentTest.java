package com.example.optionalplayground;

import java.util.Optional;

import org.junit.Test;

public class IsPresentTest extends BaseTest {

	@Test
	public void isPresentString() {
		nullCondition(str());
		nullCondition(strNull());
	}

	private void nullCondition(String str) {
		if (str != null) {
			logger.debug("great!");
		} else {
			logger.debug("this is null");
		}
	}

	@Test
	public void isPresentOpt() {
		isPresent(strOpt());
		isPresent(strOptEmpty());
	}

	private void isPresent(Optional<String> strOpt) {
		if (strOpt.isPresent()) {
			logger.debug("opt great!");
		} else {
			logger.debug("this is empty");
		}
	}
}
