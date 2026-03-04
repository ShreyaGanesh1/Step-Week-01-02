package problem9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(1, "Rahul", 50000));
        employees.add(new Employee(2, "Anita", 35000));
        employees.add(new Employee(3, "Karan", 70000));
        employees.add(new Employee(4, "Sneha", 25000));

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter minimum salary to filter: ");
        double minSalary = scanner.nextDouble();

        System.out.println("\nEmployees with salary >= " + minSalary);

        employees.stream()
                .filter(emp -> emp.getSalary() >= minSalary)
                .forEach(Employee::display);

        scanner.close();
    }
}