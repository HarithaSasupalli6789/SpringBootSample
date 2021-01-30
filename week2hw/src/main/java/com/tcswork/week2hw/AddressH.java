package com.tcswork.week2hw;

	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.JoinColumn;
	import javax.persistence.Table;
	@Entity
	@Table(name = "addressh")
	public class AddressH {
	private int addressid;
	private String address;
	public AddressH() {
	}
	public AddressH(int addressid, String address){
	this.addressid = addressid;
	this.address = address;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JoinColumn(name="addressid")
	public int getAddressid() {
	return addressid;
	}
	public void setAddressid(int addressid) {
	this.addressid = addressid;
	}
	public String getAddress() {
	return address;
	}
	public void setAddress(String address) {
	this.address = address;
	}
	}