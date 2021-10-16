package com.example.mypackage;
//
//Задача №3
//        Необходимо создать класс Manager с полями: имя, возраст, пол, ЗП в день и
//        количество подчиненных. Все поля сделать приватными и для каждого поля добавить
//        методы set и get. Класс должен иметь метод - getSalary(Month[] monthArray),
//        метод возвращает зарплату за те месяцы которые были переданы в качестве аргумента.
//        К рассчитанной ЗП должно прибавляться по 1% за каждого подчиненного.


public class Manager extends  Employee{

    private int numbersSubordinate;

    public Manager(String nameEmployee, int ageEmployee, char genderEmployee, double salaryPerDay, int numbersSubordinate) {
        super(nameEmployee, ageEmployee, genderEmployee, salaryPerDay);
        this.numbersSubordinate = numbersSubordinate;
    }

    @Override
    public double getSumSalary(Month[] monthArray){

        double sumSalary=0;
        for (int i = 0; i < monthArray.length; i++) {
            sumSalary += getSalaryPerDay()*monthArray[i].getWorkDaysNumber();
        }
        sumSalary += sumSalary/100*numbersSubordinate;

        return sumSalary;
    }

    public int getNumbersSubordinate() {
        return numbersSubordinate;
    }
}
