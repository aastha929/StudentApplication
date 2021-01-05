package com.capgemini.view;
import com.capgemini.service.*;
import java.util.*;

public class Admin {
	private static Scanner sc = new Scanner(System.in);
	private  StudentSchedular stuScheObj = new StudentSchedular();
	
	private void studentDetailsByCourseName() {
		System.out.println("Enter course name :\n");
		String courseName = sc.next();
		stuScheObj.studentDetailsByCourseName(courseName);
	}
	
	private void showAllStudents() {
		stuScheObj.showAllStudents();
	}
	
	private void studentDetailsByRollNumber() {
		System.out.println("Enter RollNo of the student to be displayed\n");
		int rollNo = sc.nextInt();
		stuScheObj.studentDetailsByRollNumber(rollNo);
	}
	
	private void countByCourseName() {
		System.out.println("Enter the course name :\n");
		String courseName = sc.next();
		stuScheObj.countByCourseName(courseName);
	}
	private void addStudent() {
		int rol;
		do {
		System.out.println("Enter Roll No : \n");
		rol = sc.nextInt();
		} while(stuScheObj.validation(rol));
		
		System.out.println("Enter Name : \n");
		String name = sc.next();
		
		System.out.println("How many courses do you want to register?\n");
		int courseCount = sc.nextInt();
		
		String[] inputCourses = new String[courseCount];
		for ( int j = 0 ; j < courseCount; j++) {
			inputCourses[j] = sc.next();
		}
		stuScheObj.addStudent(rol,name,inputCourses);
	}
	public static void main(String[] args) 
	{
	 
	 Admin studSch = new Admin();
		
		int choice;
		while(true)
		{
			System.out.println("1.Add student");
			System.out.println("2.Show all students");
			System.out.println("3.Show student details by roll number");
			System.out.println("4.Show student details by course name");
			System.out.println("5.show count by course name");
			System.out.println("6.exit");
			
			System.out.println("Enter your choice");
			choice=sc.nextInt();
			
			
			switch(choice)
			{
			case 1:studSch.addStudent();
			       break;
			       
			 case 2:studSch.showAllStudents();
			        break;
			       
			 case 3:studSch.studentDetailsByRollNumber();
		        break;
		     
		        
			 case 4:studSch.studentDetailsByCourseName();
		        break;
		      
		        
			 case 5:studSch.countByCourseName();
		        break;
		      
			 case 6: System.exit(0);
			  
			 default:System.out.println("Sorry entered wrong choice");	   
			   
			}
			
		}
		
	}

}	