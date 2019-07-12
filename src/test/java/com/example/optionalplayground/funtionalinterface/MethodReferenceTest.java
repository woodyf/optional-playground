package com.example.optionalplayground.funtionalinterface;

import java.util.function.Consumer;

import org.junit.Test;

import com.example.optionalplayground.BaseTest;

public class MethodReferenceTest extends BaseTest {

	private <T> void consume(T input, Consumer<T> c) {
		c.accept(input);
	}

	@Test
	public void t1() {
		consume("Barry", this::go);
	}

	private void go(String s) {
		System.err.println(s + "go");
	}
}
