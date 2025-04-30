package com.jbk;

import java.util.Scanner;

public class EmployeeMain {
	public static void main(String[] args) {
		EmployeeDao dao =new EmployeeDao();
		Scanner sc =new Scanner(System.in);
		System.out.println("1. Insert Employee");
		System.out.println("enter choice");
	  int choice =sc.nextInt();
	   
	  switch(choice) {
	  case 1: 
		  System.out.println("enter Employee name and age");
		  Employee employee = new Employee(sc.next(),sc.nextInt());
	      dao.addEmployee(employee);
	  
	  break;
	  }
	}

}
