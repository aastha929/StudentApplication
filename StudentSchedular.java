package com.capgemini.service;
import java.util.*;
import com.capgemini.beans.*;
public class StudentSchedular {
	
	    private Student[] students = new Student[10];
		private static int counterStudent=0;
		
		public void addStudent(int rollNo , String name , String[] inputCourses ) {
			
			students[counterStudent++] = new Student ( rollNo , name , inputCourses);
		}
	
	
	public void showAllStudents()
	{
		if(counterStudent == 0) 
			System.out.println("No details present\n");
		else {
		for(int i = 0; i < counterStudent ; i++) {
			String[] course2 = students[i].getCourses();
			System.out.println("RollNo : "+ students[i].getStudentRollNumber());
			System.out.println("Name : "+ students[i].getStudentName());
			System.out.println("Courses : ");
				System.out.println(Arrays.toString(course2)+"\t");
		}
	  }
		
	}
    
	  public void studentDetailsByRollNumber(int enteredRollNumber) {
       
		  if(counterStudent == 0) 
				System.out.println("No details present\n");
		  else {
			for(int i = 0; i < counterStudent  ; i++) {			
			if (students[i].getStudentRollNumber() == enteredRollNumber) {	
				String[] course2 = students[i].getCourses();
				System.out.println("Name : "+ students[i].getStudentRollNumber());
				System.out.println("RollNo : "+ students[i].getStudentName());			
				System.out.println("Courses : ");
					System.out.println(Arrays.toString(course2));
			}
			else
			{
				System.out.println("Entered RollNo is not present\n");
			}
			}
			}
     }
    	  public void studentDetailsByCourseName(String enteredCourseName) {
              
    		  for(int i = 0; i< counterStudent; i++) {
    				String[] course2 = students[i].getCourses();
    				for(int j = 0; j<course2.length ; j++) {
    					if(course2[j].equals(enteredCourseName)) {
    						System.out.println("RollNo : "+ students[i].getStudentRollNumber());
    						System.out.println("Name : "+ students[i].getStudentName());
    						System.out.println("Courses : ");
    							System.out.println(Arrays.toString(course2));
    			     }
    				}
    			}
          }
    	  public void countByCourseName(String courseName)
    	  {
    		  int courseCount= 0;
    			for(int i = 0; i< counterStudent; i++) {
    				String[] course2 = students[i].getCourses();
    				for(int j = 0; j<course2.length ; j++) {
    					if(course2[j].equals(courseName)) {
    						courseCount++;
    						break;
    					}
    						
    				}
    			}
    			System.out.println("No of students enrolled in "+ courseName + " is " +courseCount);	  
    	  }
    	  public  boolean validation (int rollNo) {	
    			for(int j = 0; j < counterStudent ; j++) {
    				if(rollNo == students[j].getStudentRollNumber()) {
    					System.out.println("Roll No already Exist!! Try giving new RollNo..\n");
    					return true;
    				}
    				
    		}return false;
    	  }
}
