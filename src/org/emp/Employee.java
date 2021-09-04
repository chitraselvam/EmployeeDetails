package org.emp;

public class Employee {
	//empId(),empName(),empDob(),empPhone(),empEmail(),empAddress()
	
	public void empId() {
		// TODO Auto-generated method stub
System.out.println("Employee Id is 40220");
	}
	public void empName() {
		// TODO Auto-generated method stub
System.out.println("Employee name is chitra");
	}
	public void empDob() {
		// TODO Auto-generated method stub
System.out.println("Employee DOB is 11/10/1988");
	}
	public void empPhone() {
		// TODO Auto-generated method stub
System.out.println("1234567890");
	}
	public void empEmail() {
		// TODO Auto-generated method stub
System.out.println("nchitra2015@gmail.com");
	}
	public void empAddress() {
		// TODO Auto-generated method stub
		System.out.println("chennai");

	}
	public void empGender() {
		// TODO Auto-generated method stub
		System.out.println("female");

	}
	public static void main (String [] args)
	{
		Employee x = new Employee();
		x.empAddress();
		x.empDob();
		x.empEmail();
		x.empId();
		x.empName();
		x.empPhone();
	}
	}


