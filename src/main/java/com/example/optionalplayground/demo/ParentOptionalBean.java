package com.example.optionalplayground.demo;

import java.util.Optional;

public class ParentOptionalBean {
	private String id;
	private OptionalBean ob;

	public ParentOptionalBean(String id, OptionalBean ob) {
		this.id = id;
		this.ob = ob;
	}

	public ParentOptionalBean() {
	}

	public Optional<String> getId() {
		return Optional.ofNullable(id);
	}

	public void setId(String id) {
		this.id = id;
	}

	public Optional<OptionalBean> getOb() {
		return Optional.ofNullable(ob);
	}

	public void setOb(OptionalBean ob) {
		this.ob = ob;
	}

}
