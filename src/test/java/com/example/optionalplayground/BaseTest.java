package com.example.optionalplayground;

import java.util.Optional;
import java.util.Random;

import org.junit.Rule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class BaseTest {

	protected Logger logger = LoggerFactory.getLogger(this.getClass());

	protected String str(int suffixInt) {
		return "str" + suffixInt;
	}

	protected String str() {
		return str(new Random().nextInt(10));
	}

	protected String strNull() {
		return null;
	}

	protected String strWithLog() {
		logger.debug("strWithLog() is called");
		return str();
	}

	protected Optional<String> strOpt() {
		return Optional.of(str());
	}

	protected Optional<String> strOpt(int suffixInt) {
		return Optional.of(str(suffixInt));
	}

	protected Optional<String> strOptEmpty() {
		return Optional.empty();
	}

	@Rule
	public TestWatcher watchman = new TestWatcherExtension();

	private final class TestWatcherExtension extends TestWatcher {
		@Override
		protected void failed(Throwable e, Description description) {
			logger.error(description.getMethodName() + "() failed", e);
		}

		@Override
		protected void starting(Description description) {
			logger.info("--start {}()", description.getMethodName());
		}

		@Override
		protected void finished(Description description) {
			logger.info("--end {}()", description.getMethodName());
		}
	}
}
