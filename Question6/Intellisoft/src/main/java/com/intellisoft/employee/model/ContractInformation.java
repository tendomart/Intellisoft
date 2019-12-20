package com.intellisoft.employee.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//Contract model in one to one Relationship with employee model
@Entity
@Table(name = "contract_information")
public class ContractInformation {
	public ContractInformation(Long id, boolean signed, Date expiry_date, String type) {
		super();
		this.id = id;
		this.signed = signed;
		this.expiry_date = expiry_date;
		this.type = type;
	}


	public ContractInformation() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "signed")
	private boolean signed;
	
	@Column(name = "expiry_date")
	private Date expiry_date;
	

	@Column(name = "type")
	private String type;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public boolean isSigned() {
		return signed;
	}


	public void setSigned(boolean signed) {
		this.signed = signed;
	}


	public Date getExpiry_date() {
		return expiry_date;
	}


	public void setExpiry_date(Date expiry_date) {
		this.expiry_date = expiry_date;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}
}
