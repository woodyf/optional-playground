package com.example.optionalplayground;

import java.util.Optional;

import org.junit.Test;

public class OfNullableTest extends BaseTest {

	@Test
	public void ofNullableTest() {
		final Optional<String> fromNull = Optional.ofNullable(null);
		logger.debug("fromNull = {}", fromNull);
		
		final Optional<String> fromEmpty = Optional.empty();
		logger.debug("fromEmpty = {}", fromEmpty);
		
		final Optional<String> fromApiNull = Optional.ofNullable(strNull());
		logger.debug("fromApiNull = {}", fromApiNull);
		
		final Optional<String> fromApiNotNull = Optional.ofNullable(str());
		logger.debug("fromApiNotNull = {}", fromApiNotNull);
	}

}
