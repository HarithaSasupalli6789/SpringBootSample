package com.tcswork.week2hw;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
	@Table(name = "employeeh")
	public class EmployeeH {
	private int Id;
	private String Name;
	private AddressH address;
	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="id")
	public AddressH getAddress() {
	return address;
	}
	public void setAddress(AddressH address) {
	this.address = address;
	}
	public EmployeeH() {
	}
	public EmployeeH(int Id, String Name){
	this.Id = Id;
	this.Name = Name;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
	return Id;
	}
	public void setId(int id) {
	Id = id;
	}
	public String getName() {
	return Name;
	}
	public void setName(String name) {
	Name = name;
	}
}
