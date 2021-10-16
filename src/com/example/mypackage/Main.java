package com.example.mypackage;

public class Main {

    public static void main(String[] args) {

        Manager manager = new Manager("Manager_Jon",50,'M',40,15);
        Employee employee = new Employee("Employee_Jon",50,'M',40);

        System.out.println(manager.getSalaryM(MonthUtils.monthsOfYear));
        System.out.println(employee.getSumSalary(MonthUtils.monthsOfYear));
    }
}
