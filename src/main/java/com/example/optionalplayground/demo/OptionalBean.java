package com.example.optionalplayground.demo;

import java.util.Optional;

public class OptionalBean {
	private String id;
	private String value;

	public OptionalBean(String id, String value) {
		this.id = id;
		this.value = value;
	}

	public OptionalBean() {
	}

	public Optional<String> getId() {
		return Optional.ofNullable(id);
	}

	public void setId(String id) {
		this.id = id;
	}

	public Optional<String> getValue() {
		return Optional.ofNullable(value);
	}

	public void setValue(String value) {
		this.value = value;
	}

}
