package com.employee.model;

import javax.persistence.Entity;

@Entity
public class Employee {

	public Employee() {}
	
	public int id ;
	public String name;
	public String address;
	public String title;
}
