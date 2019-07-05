package com.example.optionalplayground.demo;

public class StandardBean {
	private String id;
	private String value;

	public StandardBean(String id, String value) {
		this.id = id;
		this.value = value;
	}

	public StandardBean() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
