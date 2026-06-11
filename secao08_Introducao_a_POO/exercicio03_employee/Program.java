package appexercicio02;


import entities03.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main (String args[]) {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    Employee employee = new Employee();

        System.out.println("Enter the Employee Name");
        employee.name = sc.nextLine();

        System.out.println("Enter the Employee Salary");
        employee.grossSalary  = sc.nextDouble();

        System.out.println("Enter the Tax");
        employee.tax = sc.nextDouble();

        System.out.println("Employee: " + employee.name + " $" + employee.netSalary());

        System.out.println("Which percentage to increase salary?");
        double percentage = sc.nextDouble();

        employee.increaseSalary(percentage);

        System.out.println("Updated data: " + employee.name + " $" + employee.netSalary());




    sc.close();

    }
}
