package com.example.optionalplayground;

import java.util.Optional;

import org.junit.Test;

import com.example.optionalplayground.demo.OptionalBean;
import com.example.optionalplayground.demo.ParentBean;
import com.example.optionalplayground.demo.ParentOptionalBean;
import com.example.optionalplayground.demo.StandardBean;

public class FlatMapTest extends BaseTest {

	@Test
	public void notNullDoSomething() {
		handleNestedBean(perfectParentBean());
		handleNestedBean(normalParentBean());
		handleNestedBean(lackSbParentBean());
	}

	private void handleNestedBean(ParentBean pb) {
		String result = "";
		if (pb != null) {
			final StandardBean sb = pb.getSb();
			if (sb != null) {
				final String value = sb.getValue();
				if (value != null) {
					result = value.substring(1);
				}
			}
		}
		logger.debug("result = {}", result);
	}

	private ParentBean perfectParentBean() {
		final StandardBean sb = new StandardBean("i have value", "value");
		return new ParentBean("perfect", sb);
	}

	private ParentBean normalParentBean() {
		final StandardBean sb = new StandardBean("i dont", null);
		return new ParentBean("normal", sb);
	}

	private ParentBean lackSbParentBean() {
		return new ParentBean("lack", null);
	}

	@Test
	public void flatMapTest() {
		handleWithFlatMap(perfectParentOptionalBean());
		handleWithFlatMap(normalParentOptionalBean());
		handleWithFlatMap(lackSbParentOptionalBean());
	}

	private void handleWithFlatMap(ParentOptionalBean pob) {
		final String result = Optional.ofNullable(pob).flatMap(ParentOptionalBean::getOb)
				.flatMap(OptionalBean::getValue).map(str -> str.substring(1)).orElse("");
		logger.debug("result = {}", result);
	}

	private ParentOptionalBean perfectParentOptionalBean() {
		final OptionalBean ob = new OptionalBean("i have value", "value");
		return new ParentOptionalBean("perfect", ob);
	}

	private ParentOptionalBean normalParentOptionalBean() {
		final OptionalBean sb = new OptionalBean("i dont", null);
		return new ParentOptionalBean("normal", sb);
	}

	private ParentOptionalBean lackSbParentOptionalBean() {
		return new ParentOptionalBean("lack", null);
	}

}
