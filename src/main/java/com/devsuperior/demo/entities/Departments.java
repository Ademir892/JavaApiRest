package com.devsuperior.demo.entities;

public class Departments {

	private Long id;
	private String name;
	
	public Departments() {
	}
	
	
	public Departments(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
}
