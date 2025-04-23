package com.mylearning.helloworld;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class Employeeservimp {
	
	
	 private   List<Employee>employees = new ArrayList<>();
		
 {
	        employees.add(new Employee(1, "Mathesh"));
	        employees.add(new Employee(2, "Bujji"));
	    }

	    public List<Employee> getEmployee() {
	        return employees;
	    }
	    
	    public Employee getEmployeeById(Integer id) {
	        for (Employee e : employees) {
	            if (e.getId() == id) {
	                return e;
	            }
	        }
	        return null; 
	    }
	    public Employee saveEmployee(Employee emp) {
	    	employees.add(emp);
	    	return emp;
	    }
	   
	    	
	    }


