package com.devsuperior.demo.entities;

public class Product {
	
	private long id;
	private String name;
	private Double price;
	
	public Product(long id, String name, Double price, Departments departments) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.departments = departments;
	}

	private Departments departments;
	
	public Product() {	
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Departments getDepartments() {
		return departments;
	}

	public void setDepartments(Departments departments) {
		this.departments = departments;
	}
	
	
}
