package com.tcswork.week2hw;

	import java.util.List;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.http.HttpStatus;
	import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.node.ObjectNode;
import com.tcswork.week2hw.EmployeeH;
	@RestController
	//@RequestMapping("/data")
	public class ControllerH {
	@Autowired
	ServiceH employeeservice;
	@GetMapping("/emp")
	public List<EmployeeH> employeelist(){
	return employeeservice.listAllUsers();
	}
	/*
	@GetMapping("/concat")
	public String concat() {
	return employeeservice.concatUser();
	}
	*/
	@GetMapping("/emp/{id}")
	public EmployeeH getUser(@PathVariable int id)
	{
		EmployeeH user=employeeservice.getUser(id);
		return user;
	}
	
	//NOT WORKING 
	/*
	
	@PostMapping("/update")
	public EmployeeH createUser(@RequestBody @Validated ObjectNode json)
	{
		AddressH address=new AddressH();
		address.setAddress(json.get("address").asText());
		address.setAddressid(Integer.valueOf(json.get("id").asText()));
		
		EmployeeH user=new EmployeeH();
		user.setId(Integer.valueOf(json.get("id").asText()));
		user.setName(json.get("Name").asText());
		
		employeeservice.add(user);
		user.setAddress(address);
		return employeeservice.add(user);
		
	}
	*/
	
	}