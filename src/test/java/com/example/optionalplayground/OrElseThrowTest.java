package com.example.optionalplayground;

import java.util.Optional;

import org.junit.Test;

public class OrElseThrowTest extends BaseTest {

	@Test
	public void ifNullThenThrowTest() {
		ifNullThenThrow(str());
		ifNullThenThrow(strNull());
	}

	private void ifNullThenThrow(String str) {
		if (str == null) {
			throw new NullPointerException("¯\\_(ツ)_/¯");
		}
		logger.debug("ok str = {}", str);
	}

	@Test
	public void orElseThrowTest() {
		handleWithOrElseThrow(strOpt());
		handleWithOrElseThrow(strOptEmpty());
	}

	private void handleWithOrElseThrow(Optional<String> strOpt) {
		// prefer orElseThrow over optional.get
		final String str2 = strOpt.orElseThrow(() -> new NullPointerException("¯\\_(ツ)_/¯"));
		logger.debug("ok str2 = {}", str2);
	}

}
