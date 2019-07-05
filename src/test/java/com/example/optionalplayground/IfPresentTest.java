package com.example.optionalplayground;

import java.util.Optional;

import org.junit.Test;

public class IfPresentTest extends BaseTest {

	@Test
	public void notNullDoSomething() {
		notNullConcat(str());
		notNullConcat(strNull());
	}

	private void notNullConcat(String str) {
		logger.debug("begin notNullConcat()");
		if (str != null) {
			final String concat = str + "haha";
			logger.debug("ok concated = {}", concat);
		}
	}

	@Test
	public void ifPresentTest() {
		ifPresent(strOpt());
		ifPresent(strOptEmpty());
	}

	private void ifPresent(Optional<String> strOpt) {
		logger.debug("begin ifPresent()");
		strOpt.ifPresent(str -> logger.debug("ok concated = {}", str + "haha"));
	}

}
