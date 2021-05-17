package com.demo;

import javax.persistence.*;

@Entity
@Table(name = "categories")

public class Category {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int category_id;
	@Column
	private String category_name;
	@Column
	private String observaciones;
	
	
	public int getCategory_id() {
		return category_id;
	}
	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}
	public String getCategory_name() {
		return category_name;
	}
	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}
	public String getObservaciones() {
		return observaciones;
	}
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	
	
	
}
