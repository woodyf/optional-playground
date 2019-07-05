package com.example.optionalplayground;

import java.util.Optional;

import org.junit.Test;

public class MapTest extends BaseTest {

	@Test
	public void notNullDoSomething() {
		logLength(str());
		logLength(strNull());
	}

	private void logLength(String str) {
		final int len = str == null ? 0 : str.length();
		logger.debug("string length = {}", len);
	}

	@Test
	public void ifPresentTest() {
		logLengthWithMap(strOpt());
		logLengthWithMap(strOptEmpty());
	}

	private void logLengthWithMap(Optional<String> strOpt) {
		final int len = strOpt.map(String::length).orElse(0);
		logger.debug("string length = {}", len);
	}

}
