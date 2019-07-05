package com.example.optionalplayground.rest;

import java.util.Optional;

public class DemoEntity {
	private String id;
	private String value;

	public DemoEntity(String id, String value) {
		this.id = id;
		this.value = value;
	}

	public DemoEntity() {
	}

	public Optional<String> getIdOpt() {
		return Optional.ofNullable(id);
	}

	public String getId() {
		return id;
	}

	public Optional<String> getValueOpt() {
		return Optional.ofNullable(value);
	}

	public String getValue() {
		return value;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
