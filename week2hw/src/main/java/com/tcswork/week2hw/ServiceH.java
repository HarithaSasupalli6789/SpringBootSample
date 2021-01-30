package com.tcswork.week2hw;

	import java.util.List;
	import javax.transaction.Transactional;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;
	@Service
	@Transactional
	public class ServiceH {
	@Autowired
	private RepositoryH employeerepository;
	public List<EmployeeH> listAllUsers(){
	return employeerepository.findAll();
	}
	/*
	public String concatUser(){
	List<String> a = employeerepository.getName();
	String output="";
	for(String e: a) {
	output= output+e;
	}
	return output;
	}
	*/
	public EmployeeH getUser(Integer id) {
	return employeerepository.findById(id).get();
	}
	public void saveUser(EmployeeH Employee) {
		employeerepository.save(Employee);
		}
	
	public EmployeeH saveOrUpdate(EmployeeH employee)
	{
		return employeerepository.save(employee);
	}

	}

