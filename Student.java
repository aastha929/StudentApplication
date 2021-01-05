package com.capgemini.beans;

public class Student {
	private int studentRollNumber;
	private String studentName;
	private String[] courses;
	public Student (int rollNo , String name, String[] courses) {
		
		this.studentRollNumber = rollNo;
		this.studentName = name;
		this.courses = courses;
	}
	public String[] getCourses() {
		return courses;
	}
	public void setCourses(String[] courses) {
		this.courses = courses;
	}
	
	public int getStudentRollNumber() {
		return studentRollNumber;
	}
	public void setStudentRollNumber(int s) {
		this.studentRollNumber = s;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	

}
