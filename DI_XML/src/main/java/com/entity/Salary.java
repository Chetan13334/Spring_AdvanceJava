package com.entity;

public class Salary {

	private String salary;

	public Salary(String salary) {
		super();
		this.salary = salary;
	}

	public Salary() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Salary [salary=" + salary + "]";
	}

	
}
