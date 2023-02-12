package com.springcore;


//this is a pojo class or simple java class 
// we will create object or bean of this class using spring container. we wont manually create it using new keyword 
public class Student {
	
	private int studentId;
	private String studentName;
	private String studentAddress;
	
	// constructors
	public Student(int studentId, String studentName, String studentAddress) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
	}
	
	public Student() {
		super();
	}
	
	
	
	
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAddress=" + studentAddress
				+ "]";
	}

	//getter and setters
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		System.out.println("Setter called by setStudentId() ");
		this.studentId = studentId;
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String studentName) {
		System.out.println("Setter called by setStudentName() ");
		this.studentName = studentName;
	}
	
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		System.out.println("Setter called by setStudentAddress() ");
		this.studentAddress = studentAddress;
	}
	
	
	
	
}
