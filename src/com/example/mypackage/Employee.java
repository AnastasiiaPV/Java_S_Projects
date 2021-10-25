package com.example.mypackage;
//Задача №2
//
//Необходимо создать класс Employee с полями: имя, возраст, пол и ЗП в день.
// Все поля сделать приватными и для каждого поля добавить методы set и get.
// Класс должен иметь метод - getSalary(Month[] monthArray),
// метод возвращает зарплату за те месяцы которые были переданы в качестве аргумента.
public final class Employee extends BaseEmployee{

    public Employee(String nameEmployee, int ageEmployee, char genderEmployee, double salaryPerDay) {
        super(nameEmployee,ageEmployee,genderEmployee,salaryPerDay);
    }

    public double getSumSalary(Month[] monthArray){
        double sumSalary=0;

        for(Month month : monthArray){
            sumSalary += getSalaryPerDay() * month.getWorkDaysNumber();
        }
        return sumSalary;
    }
}
