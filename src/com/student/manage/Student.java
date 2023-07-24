package com.student.manage;

public class Student {
	private String student_name;
	private String student_email;
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public String getStudent_email() {
		return student_email;
	}
	public void setStudent_email(String student_email) {
		this.student_email = student_email;
	}
	public Student(String student_name, String student_email) {
		super();
		this.student_name = student_name;
		this.student_email = student_email;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [student_name=" + student_name + ", student_email=" + student_email + "]";
	}
	
	
}
