package com.mylearning.helloworld;



import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	 
	 private Employeeservimp Employeeservice;
	 
	 public Controller(Employeeservimp Employeeservice) {
		 this.Employeeservice=Employeeservice;
	 }
	 
	 @GetMapping("/Employee")
	 public List<Employee> getAllEmployees() {
	        return Employeeservice.getEmployee();
	    }
	 
	    @GetMapping("/Employee/{id}")
	    public Employee getEmployeeById (@PathVariable  Integer id) {
	    	return Employeeservice.getEmployeeById(id);
	    	
	    }
	    @PostMapping("/Employee")
	    	public void saveEmployee (@RequestBody Employee em) {
	    		Employeeservice.saveEmployee(em);
	    	}
	    
	    
	    }

//lombok implemnet
//get by id 
//baldung
