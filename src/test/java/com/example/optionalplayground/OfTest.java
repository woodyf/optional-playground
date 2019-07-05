package com.example.optionalplayground;

import java.util.Optional;

import org.junit.Test;

public class OfTest extends BaseTest {

	@Test
	public void ofTest() {
		final String str1 = "str";
		logger.debug("str1 = {}", str1);
		final Optional<String> opt1 = Optional.of("optStr");
		logger.debug("opt1 = {}", opt1);

	}

	@Test
	public void ofTest_null() {
		final String nullStr = null;
		logger.debug("nullStr = {}", nullStr);
		// 錯誤示範
		final Optional<String> nullOpt1 = Optional.of(null);
		logger.debug("nullOpt1 = {}", nullOpt1);
	}

}
