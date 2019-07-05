package com.example.optionalplayground;

import java.util.Optional;

import org.junit.Test;

public class OrElseTest extends BaseTest {

	@Test
	public void ifNullUseDefaultValueTest() {
		ifNullUseDefaultValue(str());
		ifNullUseDefaultValue(strNull());
	}

	private void ifNullUseDefaultValue(String nullableStr) {
		final String str = nullableStr == null ? "default" : nullableStr;
		logger.debug("str = {}", str);
	}

	@Test
	public void orElseTest() {
		orElse(strOpt());
		orElse(strOptEmpty());
	}

	private void orElse(Optional<String> strOpt) {
		final String str = strOpt.orElse("default");
		logger.debug("str = {}", str);
	}

	@Test
	private void nullRef() {
		// when you reeeeeeeeally need a null reference
		final String str = strOptEmpty().orElse(null);
		logger.debug("str = {}", str);
	}


}
