package com.example.optionalplayground.funtionalinterface;

import org.junit.Test;

import com.example.optionalplayground.BaseTest;
import com.example.optionalplayground.demo.Operation;

public class PassFuctionInJavaTest extends BaseTest {

	private static final String TEMPLATE = "x = {}, y = {}, result = {}";

	private final class SquareAdd implements Operation {
		@Override
		public int calculate(int x, int y) {
			return x * x + y * y;
		}
	}

	private int doCalculate(int x, int y, Operation o) {
		return o.calculate(x, y);
	}

	@Test
	public void anonymousInnerClassTest() {
		final int result = doCalculate(2, 3, new Operation() {

			@Override
			public int calculate(int x, int y) {
				return x * x + y * y;
			}
		});
		logger.debug(TEMPLATE, 2, 3, result);
		final int result2 = doCalculate(4, 5, new Operation() {

			@Override
			public int calculate(int x, int y) {
				return x * x + y * y;
			}
		});
		logger.debug(TEMPLATE, 4, 5, result2);
	}

	@Test
	public void nestedInnerClassTest() {
		final int result = doCalculate(2, 3, new SquareAdd());
		logger.debug(TEMPLATE, 2, 3, result);
	}

	@Test
	public void lambdaTest() {
		final int result = doCalculate(2, 3, (x, y) -> x * x + y * y);
		logger.debug(TEMPLATE, 2, 3, result);
	}
}
