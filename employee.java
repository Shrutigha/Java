package com.demo;
import java.util.Scanner;
public class Lab {

	public static void main(String[] args) {
		
		        // Creating a Scanner object to take input from the user
		        Scanner scanner = new Scanner(System.in);

		        // Prompting the user for Employee details
		        System.out.println("Enter Employee ID: ");
		        int employeeId = scanner.nextInt(); // Reading Employee ID
		        scanner.nextLine(); // Consume the leftover newline

		        System.out.println("Enter Employee Name: ");
		        String employeeName = scanner.nextLine(); // Reading Employee Name

		        System.out.println("Enter Employee Address: ");
		        String employeeAddress = scanner.nextLine(); // Reading Employee Address

		        System.out.println("Enter Employee Salary: ");
		        double employeeSalary = scanner.nextDouble(); // Reading Employee Salary

		        // Displaying the Employee details
		        System.out.println("\nEmployee Details:");
		        System.out.println("ID: " + employeeId);
		        System.out.println("Name: " + employeeName);
		        System.out.println("Address: " + employeeAddress);
		        System.out.println("Salary: $" + employeeSalary);

		        // Closing the scanner
		        scanner.close();
		    }
	}


OUTPUT

Enter Employee ID: 
1
Enter Employee Name: 
shruti
Enter Employee Address: 
satara
Enter Employee Salary: 
25000

Employee Details:
ID: 1
Name: shruti
Address: satara
Salary: $25000.0