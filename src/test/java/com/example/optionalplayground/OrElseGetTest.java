package com.example.optionalplayground;

import java.util.Optional;

import org.junit.Test;

public class OrElseGetTest extends BaseTest {

	@Test
	public void orElseTest() {
		orElse(strOpt());
		orElse(strOptEmpty());
	}

	private void orElse(Optional<String> strOpt) {
		final String str = strOpt.orElse(strWithLog());
		logger.debug("str = {}", str);
	}

	@Test
	public void orElseGetTest() {
		orElseGet(strOpt());
		orElseGet(strOptEmpty());
	}


	private void orElseGet(Optional<String> strOpt) {
		final String str = strOpt.orElseGet(this::strWithLog);
		logger.debug("str = {}", str);
	}

}
