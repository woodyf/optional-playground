package com.example.optionalplayground;

import java.util.Optional;

import org.junit.Test;

public class GetTest extends BaseTest {

	@Test
	public void getTest() {
		final Optional<String> opt = strOpt();
		final String fromOpt = opt.get();
		logger.debug("fromOpt = {}", fromOpt);
	}

	@Test
	public void getTestFail() {
		final Optional<String> optEmpty = strOptEmpty();
		final String fromEmptyOpt = optEmpty.get();
		logger.debug("fromEmptyOpt = {}", fromEmptyOpt);
	}

}
