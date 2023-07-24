package example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

import com.student.manage.Student;
import com.student.manage.StudentDao;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Student Management App");
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		try {
			
		
		while(true) {
			System.out.println("Press 1 to add student");
			System.out.println("Press 2 to delete student");
			System.out.println("Press 3 to display students");
			System.out.println("Press 4 to add student");
			int data = Integer.parseInt(bf.readLine());
			if(data==1) {
				// add student;
				System.out.print("Enter user name :");
				String name = bf.readLine();
				System.out.print("Enter user email : ");
				String email = bf.readLine();
				
				//create student object to store student
				Student st = new Student(name,email);
				boolean ans = StudentDao.insertStudent(st);
				String res = ans?"Student added":"Error";
				System.out.println(res);
				System.out.println(st);
			}
			else if(data==2) {
				// delete students;
				System.out.println("Enter student ID :");
				int id = Integer.parseInt(bf.readLine());
				boolean ans = StudentDao.deleteStudent(id);
				String res = ans?"Student deleted":"Error";
				System.out.println(res);
			
			}
			else if(data == 3) {
				// show students;
				StudentDao.showStudents();
			}
			else if(data==4) {
				//exit;
				
				break;
			}
			else {
				System.out.println("Give a proper intput");
			}
		}
		
		}catch(Exception e) {
			System.out.println("Error in application");
		}
	}

}
