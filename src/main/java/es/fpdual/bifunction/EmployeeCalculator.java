package es.fpdual.bifunction;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

import es.fpdual.model.Employee;

public class EmployeeCalculator {
    public List<Double> calculate(BiFunction<Double, Double, Double> bi, List<Employee> employeeList,
            Double increment) {

        List<Double> salaryList = new ArrayList<>();

        for (Employee employee : employeeList) {
            salaryList.add(bi.apply(employee.getSalary(), increment));
        }

        return salaryList;
    }
}
