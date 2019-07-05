package com.example.optionalplayground.demo;

public class ParentBean {
	private String id;
	private StandardBean sb;

	public ParentBean(String id, StandardBean sb) {
		super();
		this.id = id;
		this.sb = sb;
	}

	public ParentBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public StandardBean getSb() {
		return sb;
	}

	public void setSb(StandardBean sb) {
		this.sb = sb;
	}

}
