package com.example.mypackage;
//Задача №2
//
//Необходимо создать класс Employee с полями: имя, возраст, пол и ЗП в день.
// Все поля сделать приватными и для каждого поля добавить методы set и get.
// Класс должен иметь метод - getSalary(Month[] monthArray),
// метод возвращает зарплату за те месяцы которые были переданы в качестве аргумента.
public class Employee{

    private String nameEmployee;
    private int ageEmployee;
    private char genderEmployee;
    private double salaryPerDay;

    public Employee(String nameEmployee, int ageEmployee, char genderEmployee, double salaryPerDay) {
        this.nameEmployee = nameEmployee;
        this.ageEmployee = ageEmployee;
        this.genderEmployee = genderEmployee;
        this.salaryPerDay = salaryPerDay;
    }

    public double getSumSalary(Month[] monthArray){
        double sumSalary=0;

//        for (int i = 0; i < monthArray.length; i++) {
//            sumSalary += salaryPerDay * monthArray[i].getWorkDaysNumber();
//        }
        for(Month month : monthArray){
            sumSalary += salaryPerDay * month.getWorkDaysNumber();
        }
        return sumSalary;
    }

    public String getNameEmployee(){
        return nameEmployee;
    }

    public void setNameEmployee(String nameEmployee){
        this.nameEmployee = nameEmployee;
    }

    public int getAgeEmployee() {
        return ageEmployee;
    }

    public void setAgeEmployee(int ageEmployee) {
        this.ageEmployee = ageEmployee;
    }

    public char getGenderEmployee() {
        return genderEmployee;
    }

    public void setGenderEmployee(char genderEmployee) {
        this.genderEmployee = genderEmployee;
    }

    public void setSalary(double salaryPerDay) {
        this.salaryPerDay= salaryPerDay;
    }

    public double getSalaryPerDay() {
        return salaryPerDay;
    }
}
