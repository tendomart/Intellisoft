package com.intellisoft.employee.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
//Employee Model
@Entity
@Table(name = "employee")
public class Employee  implements Serializable{

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(long id, String name, Date date_of_birth, String address, ContractInformation contract_info) {
		super();
		this.id = id;
		this.name = name;
		this.date_of_birth = date_of_birth.toString();
		this.address = address;
		this.contract_info = contract_info;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "date_of_birth")
	private String date_of_birth;
	

	@Column(name = "address")
	private String address;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "contract_info_id")
	public ContractInformation contract_info;

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

	public String getDate_of_birth() {
		return date_of_birth;
	}

	public void setDate_of_birth(Date date_of_birth) {
		this.date_of_birth = date_of_birth.toString();
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public ContractInformation getContract_info() {
		return contract_info;
	}

	public void setContract_info(ContractInformation contract_info) {
		this.contract_info = contract_info;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
