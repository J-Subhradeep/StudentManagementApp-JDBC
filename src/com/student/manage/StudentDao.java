package com.student.manage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentDao {
	public static boolean insertStudent(Student st) {
		
		try {
			Connection con = CP.createC();
			String q = "insert into students(student_name,student_email) values(?,?)";
			
			//prapered statement
			PreparedStatement pstmt = con.prepareStatement(q);
			// set the values of params
			pstmt.setString(1, st.getStudent_name());
			pstmt.setString(2, st.getStudent_email());
			
			// execute..
			pstmt.executeUpdate();
			con.close();
			return true;
		}catch(Exception e) {
			
			return false;
		}
	}

	public static boolean deleteStudent(int id) {
		// TODO Auto-generated method stub
		try {
			Connection con = CP.createC();
			String q = "delete from students where student_id=?";
			
			//prapered statement
			PreparedStatement pstmt = con.prepareStatement(q);
			// set the values of params
			pstmt.setInt(1, id);

			
			// execute..
			pstmt.executeUpdate();
			con.close();
			return true;
		}catch(Exception e) {
			return false;
		}

	}

	public static void showStudents() {
		// TODO Auto-generated method stub
		try {
			Connection con = CP.createC();
			String q = "select * from students";
			Statement pstmt = con.createStatement();
			// execute..
			ResultSet res = pstmt.executeQuery(q);
			
			while(res.next()) {
				int id = res.getInt("student_id");
				String name  = res.getString("student_name");
				String email = res.getString("student_email");
				Student st = new Student(name,email);
				System.out.println(id+":"+st);
				
			}
			con.close();
	
		}catch(Exception e) {
		
		}
	}
}
