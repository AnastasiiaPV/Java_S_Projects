package com.example.mypackage;

public abstract class BaseEmployee {

    private final String nameEmployee;
    private final int ageEmployee;
    private final char genderEmployee;
    private final double salaryPerDay;

    public BaseEmployee(String nameEmployee, int ageEmployee, char genderEmployee, double salaryPerDay) {
        this.nameEmployee = nameEmployee;
        this.ageEmployee = ageEmployee;
        this.genderEmployee = genderEmployee;
        this.salaryPerDay = salaryPerDay;
    }

    public String getNameEmployee() {
        return nameEmployee;
    }

    public int getAgeEmployee() {
        return ageEmployee;
    }

    public char getGenderEmployee() {
        return genderEmployee;
    }

    public double getSalaryPerDay() {
        return salaryPerDay;
    }

    public abstract double getSumSalary(Month[] monthArray);
}
