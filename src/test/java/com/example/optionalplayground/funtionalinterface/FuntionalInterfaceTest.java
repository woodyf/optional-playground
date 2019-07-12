package com.example.optionalplayground.funtionalinterface;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import org.junit.Test;

import com.example.optionalplayground.BaseTest;

public class FuntionalInterfaceTest extends BaseTest {

	private <T> void consume(T input, Consumer<T> c) {
		c.accept(input);
	}

	@Test
	public void consumerTest() {
		final String logMe = "logMe";
		consume(logMe, s -> {
			logger.debug("input is {}", s);
		});
		consume(logMe, s -> {
			logger.warn("uppercased-input is {}", s.toUpperCase());
		});
	}

	private <T> T supply(Supplier<T> s) {
		return s.get();
	}

	@Test
	public void supplierTest() {
		final String result1 = supply(() -> "Sup1");
		logger.debug("result1 = {}", result1);
		final Integer result2 = supply(() -> 5);
		logger.debug("result2 = {}", result2);
	}

	private <T> boolean predicate(T input, Predicate<T> p) {
		return p.test(input);
	}

	@Test
	public void predicateTest() {
		final boolean isEven = predicate(10, i -> i % 2 == 0);
		logger.debug("number isEven = {}", isEven);
		final boolean isLengthOver5 = predicate("hell", s -> s.length() > 5);
		logger.debug("string length > 5 = {}", isLengthOver5);
	}

	private <T, R> R function(T input, Function<T, R> f) {
		return f.apply(input);
	}

	@Test
	public void functionTest() {
		final int stringLength = function("fsd", s -> s.length());
		logger.debug("string has length = {}", stringLength);
	}
}
