package com.mylearning.helloworld;

public class Employee {
	    private Integer id;
	    private String name;

	    public Employee() {} 

	    public Employee(Integer id, String name) {
	        this.id = id;
	        this.name = name;
	    }
	    public void setId(Integer id) {
	    	this.id=id;
	    	
	    	
	    }
	    public void setName(String name) {
	    	this .name= name;
	    }
	    
	    public Integer getId() { return id; }
	    public String getName() { return name; }
	}

