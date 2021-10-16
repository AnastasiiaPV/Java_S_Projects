package com.example.mypackage;
//
//Задача №3
//        Необходимо создать класс Manager с полями: имя, возраст, пол, ЗП в день и
//        количество подчиненных. Все поля сделать приватными и для каждого поля добавить
//        методы set и get. Класс должен иметь метод - getSalary(Month[] monthArray),
//        метод возвращает зарплату за те месяцы которые были переданы в качестве аргумента.
//        К рассчитанной ЗП должно прибавляться по 1% за каждого подчиненного.


public class Manager{

    private String nameManager;
    private int ageManager;
    private char genderManager;
    private double salaryPerDayManager;
    private int numbersSubordinate;

    public Manager(String nameManager, int ageManager, char genderManager, double salaryPerDayManager,
                   int numbersSubordinate) {

        this.nameManager = nameManager;
        this.ageManager = ageManager;
        this.genderManager = genderManager;
        this.salaryPerDayManager = salaryPerDayManager;
        this.numbersSubordinate = numbersSubordinate;
    }

    public double getSalaryM(Month[] monthArray){

        double sumSalary=0;
        for (int i = 0; i < monthArray.length; i++) {
            sumSalary += salaryPerDayManager;
        }
        sumSalary += sumSalary/100*numbersSubordinate;
        return sumSalary;
    }

    public String getNameManager() {
        return nameManager;
    }

    public void setNameManager(String nameManager) {
        this.nameManager = nameManager;
    }

    public int getAgeManager() {
        return ageManager;
    }

    public void setAgeManager(int ageManager) {
        this.ageManager = ageManager;
    }

    public char getGenderManager() {
        return genderManager;
    }

    public void setGenderManager(char genderManager) {
        this.genderManager = genderManager;
    }

    public void setSalaryPerDayManager(double salaryPerDayManager) {
        this.salaryPerDayManager = salaryPerDayManager;
    }

    public int getNumbersSubordinate() {
        return numbersSubordinate;
    }

    public void setNumbersSubordinate(int numbersSubordinate) {
        this.numbersSubordinate = numbersSubordinate;
    }
}
