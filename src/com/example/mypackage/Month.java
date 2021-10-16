package com.example.mypackage;
//Задача №1
//
//Создать класс Month с полями: имя месяца, количеством дней и количеством рабочих дней.

public class Month {
    private String monthName;
    private int daysMonthNumber;
    private int workDaysNumber;

    public Month(String monthName, int daysMonthNumber, int workDaysNumber) {
        this.monthName = monthName;
        this.daysMonthNumber = daysMonthNumber;
        this.workDaysNumber = workDaysNumber;
    }
}
