package com.example.mypackage;
//Задача №1
//
//Создать класс Month с полями: имя месяца, количеством дней и количеством рабочих дней.

public final class Month {
    private final String monthName;
    private final int daysMonthNumber;
    private final int workDaysNumber;

    public Month(String monthName, int daysMonthNumber, int workDaysNumber) {
        this.monthName = monthName;
        this.daysMonthNumber = daysMonthNumber;
        this.workDaysNumber = workDaysNumber;
    }

    public int getWorkDaysNumber() {
        return workDaysNumber;
    }
}
