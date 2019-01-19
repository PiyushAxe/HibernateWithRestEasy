package com.axelor.hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="User")
public class Student {

	@Id
	int id;
	int makrs;
	String name;
	
	public int getId() {
		return id;
	}
	public int getMakrs() {
		return makrs;
	}
	
	public String getName() {
		return name;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public void setMakrs(int makrs) {
		this.makrs = makrs;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
}
