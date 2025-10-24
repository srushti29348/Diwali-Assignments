package com.demo.test;

import java.io.*;
import java.util.*;

import com.demo.beans.Employee;

public class EmployeeManagment {
    public static void main(String[] args) {
        ArrayList<Employee> empList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Add Employee to list");
            System.out.println("2. Remove Employee from list");
            System.out.println("3. Show all Employees");
            System.out.println("4. Show all Employees in sorted order (by empID)");
            System.out.println("5. Find Employee by Name");
            System.out.println("6. Save all Employees into file");
            System.out.println("7. Quit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter Employee ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Employee Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Employee Role (or press Enter for default 'Staff'): ");
                    String role = sc.nextLine();

                    Employee emp;
                    if (role.isEmpty()) {
                        emp = new Employee(id, name); 
                    } else {
                        emp = new Employee(id, name, role);
                    }

                    empList.add(emp);
                    System.out.println("Employee added successfully!");
                    break;

                case 2:
                    System.out.print("Enter Employee ID to remove: ");
                    int removeID = sc.nextInt();
                    sc.nextLine();

                    boolean removed = empList.removeIf(e -> e.getEmpId() == removeID);
                    if (removed)
                        System.out.println("Employee removed successfully!");
                    else
                        System.out.println(" Employee not found!");
                    break;

                case 3:
                    if (empList.isEmpty())
                        System.out.println("No Employees to show.");
                    else
                        empList.forEach(System.out::println);
                    break;

                case 4:
                    if (empList.isEmpty()) {
                        System.out.println("No Employees to sort.");
                    } else {
                        empList.sort(Comparator.comparing(Employee::getEmpId));
                        System.out.println("Sorted Employee List:");
                        empList.forEach(System.out::println);
                    }
                    break;

                case 5:
                    System.out.print("Enter Employee Name to find: ");
                    String searchName = sc.nextLine();
                    boolean found = false;
                    for (Employee e : empList) {
                        if (e.getEmpName().equalsIgnoreCase(searchName)) {
                            System.out.println(e);
                            found = true;
                        }
                    }
                    if (!found)
                        System.out.println(" Employee not found.");
                    break;

                case 6:
                    try (PrintWriter writer = new PrintWriter(new FileWriter("employees.txt"))) {
                        for (Employee e : empList) {
                            writer.println(e);
                        }
                        System.out.println(" All Employees saved to employees.txt successfully!");
                    } catch (IOException e) {
                        System.out.println("Error writing to file: " + e.getMessage());
                    }
                    break;

                case 7:
                    System.out.println("Exiting program");
                    break;

                default:
                    System.out.println("Invalid choice! Please enter again");
            }

        } while (choice != 7);

        sc.close();
    }
}

