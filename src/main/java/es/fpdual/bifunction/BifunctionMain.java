package es.fpdual.bifunction;

import java.util.Arrays;
import java.util.List;

import es.fpdual.model.Employee;

public class BifunctionMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        EmployeeCalculator employeeCalculator = new EmployeeCalculator();

        String numberResult = calculator.calculate((x, y) -> ": " + (x * y), 81, 2);
        System.out.println("Calculator result is " + numberResult);

        List<Employee> employeeList = Arrays.asList(
                new Employee("Juan", 1200.4),
                new Employee("Fran", 2000.4),
                new Employee("Pepe", 500.15));

        List<Double> salaries = employeeCalculator
                .calculate((salary, increment) -> salary + (salary * (increment / 100)), employeeList, 16.0);

        for (Double salary : salaries) {
            System.out.println("Salary incremented: " + salary);
        }

    }
}
