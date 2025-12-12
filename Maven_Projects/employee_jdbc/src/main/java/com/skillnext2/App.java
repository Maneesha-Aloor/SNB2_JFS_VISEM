package com.skillnext2;

import java.util.List;

public class App {
    public static void main(String[] args) {
        try {
            EmployeeDAO dao = new EmployeeDAO();

            // Add employee
            Employee e1 = new Employee("John Doe", "john@example.com", 50000);
            dao.addEmployee(e1);
            System.out.println("Employee added successfully.");

            // Fetch employees
            List<Employee> employees = dao.getAllEmployees();
            System.out.println("Employees in DB:");
            for (Employee e : employees) {
                System.out.println("  " + e);
            }

        } catch (Exception ex) {
            System.err.println("Error running app:");
            ex.printStackTrace();
        }
    }
}
